package E15;

import java.io.*;

/**
 * 8.3.2 DataInputStream和DateOutputStream
 *    //只有读取数据的顺序与写数据的顺序保持一致，才能保证最终数据的正确性
 */
public class Example15 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("dataStream.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);
        dos.writeByte(12);  //写一个字节
        dos.writeChar('1');  //写一个字符
        dos.writeBoolean(true); //写一个布尔值
        dos.writeUTF("同学，你好"); //写一个转换成UTF-8的字符串
        dos.close(); //关闭流
        FileInputStream fis = new FileInputStream("dataStream.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream(bis);
        System.out.println(dis.readByte());
        System.out.println(dis.readChar());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readUTF());
        dis.close();
    }
}
