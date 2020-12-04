package E29;
import java.io.*;
/**
 * 8.4.3 删除文件及目录
 */
public class Example29 {
    public static void main(String[] args) {
        File file = new File("/Volumes/张佳奇/IdeaProjects/code/chapter08/src/E2");  //这是一个代表目录的File对象
        if (file.exists()){  //判断文件或目录是否存在
            System.out.println(file.delete()); //false
            /*
            File类的delete()方法只是删除一个指定文件，假如File对象代表目录，并且目录下包含子目录或文件
            则File类的delete()方法不允许对这个目录直接删除。
            这种情况下，需要通过递归的方式将整个目录以及其中的文件全部删除
             */
        }
    }
}
