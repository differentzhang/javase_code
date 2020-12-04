package Map.E19;
import java.util.*;

/**
 * 存取顺序一致，使用HashMap的子类LinkedHashMap类
 */
public class Example19 {
    public static void main(String[] args) {
        Map map = new LinkedHashMap();
        map.put("1","Jock");
        map.put("2","Rose");
        map.put("3","Lucy");
        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()){
            Object key = it.next();
            Object value = map.get(key);
            System.out.println(key+":"+value);
        }
    }
}
