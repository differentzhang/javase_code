package E8;

import java.util.*;

/**
 * 7.3.7 Enumeration 接口
 *
 */
public class Example08 {
    public static void main(String[] args) {
        Vector v = new Vector();  //创建Vector对象
        v.add("Jack");
        v.add("Rose");
        v.add("Tom");
        Enumeration en = v.elements();   //获取Enumeration对象
        while (en.hasMoreElements()){  //判断该对象是否有更多元素
            Object obj = en.nextElement();  //取出该对象的下一个元素
            System.out.println(obj);
        }

    }
}
