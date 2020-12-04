package homework;
import java.io.*;
public class Test02 {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String passwd = "";
        boolean b = false;


        for (int i = 0; i < 5; i++) {
            System.out.print("请输入密码：");
            passwd = br.readLine();
            if (passwd.endsWith("123456")){
                System.out.println("恭喜您进入游戏");
                b = true;
                break;
            }
        }
        if (!b){
            System.out.println("密码错误，游戏错误");
            System.exit(0);
        }
    }
}
