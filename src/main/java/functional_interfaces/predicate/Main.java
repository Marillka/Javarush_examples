package functional_interfaces.predicate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> lambdaIsEvenNumber = x -> x % 2 == 0;

        Predicate<Integer> anonLambdaIsEvenNumber = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };


        System.out.println(lambdaIsEvenNumber.test(4));
        System.out.println(lambdaIsEvenNumber.test(3));


        System.out.println(anonLambdaIsEvenNumber.test(19));
        System.out.println(anonLambdaIsEvenNumber.test(20));


        // Использование в filter
        List<Integer> evenNumbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        ;
    }
}
