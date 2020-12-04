package E21;

/**
 * 1. 包装类都Object类中的toString()方法,以字符串的形式返回被包装的基本数据类型的值.
 * 2. 除了Character外,包装类都有valueOf(String s)方法,可以根据String类型的参数创建包装类对象,
 * 但是参数字符串s不能为null,而且字符串必须是可以解析为相应基本数据类型的数据,否则虽然编译通过,但运行时会报错.
 * 3. 除了Character外,包装类都有parseXXX(String s) 的静态方法,将字符串转换为对应的基本数据类型,
 * 参数s不能为null,而且同样必须是可以解析为相应基本数据类型的数据.否则,虽然编译通过,但是运行时会报错.
 * JDK5.0新特性---自动拆箱和装箱
 */
public class Example21 {
    public static void main(String[] args) {
        int w = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);
        for (int i = 0; i < h; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < w; j++) {
                sb.append("*");
            }
            System.out.println(sb.toString());
        }
    }
}
