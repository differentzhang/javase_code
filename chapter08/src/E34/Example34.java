package E34;

import java.io.*;

/**
 * 8.6.3 字符传输
 */
public class Example34 {
    public static void main(String[] args) throws Exception{
        //创建InputStreamReader对象
        Reader reader = new InputStreamReader(new FileInputStream("1.txt"),"GBK");
        //创建OutputStreamWriter对象
        Writer writer = new OutputStreamWriter(new FileOutputStream("2.txt",true),"UTF-8");
        char[] chs = new char[100];  //定义一个字符数组
        int len;
        len = reader.read(chs);  //将文件的内容读取到字符数组
        String string = new String(chs,0,len);
        writer.write(string);
        reader.close();
        writer.close();
    }
}
