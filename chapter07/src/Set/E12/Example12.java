package Set.E12;

import java.util.*;

/**
 * 7.4.3 TreeSet集合
 * 无序，不可重复，自动排序
 * 底层new了一个TreeMap集合，
 * TreeMap集合底层采用二叉树数据结构
 * 平衡二叉树
 */
public class Example12 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();  //创建TreeSet集合
        ts.add("Jack");
        ts.add("Helena");
        ts.add("Helena");
        ts.add("Eve");
        Iterator it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
