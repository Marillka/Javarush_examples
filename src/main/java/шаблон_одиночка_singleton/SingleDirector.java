package шаблон_одиночка_singleton;

public class SingleDirector {
    private static Director instance;

    public SingleDirector() {
    }

    public static Director getInstance() {
        if (instance == null) {
            instance = new Director();
        }
        return instance;
    }
}
