package неглубокое_и_глубокое_копирование.неглубокое;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Student implements Cloneable{
    private String name; // неизменяемое поле
    private int age; // примитивное поле
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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
