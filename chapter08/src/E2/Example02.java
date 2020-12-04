package E2;
import java.io.*;
public class Example02 {
    public static void main(String[] args) throws Exception{
        //创建一个文件字节输出流
        FileOutputStream out = new FileOutputStream("example");
        String str = "传播止咳";
        byte[] b = str.getBytes();
        for (int i = 0; i < b.length; i++) {
            out.write(b[i]);  //写入
        }
        out.close(); //关闭流
    }
}
