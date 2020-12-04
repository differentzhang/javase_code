package E12;
import java.io.*;

/**
 * 转换流
 * 只能针对操作文本文件的字节流进行转换，
 * 如果字节流操作的是一张图片，
 * 此时转换为字符流就会造成数据丢失。
 */
public class Example12 {
    public static void main(String[] args) throws Exception{
        FileInputStream in = new FileInputStream("reader");
        InputStreamReader isr = new InputStreamReader(in);  //将字节流输入转换成字符输入流
        BufferedReader br = new BufferedReader(isr);  //对字符流对象进行包装

        FileOutputStream out = new FileOutputStream("ddd");
        OutputStreamWriter osw = new OutputStreamWriter(out);//将字节输出流转换成字符输出流
        BufferedWriter bw = new BufferedWriter(osw); //对字符输出流对象进行包装

        String line;
        while ((line= br.readLine()) != null){
            osw.write(line);
        }
        br.close();
        bw.close();
    }
}
