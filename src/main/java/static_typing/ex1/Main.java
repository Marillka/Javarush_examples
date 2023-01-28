package static_typing.ex1;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Beta().getThis());// static_typing.ex1.Beta@2d98a335

//        new Beta().getThis().doBeta();// не скомпилируется. Её исходный тип Alfa и компилятор не знает реальный типо во время компиляции, поэтому он видит объект типа Alfa.

        new Beta().getThis().doAlfa();// так получится

        ((Beta) new Beta().getThis()).doBeta();// так сработает

//        ((Omega) new Beta.getThis()).doOmega(); // не сработает
    }

}

