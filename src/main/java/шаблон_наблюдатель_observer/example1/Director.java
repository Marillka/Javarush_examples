package шаблон_наблюдатель_observer.example1;

import java.util.List;

public class Director implements Observer{
    @Override
    public void event(List<String> strings) {
        System.out.println("The list of students has changes: " + strings);
    }
}
