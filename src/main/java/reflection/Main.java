package reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static Cat createCat() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//
//        Class clazz = null;
//        Cat cat = null;
//
//        try {
//            clazz = Class.forName("reflection.Cat");
//            Class[] catClassParams = {String.class, int.class};
//            cat = (Cat) clazz.getConstructor(catClassParams).newInstance("Barsik", 6);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }


        Class clazz = null;
        Cat cat = null;

        try {
            clazz = Class.forName("reflection.Cat");
            cat = (Cat) clazz.newInstance();

            cat.setName("Barsik");
            Field age = clazz.getDeclaredField("age");
            age.setAccessible(true);
            age.set(cat, 6);

            Method sayMeow = clazz.getDeclaredMethod("sayMeow");
            sayMeow.setAccessible(true);
            sayMeow.invoke(cat);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        return cat;
    }

    public static Object createObject() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String className = reader.readLine();

        Class clazz = Class.forName(className);
        Object result = clazz.newInstance();

        return result;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Cat cat = createCat();
        CodeAnalyzer.analyzeClass(cat);
        System.out.println(cat);
    }
}
