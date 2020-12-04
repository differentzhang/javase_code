package Map.E23;
import java.util.*;
/**
 * 7.6 JDK5.0 新特性——泛型
 */
public class Example23 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("String");
        list.add("Collection");
        list.add(1);
        for (Object obj : list){
           // String str = (Object) obj;
        }
    }
}
