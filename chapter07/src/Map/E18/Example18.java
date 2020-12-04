package Map.E18;

import java.util.*;

/**
 * 在Map中，还提供了一个values()方法，通过这个方法，可以直接获取Map中所存储所有值的Collection集合。
 */
public class Example18 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","Jack");
        map.put("2","Rose");
        map.put("3","Lucy");
        Collection values = map.values();
        Iterator it = values.iterator();
        while (it.hasNext()){
            Object value = it.next();
            System.out.println(value);
        }
        /*ArrayList list = new ArrayList();
        list.add("demo_1");
        list.add("demo_2");
        list.add("demo_3");
        ListIterator it = list.listIterator();
        while (it.hasPrevious()){
            Object obj = it.previous();
            System.out.print(obj+" ");
        }*/
    }
}
