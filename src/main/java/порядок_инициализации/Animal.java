package порядок_инициализации;

public class Animal {
    private String name;
    private int age;

    static {
        System.out.println("Выполнение статического блока инициализации Animal");
    }

    {
        System.out.println("Выполнение блока инициализации Animal");
    }

    public Animal(String name, int age) {
        System.out.println("Выполнение контруктора Animal");
        this.name = name;
        this.age = age;
    }
}
