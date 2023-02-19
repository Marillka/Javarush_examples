package шаблоны_поведенческие_behavioral.Mediator_Посредник.ex1;

public class Mediator {
    public static void sendMessage(User user , String msg) {
        System.out.println(user.getName() + ": " + msg);
    }
}
