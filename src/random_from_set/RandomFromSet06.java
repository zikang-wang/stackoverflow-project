package random_from_set;

import java.util.Random;
import java.util.Set;

public class RandomFromSet06 {
    private static Random random;

    //双重校验锁获取一个Random单例
    public static Random getRandom() {
        if(random==null){
            synchronized (RandomFromSet06.class) {
                if(random==null){
                    random =new Random();
                }
            }
        }

        return random;
    }
    /**
     * 获得一个[0,max)之间的整数。
     * @param max
     * @return
     */
    public static int getRandomInt(int max) {
        return Math.abs(getRandom().nextInt())%max;
    }
    /**
     * 从set中随机取得一个元素
     * @param set
     * @return
     */
    public static <E> E getRandomElement(Set<E> set){
        int rn = getRandomInt(set.size());
        int i = 0;
        for (E e : set) {
            if(i==rn){
                return e;
            }
            i++;
        }
        return null;
    }

}
