package homework;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a5");
        list.add("a6");
        list.add("a7");
        list.add("a8");
        list.add("a9");
        list.add("a10");

        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+",");
        }
    }
}
