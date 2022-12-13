package неглубокое_и_глубокое_копирование.неглубокое;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Subject implements Cloneable {

    private Set<String> subjects;

    public Subject() {
        subjects = new HashSet<>(Arrays.asList("Maths", "Science", "English", "History"));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // вызовите super.clone() чтобы получить сслыку на клонированный объект
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Set<String> getSubjects() {
        return subjects;
    }
}
