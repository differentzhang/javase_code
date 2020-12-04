package E18;
import java.io.*;
/**
 *          重定向流常用的静态方法
 *  void setIn(InputStream in)   //对标准输入流重定向
 *  void serOut(PrintStream out)  //对标准输出流重定向
 *  void serErr(PrintStream out)  //对标准错误输出流重定向
 */
public class Example18 {
    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("ddd"));  //对输入流进程重定向
        System.setOut(new PrintStream("example"));  //对输出流进程重定向
        //读取键盘输入的字符
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line=br.readLine()) != null){  //判断读取到的一行是否有数据
            System.out.println(line);
        }
    }
}
