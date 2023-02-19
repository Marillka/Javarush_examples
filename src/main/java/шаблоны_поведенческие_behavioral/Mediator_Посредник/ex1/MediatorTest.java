package шаблоны_поведенческие_behavioral.Mediator_Посредник.ex1;

public class MediatorTest {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        user1.sendMessage("message1");
        user2.sendMessage("message2");
    }
}
