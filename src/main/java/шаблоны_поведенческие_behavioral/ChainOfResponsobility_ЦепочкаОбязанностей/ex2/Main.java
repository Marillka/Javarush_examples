package шаблоны_поведенческие_behavioral.ChainOfResponsobility_ЦепочкаОбязанностей.ex2;

public class Main {
    public static void main(String[] args) {
        Chain chain = new Chain();

        chain.add(
                object -> {
                    System.out.println(object);
                    return "123";
                },
                object -> {
                    String str = (String) object;
                    System.out.println(str);
                    return str.length();
                },
                object -> {
                    int len = (int) object;
                    len++;
                    System.out.println(len);
                    return len;
                }
        );

        chain.process("hello world");
    }
}
