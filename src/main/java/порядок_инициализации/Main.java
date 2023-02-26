package порядок_инициализации;

/*
Выполнение статического блока инициализации Animal
Выполнение статического блока инициализации Cat
Выполнение блока инициализации Animal
Выполнение контруктора Animal
Выполнение блока инициализации Cat
Выполнение контруктора Cat
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Vasya", 12);
    }
}
