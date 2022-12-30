package functional_interfaces.supplier;
/*
Поставщик
Не принимает аргументов, но возвращает некоторый объект типа T
 */
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
