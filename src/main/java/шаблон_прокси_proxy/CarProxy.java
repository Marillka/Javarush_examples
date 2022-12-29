package шаблон_прокси_proxy;

public class CarProxy {
    Car car;
    boolean haveLicense;

    public CarProxy(Car car, boolean haveLicense) {
        this.car = car;
        this.haveLicense = haveLicense;
    }

    public void speedUp() {
        if (haveLicense) {
            car.speedUp();
        }
    }

    public void speedDown() {
        if (haveLicense) {
            car.speedDown();
        }
    }
}
