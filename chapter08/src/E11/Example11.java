package E11;
import java.io.*;

/**
 * LineNumberReader
 */
public class Example11 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("chapter08/src/E9/Example09.java");
        FileWriter fw = new FileWriter("copy.java");
        LineNumberReader lr = new LineNumberReader(fr);  //包装
        lr.setLineNumber(0);  //设置读取文件的起始行号
        String line = null;
        while ((line=lr.readLine()) != null){
            fw.write(lr.getLineNumber()+":"+line); //将行号写入到文件中
            fw.write("\r\n");
        }
        lr.close();
        fw.close();

    }
}
