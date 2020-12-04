package Set.E9;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 7.4 Set接口
 * 无序，不可重复
 */

//7.4.2 HashSet集合
    //实际上HashSet集合在new的时候，底层实际上new了一个HashMap集合，
    //向HashSet集合中存储元素，实际上是存储到HashMap集合中，
    //HashMap集合是一个哈希表数据结构
public class Example09 {
    public static void main(String[] args) {
        HashSet set = new HashSet(); //创建HashSet集合
        set.add("Jock");
        set.add("Eve");     //String类和已经重写了hashCode()和equals()方法
        set.add("Rose");
        set.add("Rose");
        Iterator it = set.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
