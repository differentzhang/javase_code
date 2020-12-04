package E7;

public class Example07 {
    public static void main(String[] args) {
        String s = "abcdedcba";
        System.out.println(s.charAt(10)); //StringIndexOutOfBoundsException(字符串角标越界异常)
    }
}
