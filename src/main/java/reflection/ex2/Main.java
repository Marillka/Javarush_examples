package reflection.ex2;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> al = new ArrayList<>();
        Class c = ArrayList.class;
        Field f = c.getDeclaredField("elementData");
        f.setAccessible(true);
        System.out.println(((Object[]) f.get(al)).length);

    }

}
