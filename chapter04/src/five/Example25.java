package five;

public class Example25 {
    public static void main(String[] args) throws Exception{

        int result = divide(4,0); //调用divide()方法
        System.out.println(result);
    }

    //下面的方法实现了两个整数相除，并使用throws关键字声明抛出异常
    private static int divide(int x, int y) throws Exception{
        int result = x / y;
        return result;
    }
}
