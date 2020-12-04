package E8;
import java.io.*;
/**
 * 8.2 字符流
 */

//8.2.2 字符流操作文件
public class Example08 {
    public static void main(String[] args) throws Exception{
        //创建一个FileReader对象来读取文件中的字符
        FileReader reader = new FileReader("reader");

        int ch;  //定义一个变量用于记录读取的字符
        while ((ch=reader.read()) != -1){
            System.out.println((char) ch);
        }
        reader.close();
    }
}
