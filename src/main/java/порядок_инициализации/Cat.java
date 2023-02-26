package порядок_инициализации;

public class Cat extends Animal{

    static {
        System.out.println("Выполнение статического блока инициализации Cat");
    }

    {
        System.out.println("Выполнение блока инициализации Cat");
    }

    public Cat(String name, int age) {
        super(name, age);
        System.out.println("Выполнение контруктора Cat");
    }
}
