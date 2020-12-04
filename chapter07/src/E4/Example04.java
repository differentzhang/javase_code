package E4;

import java.util.ArrayList;

/**
 * 7.3.5 JDK5.0新特性---foreach循环  ,用于遍历数组或集合中的元素
 * for(容器中元素类型 临时变量 : 容器变量){
 *      执行语句
 * }
 */
public class Example04 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Jack");
        list.add("Rose");
        list.add("Tom");
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
