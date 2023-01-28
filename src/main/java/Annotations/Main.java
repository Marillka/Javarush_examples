package Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Main main = new Main();
        Person person = new Person();
        main.print(person, Person.class);

    }

    void print(Object o, Class c) throws IllegalAccessException {
        Field[] declaredFields = c.getDeclaredFields();
        for (Field field : declaredFields) {
            Annotation[] annotation = field.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : annotation) {
                if (declaredAnnotation.annotationType().equals(Show.class)) {
                    System.out.println(field.get(o));
                }
            }
        }

    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface Show {
    boolean value() default true;
}

class Person {
    @Show
    String name = "Valera";

    int age = 10;

}
