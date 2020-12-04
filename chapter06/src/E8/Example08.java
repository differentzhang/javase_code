package E8;

/**
 * 6.1.3 StringBuffer类（也称字符串缓冲区）
 * StringBuffer 与 String 最大的区别在于它的内容和长度都是可以改变的。
 * StringBuffer类似一个字符容器，当在其中添加或者删除字符时，并不会产生新的StringBuffer对象
 *
 * StringBuffer append(char c)                  添加参数到StringBuffer对象中
 * StringBuffer insert(int offset, String str)  将字符串中的offset位置插入字符串str中
 * StringBuffer deleteCharAt(int index)         移除此序列指定位置的字符
 * StringBuffer delete(int index,int end)       删除StringBuffer对象中指定范围的字符或者字符串序列
 * StringBuffer replace(int start,int end, String s) 在StringBuffer对象中替换指定的额字符或字符串序列
 * void setCharAt(int index, char ch)           修改指定位置index处的字符序列
 * String toString()                            返回StringBuffer缓冲区中的字符串
 * StringBuffer reverse()                       返回字符序列用其反转形式取代
 *
 * 1.String类表示的字符串是常量，一旦创建后，内容和长度都是无法改变的，而StringBuffer表示字符容器，
 *   其内容和长度都是可以随时修改，在操作字符串时，如果该字符串仅用于表示数据类型，则使用String类即可，
 *   但是如果需要对字符串中的字符进行增删操作，则使用StringBuffer类。
 * 2.String类覆盖了Object类的equals()方法，而StringBuffer类没有覆盖Object类的equals()方法。
 * 3.String类对象可以用操作符+进行连接，而StringBuffer类对象之间不能。
 */
public class Example08 {
    public static void main(String[] args) {
        System.out.println("1、添加---------------------------");
        add();
        System.out.println("2、删除---------------------------");
        remove();
        System.out.println("3、修改---------------------------");
        alter();
    }
    public static void add(){
        StringBuffer sb = new StringBuffer(); //定义一个字符串缓冲区
        sb.append("abcdefg"); //在末尾添加字符串
        System.out.println("append添加结果："+sb);
        sb.insert(2,"123"); //在指定位置插入字符串
        System.out.println("insert添加结果："+sb);
    }
    public static void remove(){
        StringBuffer sb= new StringBuffer("abcdefg");
        sb.delete(1,5); //指定范围删除  //左闭右开
        System.out.println("删除指定位置结果："+sb);
        sb.deleteCharAt(2); //指定位置删除
        System.out.println("删除指定位置结果："+sb);
        sb.delete(0,sb.length());  //清空缓冲区
        System.out.println("清空缓冲区结果："+sb);
    }
    public static void alter(){
        StringBuffer sb = new StringBuffer("abcdef");
        sb.setCharAt(1,'p'); //修改指定位置字符
        System.out.println("修改指定位置字符结果："+sb);
        sb.replace(1,3,"qq"); //替换指定位置字符串或字符
        System.out.println("替换指定位置字符(串)结果："+sb);
        System.out.println("字符串翻转结果："+sb.reverse());
    }
}
