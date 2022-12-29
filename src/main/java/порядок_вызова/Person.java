package порядок_вызова;

class Person {
    private String name;
    private int age;

    static {
        System.out.println("Выполнение статического блока инициализации Person");
    }

    {
        System.out.println("Выполнение блока инициализации Person");
    }

    public Person(String name, int age) {
        System.out.println("Выполнение конструктора Person");
        this.name = name;
        this.age = age;
    }
}

