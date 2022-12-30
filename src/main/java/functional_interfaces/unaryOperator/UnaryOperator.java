package functional_interfaces.unaryOperator;

/*
Принимает в качестве параметра объект типа T, выполняет над ним некоторые операции и возращает результат операций в виде объекта того же типа T.
 */
@FunctionalInterface
public interface UnaryOperator<T> {
    T apply (T t);

}
