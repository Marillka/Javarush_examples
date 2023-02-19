package шаблоны_поведенческие_behavioral.Memento_Хранитель;

import java.util.ArrayList;
import java.util.List;

public class SaveUser {
    private List<Memento> list = new ArrayList<>();

    public void add(Memento memento) {
        list.add(memento);
    }
}
