package шаблоны_структурные_structural.facade.ex3;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.startCar();
        System.out.println();
        facade.stopCar();
    }
}
