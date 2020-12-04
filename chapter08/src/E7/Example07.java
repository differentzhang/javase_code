package E7;

import java.io.*;

/**
 * 8.1.6 字节缓冲流
 * 使用了装饰设计模式
 * 在读写时提供了缓冲功能
 * 这两个流内部都定义了一个大小为8192的字节数组， 工作原理与前一个例子的字节流的缓冲区类似。
 */
public class Example07 {
    public static void main(String[] args) throws Exception{
        //创建一个带缓冲区的输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test"));

        //创建一个带缓冲区的输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("ddd"));

        int len;
        while ((len=bis.read()) != -1){
            bos.write(len);
        }

        bos.close();
        bis.close();
    }
}
