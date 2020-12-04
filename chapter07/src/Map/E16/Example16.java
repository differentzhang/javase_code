package Map.E16;
import java.util.*;
public class Example16 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","Jack");
        map.put("2","Rose");
        map.put("3","Lucy");
        Set keySet = map.keySet();  //获取键的集合
        Iterator it = keySet.iterator();  //Set集合中 迭代键的集合
        while (it.hasNext()){
            Object key = it.next();
            Object value = map.get(key);  //获取每个键所对应的值
            System.out.println(key+":"+value);
        }

    }
}
