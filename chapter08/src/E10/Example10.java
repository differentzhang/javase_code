package E10;
import java.io.*;
public class Example10 {
    public static void main(String[] args) throws Exception{
        FileReader reader = new FileReader("reader");
        //创建一个BufferedReader缓冲对象
        BufferedReader br = new BufferedReader(reader);

        FileWriter writer = new FileWriter("writer");
        //创建一个BufferedWriter缓冲对象
        BufferedWriter bw = new BufferedWriter(writer);

        String str;
        while ((str=br.readLine()) != null){
            bw.write(str);
            bw.newLine(); //写入一个换行符号，该方法会根据不同的操作系统生成相应的换行符
        }
        br.close();
        bw.close();
    }
}
