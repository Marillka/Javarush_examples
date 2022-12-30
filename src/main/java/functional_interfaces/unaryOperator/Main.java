package functional_interfaces.unaryOperator;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Integer> lambdaSquareValue = x -> x * x;
        System.out.println(lambdaSquareValue.apply(10));

        UnaryOperator<Integer> anonSquareValue = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * integer;
            }
        };

        System.out.println(anonSquareValue.apply(5));


        /*
         iterate() - схож с generate, но имеет два аргумента.
         первый - элемент, с которого начинается генерация последовательности.
         второй - UnaryOperator, который указывает принцип генерации новых элементов с первого элемента.
         */

        Stream.iterate(9, x -> x * x)
                .limit(4)
                .forEach(System.out::println);

        /*
        9
        81
        6561
        43046721


         */


    }
}
