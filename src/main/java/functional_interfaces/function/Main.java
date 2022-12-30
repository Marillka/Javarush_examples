package functional_interfaces.function;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Function<String, Integer> lambdaValueConverter = x -> Integer.valueOf(x);
        System.out.println(lambdaValueConverter.apply("656"));


        Function<String, Integer> anonValueConverter = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        };

        System.out.println(anonValueConverter.apply("535"));

        // map() - принимает элементы одного типа, что-то с ними делает и передает дальше, но это уже могут быть элементы другого типа.
        List<Integer> values = Stream.of("32", "43", "76", "56", "3")
                .map(x -> Integer.valueOf(x)).collect(Collectors.toList());
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
