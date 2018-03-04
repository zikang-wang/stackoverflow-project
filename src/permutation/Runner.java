package permutation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Runner {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String testStr = "abc";
        // Permutation[] perms = new Permutation[25];
        for (int i = 0; i < 24; i++) {
            String className = "permutation.Permutation" + String.format("%02d", i);
            Class<?> clazz = Class.forName(className);
            Constructor<?> ctor = clazz.getConstructor();
            Permutation perm = (Permutation) ctor.newInstance();
            System.out.println("\n\nCode " + String.format("%02d", i));
            perm.run(testStr);
        }
    }
}
