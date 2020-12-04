package five;

public class Example26 {
    public static void main(String[] args) {
        int result = divide(4,-2);
        System.out.println(result);
    }

    //下面的方法实现了两个整数相除.
    private static int divide(int x, int y) {
        if (y<0){
            //使用throw关键字声明异常对象
            //throw new DivideByMinusException("除数是负数");//java: 未报告的异常错误five.DivideByMinusException; 必须对其进行捕获或声明以便抛出
        }
        int result = x / y;
        return result;
    }
}
