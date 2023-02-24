package шаблоны_архитекрурные.arch2_money;

import шаблоны_архитекрурные.arch1_object_value.Pair;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        шаблоны_архитекрурные.arch1_object_value.Pair<Integer, Integer> p1 = new шаблоны_архитекрурные.arch1_object_value.Pair<>(1, 1);
        шаблоны_архитекрурные.arch1_object_value.Pair<Integer, Integer> p2 = new шаблоны_архитекрурные.arch1_object_value.Pair<>(1, 1);

        Map<Pair<Integer, Integer>, Integer> map = new HashMap<>();

        map.put(p1, 1);
        map.put(p2, 1);

        System.out.println(map.size());

        System.out.printf("%.16f", 1/3.);
        System.out.println();
        System.out.printf("%.16f", 1/3f);

        System.out.println();
        System.out.printf("%.16f", 1/6.);
        System.out.println();
        System.out.printf("%.16f", 1/6f);

        // во float неточность на 8 знаке
        // в double неточность на 16 знаке
        // то есть double гарантирует 16 знаков, дальше гарантии нет.


        System.out.println();
        System.out.println();
    }
}
