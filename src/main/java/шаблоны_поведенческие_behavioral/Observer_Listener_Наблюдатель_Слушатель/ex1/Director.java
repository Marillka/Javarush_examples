package шаблоны_поведенческие_behavioral.Observer_Listener_Наблюдатель_Слушатель.ex1;

import java.util.List;

public class Director implements Observer{
    @Override
    public void event(List<String> strings) {
        System.out.println("The list of students has changes: " + strings);
    }
}
