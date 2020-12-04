package E26;

import java.io.File;

/**
 * 8.4.2 遍历目录下的文件
 */
public class Example26 {
    public static void main(String[] args) {
        File file = new File("/Volumes/张佳奇/IdeaProjects/code");
        if (file.isDirectory()){  //判断File对象对应的目录是否存在
            String[] names = file.list(); //获取目录下的所有文件的文件名
            for (String name : names){
                System.out.println(name);  //输出文件名
            }
        }
    }
}
