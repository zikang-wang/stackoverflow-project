package random_from_set;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class RandomFromSet02 {
    public Object random(Set<Object> set) {
        Random rand = new Random();
        int index = rand.nextInt(set.size());
        Iterator<Object> iter = set.iterator();
        for (int i = 0; i < index; i++) {
            iter.next();
        }
        return iter.next();
    }
}
