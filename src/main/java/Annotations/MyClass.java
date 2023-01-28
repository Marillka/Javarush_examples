package Annotations;

import java.beans.Transient;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.ref.Reference;


//@Deprecated
//@MyClass.MyAnn(value = "some", i = 5)
@MyClass.MyAnn("Hello")
public class MyClass {
    @Deprecated
    int i;

    MyClass() {

    }

    @Transient
    @Deprecated
    public void method(int i) {

    }


    /*
    @Inherited - наследование аннотации классами потомками
    @Retention - где будет видна аннотация (Source - до компиляции, Class - только в скомпилированном классе, Runtime - при запуске)
    Target - к чему можно применять аннотация
 */
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
//    @Target()
    @interface MyAnn {
        boolean run() default true;

        int i() default 1;

        String value();
    }

}


class MyClass2 extends MyClass {

}


@interface BugReport {
    enum Status {UNCONFIRMED, CONFIRMED, FIXED, NOTABUG}

    boolean showStopper() default false;

    String assignedTo() default "[none]";

    // все поля должны быть final и не null.
//    String assignedTo2() default "[none]" + new String("");
//    String assignedTo3() default null;

    int i() default 1 + 1;

    Class<?> testCase() default Void.class;

    BugReport.Status status() default BugReport.Status.UNCONFIRMED;


    String[] reportedBy();
    // объекты запрещены
//    Object o();
}
