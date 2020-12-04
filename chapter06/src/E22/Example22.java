package E22;

import java.util.Date;

/**
 * 6.5 Date类,Calender类,DateFormat类
 * 6.5.1 Date类
 */
public class Example22 {
    public static void main(String[] args) {
        Date date = new Date(); //创建表示当前时间的Date对象
        Date date1 = new Date(999999999999L); //创建表示时间戳的Date对象
        System.out.println(date);
        System.out.println(date1);
    }
}
