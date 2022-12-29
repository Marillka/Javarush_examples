package порядок_вызова;

class Manager extends Person {
    static {
        System.out.println("Выполнение статического блока инициализации Manager");
    }

    {
        System.out.println("Выполнение блока инициализации Manager");
    }

    private String post;

    public Manager(String name, int age) {
        super(name, age);
        System.out.println("Конструктор менеджера");
    }
}

