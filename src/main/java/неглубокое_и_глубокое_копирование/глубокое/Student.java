package неглубокое_и_глубокое_копирование.глубокое;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Student implements Cloneable {

    private String name;
    private int age;

    private Subject subjects;
    private Map<String, Integer> map;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

        map = new HashMap<>() {{
            put(name, age);
        }};

        subjects = new Subject();
    }

    @Override
    public String toString() {
        return Arrays.asList(name, String.valueOf(age), subjects.toString()).toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();

        // примитивные поля типа int не копируются, т.к их содержимое уже скопированно

        // Строка неизменна

        // вызов clone() для объекта Subject
        student.subjects = this.subjects.clone();

        // создаем новый экземпляр HashMap
        student.map = new HashMap<>(this.map);

        return student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Subject getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject subjects) {
        this.subjects = subjects;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }
}
