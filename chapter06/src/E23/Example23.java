package E23;

import java.util.Calendar;

/**
 * 6.5.2 Calendar (日历) 类
 *          Calendar的常用方法
 * int get(int field)                         //返回指定日历字段的值
 * void add(int field, int amount)           //根据日历规则,为指定的日历字段增加或减去指定的时间量.
 * void set(int field, int value)           //为指定日历字段设置指定值
 * void set(int year, int month, int date) //设置Calendar对象的年,月,日三个字段的值.
 * void set(int year, int month, int date, int hourOfDay, int minute, int second)
 *                                       //设置Calendar对象的年,月,日,时分秒六个字段的值
 */
public class Example23 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); //获取表示当前时间的Calendar对象
        int year = calendar.get(calendar.YEAR); //获取当前年份
        int month = calendar.get(calendar.MONTH)+1;//获取当前月份, 因为月份起始是从0开始的
        int date = calendar.get(calendar.DATE); //获取当前日
        int hour = calendar.get(calendar.HOUR); //获取时
        int minute = calendar.get(calendar.MINUTE); //获取分
        int second = calendar.get(calendar.SECOND); //获取秒
        System.out.println("当前时间为:"+year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒");
    }
}
