package Map.E20;
import java.util.*;

/**
 * 7.5.3 TreeMap集合
 */
public class Example20 {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put("1","Jack");
        tm.put("2","Rose");
        tm.put("3","Lucy");
        Set keySet = tm.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()){
            Object key = it.next();
            Object value = tm.get(key);
            System.out.println(key+":"+value);
        }
    }
}
