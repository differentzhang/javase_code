package Map.E27;
import java.util.*;

/**
 * 7.7 Collection工具箱
 *          Collection常用方法表
 *  static<T> boolean addAll(Collection<?super T> c,T...elements)  //将所有指定元素添加到指定的collection中
 *  static void reverse(List list)  //反转指定List集合中元素的顺序
 *  static void shuffle (List list)  //对List集合中的元素进行随机排序（模拟玩扑克中的"洗牌"）
 *  static void sort(List list)  //根据元素的自然顺序对List集合中的元素进行排序
 *  static void swap(List list,int i,int j)  //将指定List集合中的i处元素和j处元素进行交换
 */

//1.排序操作
public class Example27 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Collections.addAll(list,"C","Z","B","K");  //添加元素
        System.out.println("排序前："+list);

        Collections.reverse(list);
        System.out.println("反转后："+list);

        Collections.sort(list);
        System.out.println("按自然顺序排序后："+list);

        Collections.shuffle(list);
        System.out.println("洗牌后："+list);
    }
}
