package Map.E21;

import java.util.*;

public class Example21 {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap(new MyComparator());  //传入一个自定义比较器
        tm.put("1","Jock");
        tm.put("2","Rose");
        tm.put("3","Lucy");
        Set keySet =tm.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()){
            Object key = it.next();
            Object value = tm.get(key);
            System.out.println(key+":"+value);
        }
    }
}

class MyComparator implements Comparator{  //自定义比较器

    @Override
    public int compare(Object o1, Object o2) {
        String id1 = (String)o1;
        String id2 = (String)o2;
        return id2.compareTo(id1); //将比较之后的值返回。
        //return id1.compareTo(id2); //将比较之后的值返回。
    }
}