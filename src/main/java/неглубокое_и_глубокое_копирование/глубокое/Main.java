package неглубокое_и_глубокое_копирование.глубокое;

/*
Альтернативой поверхностной копии является глубокая копия, при которой новые объекты создаются для любых объектов, на которые есть ссылки, а не для ссылок на копируемые объекты.

JDK не предоставляет эквивалент глубокого копирования для Object.clone() метод. Но мы можем добиться глубокого копирования, изменив реализацию по умолчанию Object.clone() метод и выделить новую память для изменяемых полей объекта, возвращаемого super.clone() прежде чем вернуться к вызывающему абоненту. Если в объекте есть какие-либо ссылки на другие объекты в виде полей, рекомендуется вызвать метод clone() метод на них. Примитивные поля можно игнорировать, так как их содержимое уже скопировано. Для неизменяемых полей, таких как строка, мы можем позволить методу скопировать ссылку, и и оригинал, и его клон будут совместно использовать один и тот же объект. Теперь любые изменения, внесенные в клонированный объект, не будут отражаться в исходном объекте и наоборот.
 */
public class Main {

    public static void compare(Object ob1, Object ob2) {
        if (ob1 == ob2) {
            System.out.println("Неглубокое копирование");
        } else {
            System.out.println("Глубокое копирование");
        }
    }

    public static void main(String[] args) {
        Student student = new Student("John Snow", 22);

        Student clone = null;

        try {
            clone = (Student) student.clone();
            System.out.println("Cloned Object: " + clone + "\n");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        compare(student.getSubjects(), clone.getSubjects());
        compare(student.getMap(), clone.getMap());

        // Любые изменения, внесенные в карту клона, не отразятся на карте ученика
        clone.getMap().put("John Cena", 40);
        System.out.println(student.getMap());
    }
}
