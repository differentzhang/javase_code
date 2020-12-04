package E5;

import java.io.*;

/**
 * 8.1.4 字节流缓冲区
 */
public class Example05 {
    public static void main(String[] args) throws Exception{
        InputStream in = new FileInputStream("source/迷失幻境.mp4");

        OutputStream out = new FileOutputStream("target/迷失幻境4.mp4");

        //以下是用缓冲区读写文件
        byte[] buff = new byte[1024];  //定义一个字节数组，作为缓冲区
        int len;
        long beginTime = System.currentTimeMillis();
        while ((len=in.read(buff)) != -1){
            out.write(buff,0,len);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("拷贝文件所消耗的时间是："+(endTime-beginTime)+"毫米");
        in.close();
        out.close();
    }
}
