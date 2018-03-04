package random_from_set;

import java.util.Random;
import java.util.Set;

public class RandomFromSet04 {
    /**
     * @param set a Set in which to look for a random element
     * @param <T> generic type of the Set elements
     * @return a random element in the Set or null if the set is empty
     */
    public <T> T randomElement(Set<T> set) {
        int size = set.size();
        Random random = new Random();
        int item = random.nextInt(size);
        int i = 0;
        for (T obj : set) {
            if (i == item) {
                return obj;
            }
            i++;
        }
        return null;
    }
}
