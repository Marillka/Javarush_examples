package шаблоны_поведенческие_behavioral.ChainOfResponsobility_ЦепочкаОбязанностей.ex2;

import java.util.ArrayList;
import java.util.List;

public class Chain {

    private List<ChainItem> chain;

    public Chain() {
        chain = new ArrayList<>();
    }


    public void add(ChainItem... items) {
        chain.addAll(List.of(items));
    }

    public Object process(Object o) {
        Object current = o;
        for (ChainItem chainItem : chain) {
            current = chainItem
                    .consume(current);
        }
        return current;
    }

}
