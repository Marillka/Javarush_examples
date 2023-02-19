package шаблоны_поведенческие_behavioral.Iterator_Итератор.ex1;

public class IteratorTest {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        Iterator iterator = numbers.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
