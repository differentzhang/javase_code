package E3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 7.3.4 Iterator 接口
 */
public class Example03 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("data_1");
        list.add("data_2");
        list.add("data_3");
        list.add("data_4");
        Iterator it = list.iterator(); //获取Iterator对象
        while (it.hasNext()){   //判断ArrayList集合中是否存在下一个元素
            Object obj = it.next();  //取出ArrayList集合中的元素.
            System.out.println(obj);
        }
    }
}
