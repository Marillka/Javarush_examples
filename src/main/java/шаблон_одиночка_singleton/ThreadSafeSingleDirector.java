package шаблон_одиночка_singleton;

/*
Когда используется синглтон, в многопоточном приложении может возникнуть слудующая проблема:
1. Первый поток обращается к getInstance(), когда объект еще не создан.
2. Второй тоже обращается к этому методу, и пока первый еще не успел создать объект, сам создает его.
3. Первый поток создает еще один, второй экземпляр класса.
 */
public class ThreadSafeSingleDirector {
    private static Director instance;

    public ThreadSafeSingleDirector() {
    }

    public static Director getInstance() {
        if (instance == null) {
            synchronized (Director.class) {
                instance = new Director();
            }
        }
        return instance;
    }
}
