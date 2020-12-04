package E4;

/**
 * 3. 字符串的替换和去除空格操作
 */
public class Example04 {
    public static void main(String[] args) {
        String s = "itcast";
        //字符串替换操作
        System.out.println("将it替换成cn.it的结果："+s.replace("cn","cn.it"));
        //字符串去除空格操作
        String s1 = " i t c a s t ";
        System.out.println("去除字符串两端的空格后的结果"+s1.trim());
        System.out.println("去除字符串中所有空格的结果"+s1.replace(" ",""));
    }
}
