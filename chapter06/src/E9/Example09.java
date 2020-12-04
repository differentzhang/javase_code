package E9;

import java.util.Enumeration;
import java.util.Properties;

/**
 * 6.2 System 类与 Runtime类
 * 6.2.1 System类
 * System类定义了一些与系统相关的属性和方法,它所提供的属性和方法都是静态的，
 * 因此想要引用这些属性和方法，直接使用System类调用即可。
 *              System类的常用方法
 * static void exit(int status)         该方法用于终止当前正在运行的Java虚拟机，其中参数status表示状态码，若状态码非0，则表示异常终止。
 * static long gc()                     运行垃圾回收器，并对垃圾进行回收
 * static long currentTimeMills()       返回以毫秒为单位的当前时间
 * static void arraycopy(Object src, int srcPos, object dest, int destPos, int length)
 *                                      从src引用的指定源数组复制到dest引用的数组，复制从指定的位置开始，到目标数组的指定位置结束。
 * static Properties getProperties()    取得当前的系统属性
 * static String getProperty(String key)获取指定键描述的系统属性
 */

//1. getProperties()方法
public class Example09 {
    public static void main(String[] args) {
        //获取当前系统属性
        Properties properties = System.getProperties();
        //获取所有系统属性的key，返回Enumeration对象 （Enumeration：枚举）
        Enumeration propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()){
            //获取系统属性的key值
            String key = (String) propertyNames.nextElement();
            //获取当前键key对应的值value
            String value = System.getProperty(key);
            System.out.println(key+"--->"+value);
        }
    }
}
