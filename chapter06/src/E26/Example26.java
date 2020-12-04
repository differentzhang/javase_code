package E26;

import java.text.DateFormat;
import java.util.Date;

/**
 * 6.5.3 DateFormat类
 *          DateFormat类的常用方法
 * static DateFormat getDateInstance() //用于创建默认语言环境和格式化风格的日期格式器
 * static DateFormat getDateInstance(int style) //用于创建默认语言环境和指定格式化风格的日期格式器
 * static DateFormat getDateTimeInstance() //用于创建默认语言环境和格式化风格的日期/时间格式器
 * static DateFormat getDateTimeInstance(int dateStyle,int timeStyle) //用于创建默认语言环境和指定格式化风格的日期/时间格式器
 * String format(Date date) //将一个date格式化为日期/时间字符串
 * Date parse(String source) //将给定字符串解析成一个日期
 */
public class Example26 {
    public static void main(String[] args) {
        Date date = new Date();
        //Full格式的日期格式器对象
        DateFormat fullFormat = DateFormat.getDateInstance(DateFormat.FULL);
        //Long格式的日期格式器对象
        DateFormat longFormat = DateFormat.getDateInstance(DateFormat.LONG);
        //medium格式的日期/时间 格式器对象
        DateFormat mediumFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        //short格式的日期/时间格式器对象
        DateFormat shortFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        //下面打印格式化后的日期或者日期/时间
        System.out.println("当前日期的完成格式为:"+fullFormat.format(date));
        System.out.println("当前日期的长格式为:"+longFormat.format((date)));
        System.out.println("当前日期的普通格式为:"+mediumFormat.format(date));
        System.out.println("当前日期的短格式为:"+shortFormat.format(date));
    }
}
