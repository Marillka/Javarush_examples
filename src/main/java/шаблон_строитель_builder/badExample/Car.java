package шаблон_строитель_builder.badExample;


/*
Представим сборку машины: она состоит из кузова, двигателя, коробки передач и множества других отдельных объектов. Если есть только один тип кузова, двигателя и других частей, можно использовать "Фабрику". Но когда варианто больше или объект конструируется в несколько шагов, можно использовать шаблон проектирования "Строитель"
 */
public class Car {
    Engine engine;
    Transmission transmission;
    Body body;
    Brakes brakes;
    Pedals pedals;
    WindscreenWipers windscreenWipers;
    Wheels wheels;
    Radio radio;
    Seats seats;
    Belts belts;
    ClimateControl climateControl;

    public Car(Engine engine, Transmission transmission, Body body, Brakes brakes, Pedals pedals, WindscreenWipers windscreenWipers, Wheels wheels, Radio radio, Seats seats, Belts belts, ClimateControl climateControl) {
        this.engine = engine;
        this.transmission = transmission;
        this.body = body;
        this.brakes = brakes;
        this.pedals = pedals;
        this.windscreenWipers = windscreenWipers;
        this.wheels = wheels;
        this.radio = radio;
        this.seats = seats;
        this.belts = belts;
        this.climateControl = climateControl;
    }
}
