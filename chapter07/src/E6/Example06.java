package E6;


import java.util.*;

public class Example06 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Jack");
        list.add("Annie");
        list.add("Rose");
        list.add("Tom");
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            if ("Annie".equals(obj)){
                list.remove(obj);
            }
        }
        System.out.println(list);  //ConcurrentModificationException
        //原因：集合中删除的元素会导致迭代器预期的迭代次数发生改变，导致迭代器的结果不准确。

        //解决：
        // 方式一：
        /*
        if ("Annie".equals(obj)){
            list.remove(obj);
            break;
        }*/
        //方式二：
        /*
        if ("Anile.equals(obj)"){
            it.remove();
        }
         */
    }
}
