package неглубокое_и_глубокое_копирование.неглубокое;

public class Main {

    //Вспомогательный метод для сравнения двух объектов.
    // Он печатает поверхностную купию если оба объекта имеют один и тот же объект.
    // в противном случае он печатает глубокую копию
    public static void compare(Object ob1, Object ob2) {
        if (ob1 == ob2) {
            System.out.println("Неглубокое копирование");
        } else {
            System.out.println("Глубокое копирование");
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Joh Snow", 22);

        Student clone = null;

        try {
            clone = (Student) student.clone();
            System.out.println("Cloned Object: " + clone + '\n');
        } catch (CloneNotSupportedException e ) {
            e.printStackTrace();
        }

        compare(student.getSubjects(), clone.getSubjects());
        compare(student.getMap(), clone.getMap());

        // лобое изменение, внесенное в карту клона, отразится на карте ученика
        clone.getMap().put("John Cena", 40);
        System.out.println(student.getMap());
    }
}
