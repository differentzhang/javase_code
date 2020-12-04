package homework;
import java.io.*;
public class Test01 {
    public static void main(String[] args) throws Exception{
        //字节流拷贝
        FileInputStream fis = new FileInputStream("1.txt");
        FileOutputStream fos = new FileOutputStream("11.txt");

        int len;
        byte[] b1 = new byte[1024];
        while ((len=fis.read(b1)) != -1){
            fos.write(b1,0,len);
        }
        fis.close();
        fos.close();

        //字符流拷贝
        FileReader reader = new FileReader("1.txt");
        BufferedReader br = new BufferedReader(reader);
        FileWriter writer = new FileWriter("111.txt");
        BufferedWriter bw = new BufferedWriter(writer);
        String len1 = null;
        while ((len1=br.readLine()) != null){
            bw.write(len1);
            bw.newLine(); //换行
        }
        br.close();
        bw.close();

    }
}
