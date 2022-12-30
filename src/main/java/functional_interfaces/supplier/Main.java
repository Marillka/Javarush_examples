package functional_interfaces.supplier;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Elena");
        nameList.add("John");
        nameList.add("Alex");
        nameList.add("Jim");
        nameList.add("Sara");

        Supplier<String> lambdaRandomName = () -> {
            int value = (int) (Math.random() * nameList.size());
            return nameList.get(value);
        };

        Supplier<String> anonRandomName = new Supplier() {
            @Override
            public Object get() {
                int value = (int) (Math.random() * nameList.size());
                return nameList.get(value);
            }
        };

        System.out.println(lambdaRandomName.get());
        System.out.println(anonRandomName.get());


        /*
        Испльзование в generate() - генерирует бесконечную последовательность на основе переданного ему функционального интерфейса.
         */
        Stream.generate(() -> {
            int value = (int) (Math.random() * nameList.size());
            return nameList.get(value);
        }).limit(5).forEach(System.out::println);

    }
}
