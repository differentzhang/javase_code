package Map.E15;

import java.util.HashMap;
import java.util.Map;

/**
 * 7.5 Map接口
 * ：双列集合
 * 每个元素都包含一个键对象Key和一个值对象Value，
 * 键和值对象之间存在一种对应关系，称为映射
 *          Map集合常用方法表
 * void put(Object key, Object value)  //将指定的值与此映射中的指定键关联（可选操作）
 * Object get(Object key)  //返回指定键所映射的值，如果此映射不包含该键的映射关系，则返回null
 * boolean containsKey(Object key)  //如果此映射包含指定指定键的映射关系，则返回true
 * boolean containsValue(Object value)  //如果此映射将一个或多个键映射到指定值，则返回true
 * Set keySet()   //返回此映射中包含的键的Set视图
 * Collection<V> values() //返回此映射中包含的值的Collection视图
 * Set<Map.Entry<K,V>> entrySet()  //返回此映射中包含的映射关系的Set视图
 */

//7.5.2 HashMap
public class Example15 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","Jack");
        map.put("2","Rose");
        map.put("3","Lucy");
        map.put("3","Mary"); //键相同，值覆盖； 所以键不能相同，且唯一
        System.out.println("1:"+map.get("1"));  //根据键获取值
        System.out.println("2:"+map.get("2"));  //根据键获取值
        System.out.println("3:"+map.get("3"));  //根据键获取值
    }
}
