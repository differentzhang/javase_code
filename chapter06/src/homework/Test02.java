package homework;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); //获取Calendar对象

        calendar.add(Calendar.DATE,100);  //加100天
        Date date = calendar.getTime();  //返回Date类型对象
        DateFormat format = DateFormat.getDateInstance(DateFormat.FULL); //FULL格式的日期格式器对象,
        String string = format.format(date); //format:将Date格式化为日期/时间字符串
        System.out.println(string);
    }
}
