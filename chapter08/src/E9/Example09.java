package E9;
import java.io.*;
public class Example09 {
    public static void main(String[] args) throws Exception{
        //创建一个FileWriter对象用于向文件中写入数据
        //FileWriter writer = new FileWriter("writer");
        FileWriter writer = new FileWriter("writer",true);

        String str = "你好，转播止咳";
        writer.write(str); //将字符数据写入到文本文件中
        writer.write("\r\n"); //将输出语句换行
        writer.close();
    }
}
