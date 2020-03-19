package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/*
在一个列表中存储以下元素：apple,grape,banana,pear
  返回集合中的最大的和最小的元素
  将集合进行排序，并将排序后的结果打印在控制台上
 */
public class Fruit {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("grape");
        linkedList.add("banana");
        linkedList.add("pear");
        System.out.println("最大的元素为："+ Collections.max(linkedList));
        System.out.println("最小的元素为："+ Collections.min(linkedList));
        Collections.sort(linkedList);
        for (String link:linkedList) {
            System.out.println(link);
        }
    }

}
