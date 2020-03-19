package Collection;

import java.util.HashSet;
import java.util.Random;

/*
4.产生10个1~20之间的随机数，要求随机数不能重复
 */
public class Random1 {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet set = new HashSet();
        while (set.size() < 10){
            set.add(r.nextInt(20)+1);
        }
        for (Object obj: set) {
            System.out.println(obj+" ");
        }
    }
}