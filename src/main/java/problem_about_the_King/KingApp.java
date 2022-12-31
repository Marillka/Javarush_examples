package problem_about_the_King;

import java.util.*;
import java.util.stream.Collectors;

public class KingApp {
    public static class Human implements Comparable<Human>{
        private String name;
        private Human suzerain;
        private Set<Human> vassals;

        public Human(String name) {
            this.name = name;
            this.suzerain = null;
            this.vassals = new TreeSet<>();
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }

            return this.name.equals(((Human) o).name);
        }

        @Override
        public String toString() {
            return name + ": " + this.vassals.stream().map(Human::toString).collect(Collectors.joining(", "));
        }

        @Override
        public int compareTo(Human o) {
            return this.name.compareTo(o.name);
        }
    }


    private static final List<String> pollResults = Arrays.asList(
            "служанка Аня",
            "управляющий Семен Семеныч: крестьянин Федя, доярка Нюра",
            "дворянин Кузькин: управляющий Семен Семеныч, жена Кузькина, экономка Лидия Федоровна",
            "экономка Лидия Федоровна: дворник Гена, служанка Аня",
            "доярка Нюра",
            "кот Василий: человеческая особь Катя",
            "дворник Гена: посыльный Тошка",
            "киллер Гена",
            "зажиточный холоп: крестьянка Таня",
            "секретарь короля: зажиточный холоп, шпион Т",
            "шпион Т: кучер Д",
            "посыльный Тошка: кот Василий",
            "аристократ Клаус",
            "просветленный Антон"
    );

    public static void main(String[] args) {
//        String[] arr = "A: B, C, D".split("[:,]");
        Set<Human> humans = pollResults.stream()
                .map(s -> s.split("[:,]"))
                .flatMap(Arrays::stream)
                .map(String::trim)
                .map(Human::new)
                .collect(Collectors.toSet());
        Human king = new Human("King");


        pollResults.stream()
                .map(s -> s.split(":"))
                .filter(s -> s.length > 1)
                .forEach(array -> {
                    Human suzerain = findHuman(humans, array[0]);
                    Arrays.stream(array[1].split(","))
                            .map(String::trim)
                            .map(vassalName -> findHuman(humans, vassalName))
                            .forEach(vassal -> {
                                suzerain.vassals.add(vassal);
                                vassal.suzerain = suzerain;
                            });

                });

        humans.stream().filter(h -> h.suzerain == null).forEach(h -> {
            h.suzerain = king;
            king.vassals.add(h);
        });


        System.out.println(king);
    }

    public static Human findHuman(Set<Human> humans, String name) {
        return humans.stream()
                .filter(h -> h.name.equals(name))
                .findFirst()
                .get();
    }


}
