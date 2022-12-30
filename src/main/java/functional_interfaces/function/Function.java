package functional_interfaces.function;
/*
Принимает аргумент T и приводит его к объекту типа R, который и возращается как результат.
 */
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
