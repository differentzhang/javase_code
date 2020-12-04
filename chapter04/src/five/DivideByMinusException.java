package five;

/**
 * 4.5.5 自定义异常
 */
//下面的代码是自定义一个异常类继承自Exception
public class DivideByMinusException extends Exception{
    public DivideByMinusException() {
        super(); //调用Exception无参数的构造方法
    }

    public DivideByMinusException(String message) {
        super(message);  //调用Exception有参的构造方法
    }
}
