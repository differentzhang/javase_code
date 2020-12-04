package E16;
import java.io.*;
/**
 * PrintStream
 */
public class Example16 {
    public static void main(String[] args) throws Exception{
        //创建一个PrintStream对象，将FileOutputStream读取到的数据输出
        PrintStream ps = new PrintStream(new FileOutputStream("printStream"),true);
        Student stu = new Student();
        ps.print("这是一个数字:");
        ps.println(19);
        ps.println(stu);
    }
}
class Student{
    //重写Object的toString()方法
    public String toString(){
        return "我是一个学生";
    }
}
