package шаблоны_поведенческие_behavioral.Observer_Listener_Наблюдатель_Слушатель.ex3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Parishioner implements PropertyChangeListener {
    private String name;

    public Parishioner(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
    }

    public void setNews(String news) {
        System.out.println(name + " узнал новость: " + news);
    }
}
