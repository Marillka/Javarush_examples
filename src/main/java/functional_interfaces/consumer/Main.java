package functional_interfaces.consumer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        Consumer<String> anonGreetings = new Consumer<String>() {
            @Override
            public void accept(String x) {
                System.out.println("Hello " + x);
            }
        };

        Consumer<String> lambdaGreetings = x -> System.out.println("Hello " + x);


        anonGreetings.accept("Valery");
        lambdaGreetings.accept("not Valery");



        /*
         испльзование в peek().
         Но так как метод peek() работает с Consumer, модификации строк в Stream не произойдет, а сам peek() вернет Stream с изначальными элементами.

         Также есть часто используемый метод foreach, который аналогичен методу peek(), но разница состоит в том, что он конечный - терминальный.
         */
        List<String> peopleGreetings = Stream.of("Elena", "John", "Alex", "Sara")
                .peek(x -> System.out.println("Hello " + x))
                .collect(Collectors.toList());


    }
}
