package шаблон_одиночка_singleton;

/*
Это порождающий шаблон, который гарантирует, что будет создан единственный экземпляр класса и единая точка вызова. Например, в организации может быть только один директор.
 */
public class Main {
    public static void main(String[] args) {
        Director dir = SingleDirector.getInstance();
    }


}
