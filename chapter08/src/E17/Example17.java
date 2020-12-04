package E17;
import java.io.*;
/**
 * 8.3.4 标准输入输出流
 * System定义了三个常量：int、out和err
 * in: 为InputStream类型，他是标准输入流，默认情况下用于读取键盘输入的数据
 * out: 为PrintStream类型，他是标准输出流，默认将数据输出到命令窗口
 * err: 也是PrintStream类型，他是标准错误流，它和out一样也是将数据输出到控制台。不同的是，err通常输出的是应用程序运行时的错误信息
 */
public class Example17 {
    public static void main(String[] args) throws Exception{
        StringBuffer sb = new StringBuffer();
        int ch;
        //while循环用于读取键盘输入的数据
        while ((ch=System.in.read()) != -1){  //判断是否读取到数据的末尾
            //对输入的字符进行判断，如果是回车"\r"或者换行"\n"，则跳出循环
            if (ch=='\r' || ch=='\n'){
                break;
            }
            sb.append((char)ch); //将读取到数据添加到sb中
        }
        System.out.println(sb);
    }
}
