package E25;

import java.util.Calendar;

public class Example25 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); //今天是11.18
        //把MONTH设置为13
        calendar.set(Calendar.MONTH,13);
        System.out.println(calendar.getTime());
        //开启non-lenient模式
        calendar.setLenient(false);
        calendar.set(Calendar.MONTH,13);  //再non-lenient模式下,月不在0~11范围内,所以会抛异常
        System.out.println(calendar.getTime());
    }
}
