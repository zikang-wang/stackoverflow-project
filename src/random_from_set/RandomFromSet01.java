package random_from_set;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RandomFromSet01 {
    public static <E> E choice(Collection<? extends E> coll, Random rand) {
        if (coll.size() == 0) {
            return null; // or throw IAE, if you prefer
        }

        int index = rand.nextInt(coll.size());
        if (coll instanceof List) { // optimization
            return ((List<? extends E>) coll).get(index);
        } else {
            Iterator<? extends E> iter = coll.iterator();
            for (int i = 0; i < index; i++) {
                iter.next();
            }
            return iter.next();
        }
    }
}
