package переопределение_статического_метода;

public class B extends A {

    // Сокрытие. Добавим статический метод print в классе B мы скрыли метод класса A.
    public static void print() {
        System.out.println("Статический метод класса B");
    }

    public static void a() {
        print();
    }


}
