package five;

public class Example27 {
    public static void main(String[] args) {
        //下面代码定义一个try..catch语句用于捕获异常
        try {
            //调用divide()方法，传入一个负数作为除数
            int result = divide(4,-2);
            System.out.println(result);
        }catch (DivideByMinusException e){
            System.out.println(e.getMessage());
        }

    }

    //下面的方法实现了两个整数相除.
    private static int divide(int x, int y) throws DivideByMinusException{
        if (y<0){
            //使用throw关键字声明异常对象
            throw new DivideByMinusException("除数是负数");
        }
        int result = x / y;
        return result;
    }
}
