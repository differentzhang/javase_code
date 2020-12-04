package E20;

/**
 *    Integer 类的常用方法
 * toBinaryString(int i)  //以二进制无符号整数形式返回一个整数参数的字符串
 * toHexString(int i)   //以十六机制无符号整数形式返回一个整数参数的字符串
 * toOctalString(int i)  //以八进制无符号整数形式返回一个整数参数的字符串
 * valueOf(int i)  //返回一个表示指定的int值的Integer实例
 * valueOf(String s)  //返回保存指定的String值的Integer对象
 * parseInt(String s) //将字符串参数作为有符号的十进制整数进行解析
 * intValue()  //将Integer类型的值以int类型返回
 */
public class Example20 {
    public static void main(String[] args) {
        Integer num = new Integer(20);
        int a = 10;
        int sum = num.intValue() + a;
        System.out.println("sum="+sum);
    }
}
