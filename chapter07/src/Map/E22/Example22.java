package Map.E22;
import java.util.*;
/**
 * 7.5.4 Properties集合
 * Hashtable类（是线程安全的）有一个子类Properties
 *
 */
public class Example22 {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("background-color","red");
        p.setProperty("Font-size","14px");
        p.setProperty("Language","chinese");
        Enumeration names = p.propertyNames(); //获取Enumeration对象所有键的枚举
        while (names.hasMoreElements()){
            String key = (String)names.nextElement();
            String value = p.getProperty(key); //获取对应键的值
            System.out.println(key+"="+value);
        }
    }
}
