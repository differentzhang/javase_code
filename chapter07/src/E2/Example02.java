package E2;

import java.util.LinkedList;

/**
 * 7.3.3 LinkedList 集合 , 底层采用双向链表的数据结构
 * void add(int index, E element) //在此列表中指定的位置插入指定的元素
 * void addFirst(Object o)  //将指定元素插入此列表的开头
 * void addLast()  //将指定元素添加到此列表的结尾
 * Object getFirst()  //返回此列表的第一个元素
 * Object getLast()  //返回此列表的最后一个元素
 * Object removeFirst()  //移除并返回此列表的第一个元素
 * Object removeLast() //移除并返回此列表的最后一个元素
 */
public class Example02 {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();  //创建LinkedList集合
        link.add("stu1");
        link.add("stu2");
        link.add("stu3");
        link.add("stu4");
        System.out.println(link.toString());  //取出并打印该集合中的元素
        link.add(3,"student"); //向该集合中指定位置插入元素
        link.addFirst("First");
        System.out.println(link);
        System.out.println(link.getFirst()); //取出该集合中的第一个元素 ,但是不删除.
        //System.out.println(link);
        link.remove(3);
        link.removeFirst();
        System.out.println(link);
    }
}
