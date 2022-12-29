package шаблон_строитель_builder.badExample;

public class CarFactory {
    public static Car makeCar() {
        return new Car(new Engine(), new Transmission(), new Body(), new Brakes(), new Pedals(), new WindscreenWipers(), new Wheels(), new Radio(), new Seats(), new Belts(), new ClimateControl());
    }
}
