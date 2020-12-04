package E1;

/**
 * 第八章 IO(输入输出)
 * InputStream:字节输入流
 * OutputStream:字节输出流
 *
 *          InputStream常用的方法
 * int read()                           //从输入流读取一个8位的字节，把它转换为0～255之间的整数，并返回这一整数
 * int read(byte[] b)                   //从输入流读取若干字节，把它们保存到参数b指定的字节数组中，返回的整数表示读取字节数
 * int read(byte[], int off, int len)  //从输入流读取若干字节，把它们保存到参数b指定的字节数组中，返回的整数表示读取字节数
 *                                     //off指定字节数组开始保存数据的起始下标，len表示读取的字节数目。
 * void close()                        //关闭此输入流并释放与该流关联的所有系统资源。
 *
 *            InputStream常用的方法
 *  void write(int b)                       //向输出流写入一个字节
 *  void write(byte[] b)                   //把参数b指定的字节数组的所有字节写到输出流
 *  void write(byte[], int off, int len)  //将指定byte数组中从偏移量off开始的len个字节写入输出流
 *  void flush()                        //刷新此输出流并强制写出所有缓冲区的输出字节
 *  void close()                        //关闭此输出流并释放与此流相关的所有系统资源
 */
import java.io.*;
public class Example01 {
    public static void main(String[] args) throws Exception{
        //创建一个文件字节输入流
        FileInputStream in = new FileInputStream("test");
        int b = 0;  //定义一个int类型的变量b，记住每次读取的一个字节
        while (true){
            b = in.read();  //变量b记住读取的一个字节
            if (b == -1){  //如果读取的字节为-1，跳出while循环
                break;
            }
            System.out.println(b); //否则将b写出
        }
        in.close();
    }
}
