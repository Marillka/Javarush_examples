package functional_interfaces.predicate;

/*
Используется для проверки некоторого условия.
Если условие соблюдается возвращает true, иначе false;
 */
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
