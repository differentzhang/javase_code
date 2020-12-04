package Map.E28;

import java.util.*;

/**
 * 2.查找、替换操作
 *              Collections常用方法
 *  static int binarySearch(List list,Object key)  //使用二分法搜索指定对象在List集合中的索引，查找的List集合中的元素必须是有序的。
 *  static Object max(Collection col)  //根据元素的自然顺序，返回给定集合中最大的元素
 *  static Object min(Collection col)  //根据元素的自然顺序，返回给定集合中最小的元素
 *  static boolean replaceAll(List list, Object oldVal,Object newVal) //用一个新的newVal替换List集合中所有的旧值
 */
public class Example28 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Collections.addAll(list,-3,2,9,5,8);
        System.out.println("集合中的元素："+list);
        System.out.println("集合中的最大元素："+Collections.max(list));
        System.out.println("集合中的最小元素："+Collections.min(list));
        Collections.replaceAll(list,8,0); //将集合中的8用0替换掉
        System.out.println("替换后的集合："+list);

    }
}
