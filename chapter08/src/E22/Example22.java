package E22;
import java.io.*;

/**
 * 8.3.7 CharArrayReader 和 CharArrayReader
 *  和上一个只不过是操作的数据是字符
 */
public class Example22 {
    public static void main(String[] args) throws Exception{
        FileReader reader = new FileReader("test");
        CharArrayWriter caw = new CharArrayWriter(); //在内存中创建一个字符数组缓冲区
        //下面的代码是将数据写入缓冲区
        int b;
        while ((b=reader.read()) != -1){
            caw.write(b); //将读取到的字符写入缓冲区
        }
        reader.close();
        caw.close();
        char[] c = caw.toCharArray();  //将缓冲区中的数据类型转换成字符型数组
        CharArrayReader cr = new CharArrayReader(c); //读取字符数组中的数据
        //下面的代码是从缓冲区中读取数据，并进行打印
        int i = 0;
        while ((i=cr.read()) != -1){
            System.out.println((char)i);
        }
    }
}
