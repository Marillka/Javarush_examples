package шаблон_фасад_facade;

public class Key implements Car{
    @Override
    public void start() {
        System.out.println("Вставить ключи");
    }

    @Override
    public void stop() {
        System.out.println("Вытянуть ключи");
    }
}
