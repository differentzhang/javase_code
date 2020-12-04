package five;

//我的理解：由于divide方法向上抛异常，main方法可以捕获也可以再向上抛，但是不可以不管,
//我的理解是正确的
public class Example23 {
    public static void main(String[] args) throws Exception{
        //java: 未报告的异常错误java.lang.Exception; 必须对其进行捕获或声明以便抛出
        int result = divide(4,2); //调用divide()方法
        System.out.println(result);
    }

    //下面的方法实现了两个整数相除，并使用throws关键字声明抛出异常
    private static int divide(int x, int y) throws Exception{
        int result = x / y;
        return result;
    }
}
