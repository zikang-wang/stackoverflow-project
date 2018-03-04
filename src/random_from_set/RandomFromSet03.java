package random_from_set;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

class RandomFromSet03<V> extends AbstractSet<V> {
    private Map<Object,V> map = new HashMap<>();
    public boolean add(V v) {
        return map.put(new WrapKey<V>(v),v) == null;
    }
    @Override
    public Iterator<V> iterator() {
        return new Iterator<V>() {
            RandKey key = new RandKey();
            @Override public boolean hasNext() {
                return true;
            }
            @Override public V next() {
                while (true) {
                    key.next();
                    V v = map.get(key);
                    if (v != null)
                        return v;
                }
            }
            @Override public void remove() {
                throw new NotImplementedException();
            }
        };
    }
    @Override
    public int size() {
        return map.size();
    }
    static class WrapKey<V> {
        private V v;
        WrapKey(V v) {
            this.v = v;
        }
        @Override public int hashCode() {
            return v.hashCode();
        }
        @Override public boolean equals(Object o) {
            if (o instanceof RandKey)
                return true;
            return v.equals(o);
        }
    }
    static class RandKey {
        private Random rand = new Random();
        int key = rand.nextInt();
        public void next() {
            key = rand.nextInt();
        }
        @Override public int hashCode() {
            return key;
        }
        @Override public boolean equals(Object o) {
            return true;
        }
    }
}
