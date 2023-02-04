package шаблон_строитель_builder.goodExample;

public class Main {
    public static void main(String[] args) {
        Car c = new Car.Builder().addEngine(new Engine()).addPedals(new Pedals()).build();
        
    }
}
