package E7;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * 7.3.6 ListIterator 接口  ListIterator迭代器只能用于List集合
 * Iterator的子类
 *          ListIterator 特有方法
 * void add(Object o)       //将指定的元素插入列表（可选操作）
 * boolean hasPrevious()    //如果以逆向遍历列表，列表迭代器有多个元素，则返回true
 * Object previous()        //返回列表中的前一个元素
 * void remove()            //从列表中移除由next或previous返回的最后一个元素（可选操作）
 */
public class Example07 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("date_1");
        list.add("date_2");
        list.add("date_3");
        System.out.println(list);
        ListIterator it = list.listIterator(list.size());
        while (it.hasPrevious()){  //判断该对象中是否有上一个元素
            Object obj = it.previous();  //迭代该对象的上一个元素
            System.out.println(obj+",");
        }
    }
}
