package Map.E17;
import java.util.*;
public class Example17 {
    public static void main(String[] args) {  //第二中遍历Map集合的方式
        Map map = new HashMap();
        map.put("1","Jack");
        map.put("2","Rose");
        map.put("3","Lucy");
        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry)(it.next());  //获取集合中键值对映射关系
            Object key = entry.getKey();
            //Object value = map.get(key);
            Object value = entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}
