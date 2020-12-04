package E3;
import java.io.*;
public class Example03 {
    public static void main(String[] args) {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("example",true);
            String str = "欢迎你";
            byte[] b = str.getBytes();
            for (int i = 0; i < b.length; i++) {
                out.write(b[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        /*FileOutputStream out = new FileOutputStream("example",true);
        String str = "欢迎你";
        byte[] b = str.getBytes();
        for (int i = 0; i < b.length; i++) {
            out.write(b[i]);
        }
        out.close();*/
    }
}
