package неглубокое_и_глубокое_копирование.глубокое;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Subject implements Cloneable {
    private Set<String> subjects;

    public Subject() {
        subjects = new HashSet<>(Arrays.asList("Maths", "Science", "English", "History"));
    }
    @Override
    public Subject clone() throws CloneNotSupportedException {
        Subject obj = (Subject)super.clone();
        obj.subjects = new HashSet<>(this.subjects);

        return obj;
    }

    @Override
    public String toString() {
        return subjects.toString();
    }

    public Set<String> getSubjects() {
        return subjects;
    }
}
