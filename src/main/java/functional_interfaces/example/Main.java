package functional_interfaces.example;

public class Main {
    public static void main(String[] args) {
        // Предположим у нас есть Dog, и нам нужно на основе его полей создать объект Raccoon.
        // То есть Converter конвертирует обхект одного типа в другой.

        Dog dog = new Dog("Bobbie", 5, 3);
        Converter<Dog, Raccoon> converter = x -> new Raccoon(x.name, x.age, x.weight);

        Raccoon raccoon = converter.convert(dog);

        System.out.println(String.format("Raccoon has parameters: name - %s, age - %d, weight - %d", raccoon.name, raccoon.age, raccoon.weight));

    }
}
