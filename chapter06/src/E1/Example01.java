package E1;

/**
 * 第六章 Java API
 * 6.1 String类和StringBuffer类
 * 6.1.1 String类的初始化
 */
public class Example01 {
    public static void main(String[] args) {
        //创建一个空的字符串
        String str1 = new String();
        //创建一个内容为abcd的字符串
        String str2 = new String("abcd");
        //创建一个内容为字符数组的字符串
        char[] charArray = new char[]{'D','E','F'};
        String str3 = new String(charArray);
        System.out.println("a"+str1+"b");
        System.out.println(str2);
        System.out.println(str3);
    }
}
