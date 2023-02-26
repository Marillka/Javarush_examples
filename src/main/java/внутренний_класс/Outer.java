package внутренний_класс;

public class Outer {
    private String name = "Natalia";
    private static String staticName = "Valera";

    // внутренний класс
    class Inner {
        private String name2;

        public void show() {
            System.out.println(name.length());
            System.out.println("Метод внутреннего класса");
        }
    }

    // вложенный класс
    // из статического вложенного можно обратиться только к СТАТИЧЕСКИМ внешним
    static class InnerStatic {
        private String name3;

        public void show() {
//            System.out.println(name.length());// нет доступа к name
            System.out.println(staticName);
            System.out.println("Метод вложенного класса");
        }

    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
        InnerStatic innerStatic = new Outer.InnerStatic();
        innerStatic.show();

        /*
        7
        Метод внутреннего класса
        Valera
        Метод вложенного класса
         */
    }
}
