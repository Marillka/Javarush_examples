package шаблоны_порождающие_creational.шаблон_строитель_builder.goodExample;

public class Car {
    private Engine engine;
    private Transmission transmission;
    private Body body;
    private Brakes brakes;
    private Pedals pedals;

    public static class Builder {
        private Engine engine;
        private Transmission transmission;
        private Body body;
        private  Brakes brakes;
        private Pedals pedals;

        public Builder addEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder addTransmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public Builder addBody(Body body) {
            this.body  = body;
            return this;
        }

        public Builder addBrakes(Brakes brakes) {
            this.brakes = brakes;
            return this;
        }

        public Builder addPedals(Pedals pedals) {
            this.pedals = pedals;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(Builder builder) {
        this.body = builder.body;
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.brakes = builder.brakes;
        this.pedals = builder.pedals;
    }
}
