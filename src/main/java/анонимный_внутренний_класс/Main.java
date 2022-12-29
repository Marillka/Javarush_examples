package анонимный_внутренний_класс;

// тоже самое можно сделать и с интерфейсом. Просто будет создаваться класс, который имплементит данный интерфейс.
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal() {};
        // public class MainApp$1 extends Animal {
        //
        // }
        // Animal a = new MainApp$1();
        a.meow();
        System.out.println(a.getClass().getName());

        // Output:
        // Meow
        // анонимный_внутренний_класс.Main$1
    }
}
