package functional_interfaces.consumer;

/*
Потребитель. Принимает в качестве аргумента объект типа T, совершает некоторое действие, но при этом ничего не возвращает.
 */
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
