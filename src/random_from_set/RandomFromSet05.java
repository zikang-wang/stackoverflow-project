package random_from_set;

import java.util.Random;
import java.util.Set;

public class RandomFromSet05 {
    public Object getRandom(Set<Object> set) {
        int size = set.size();
        int item = new Random().nextInt(size); // In real life, the Random object should be rather more shared than this
        int i = 0;
        for(Object obj : set)
        {
            if (i == item)
                return obj;
            i++;
        }
        return null;
    }
}
