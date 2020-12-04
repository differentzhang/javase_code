package E1;

import java.util.ArrayList;

/**
 * 集合类
 * 7.1 集合概述
 * 单列集合Collection , 双列集合Map
 * 7.2 Collection 接口
 * boolean add(Object o)                //向集合中添加一个元素
 * boolean addAll(Collection c)         //将指定Collection 中的所有元素添加到该集合中
 * void clear()                         //删除该集合中的所有元素
 * boolean remove(Object o)             //删除该集合中指定的元素
 * boolean removeAll(Collection c)      //删除指定集合中的所有元素
 * boolean isEmpty()                    //判断该集合是否为空
 * boolean contains(Object o)            //判断该集合中是否包含某个元素
 * boolean containAll(Collection c)      //判断该集合中是否包含指定集合中的所有元素
 * Iterator iterator()                  //返回在该集合的元素上进行迭代的迭代器(Iterator),用于遍历该集合所有元素
 * int size()                           //获取该集合元素个数
 *
 * 7.3 List 接口
 * 7.3.1 List接口  有序可重复
 * void add(int index,Object element) //将元素element插入在List集合的index处.
 * boolean addAll(int index, Collection c) //将集合c所包含的所有元素插入到List集合的index处.
 * Object get (int index)   //返回集合索引处的元素
 * Object remove(int index)  //删除index索引处的元素
 * Object set(int index, Object element)  //将索引index处元素替换成element对象,并将替换后的元素返回
 * int indexOf(Object o)  //返回对象o在List集合中出现的位置索引
 * int lastIndexOf(Object o)  //返回对象o在List集合中最后一次出现的位置索引
 * List subList(int fromIndex, int toIndex)  //返回从索引fromIndex(包括)到toIndex(不包括)处所有元素集合组成的子集合
 *
 * 7.3.2 ArrayList集合  底层采用数组,非线程安全
 */
public class Example01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();  //创建ArrayList集合
        list.add("stu1");   //向集合中添加元素
        list.add("stu2");   //向集合中添加元素
        list.add("stu3");   //向集合中添加元素
        list.add("stu4");   //向集合中添加元素
        System.out.println("集合的长度:"+list.size());  //获取集合中元素的个数
        System.out.println("第2个元素是:"+list.get(1));
        //注: Example01.java使用了未经检查或不安全的操作。
        //注: 有关详细信息, 请使用 -Xlint:unchecked 重新编译。
        //集合的长度:4
        //第2个元素是:stu2
    }
}
