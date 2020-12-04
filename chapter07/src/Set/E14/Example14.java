package Set.E14;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Example14 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyComparator());//创建TreeSet对象时传入自定义比较器
        ts.add("Jack");
        ts.add("Helena");
        ts.add("Eve");
        Iterator it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
class MyComparator implements Comparator{ //定义比较器实现Comparator接口

    @Override
    public int compare(Object obj1, Object obj2) {  //实现比较方法
        String s1 = (String) obj1;
        String s2 = (String) obj2;
        int temp = s1.length() - s2.length();
        return temp;
    }
}