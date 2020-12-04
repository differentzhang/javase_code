package homework;
import java.util.*;
public class Test03 {
    public static void main(String[] args) {
        TreeMap map = new TreeMap(new MyComparator());
        map.put("1","Lucy");
        map.put("4","Aimee");
        map.put("5","Amanda");
        map.put("3","Smith");
        map.put("2","John");
        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()){
            Object key = it.next();
            Object value = map.get(key);
            System.out.println(key+":"+value);
        }
    }
}
class MyComparator implements Comparator{  //其实这个比较器可有可无，
                                            // 因为String类已经实现了Comparable接口了，
                                            //这个接口中就有CompareTo()方法，不需要覆盖了。

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;
        return s1.compareTo(s2);
    }
}
