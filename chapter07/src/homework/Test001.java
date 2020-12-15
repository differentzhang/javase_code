package homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * company: www.abc.com
 * Author: Administrator
 * Create Data: 2020/12/15 0015
 */
public class Test001 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
