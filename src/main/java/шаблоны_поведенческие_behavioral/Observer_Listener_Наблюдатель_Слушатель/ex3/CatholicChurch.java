package шаблоны_поведенческие_behavioral.Observer_Listener_Наблюдатель_Слушатель.ex3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CatholicChurch {
    private String news;
    // Используя support можно добавлять или удалять прихожан (слущателей)
    private PropertyChangeSupport support;

    public CatholicChurch() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setNews(String value) {
        support.firePropertyChange("news", this.news, value);
        this.news = value;
    }


}
