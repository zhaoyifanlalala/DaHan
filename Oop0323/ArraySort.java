package fanxing;

import java.util.Arrays;
import java.util.Comparator;

/*
第二题.定义泛型类，成员变量是Number类或其子类对象的数组，成员方法有：求数组元素最小值、最大值和平均值。
创建泛型类对象，分别求Integer和Double型数组的最小最大、平均值
 */
public class ArraySort<T extends Number> {
    private  T[] arr;

    public ArraySort(T[] arr) {
        this.arr = arr;
    }

    public  T  getMin(){
        Arrays.sort(arr, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                int num= Double.parseDouble(o1.toString())-Double.parseDouble(o2.toString())>0 ? 1:-1;
                return num;
            }
        });
        return  arr[0];
    }

}

class  Test{

    public static void main(String[] args) {
        Integer[] in = new Integer[5];
        in[0] = 120;
        in[1] = 12131;
        in[2] = 1112312;
        in[3] = 1112;
        in[4] = 99;

        Double[] dou = new Double[4];
        dou[0] = 145.63412;
        dou[1] = 145.6321312412;
        dou[2] = 3145.63412;
        dou[3] = 45.634121231;


        ArraySort<Integer> arraySort = new ArraySort<>(in);

        System.out.println(arraySort.getMin());
    }
}
