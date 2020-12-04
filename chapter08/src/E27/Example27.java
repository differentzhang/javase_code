package E27;
import java.io.*;
//文件过滤器
public class Example27 {
    public static void main(String[] args) throws Exception{
        //创建File对象
        File file = new File("/Volumes/张佳奇/IdeaProjects/code");
        //创建过滤器对象
        FilenameFilter filter =new FilenameFilter() {
            //实现accept()方法
            @Override
            public boolean accept(File dir, String name) {
                File currFile = new File(dir,name);
                //如果文件名以.java结尾返回true，否则返回false
                if (currFile.isFile() && name.endsWith(".java")){
                    return true;
                } else {
                    return false;
                }
            }
        };
        if (file.exists()) {  //判断File对象对应的目录是否存在
            String[] lists = file.list(filter);  //获得过滤器后的所有文件名数组
            for (String name : lists){
                System.out.println(name);
            }

        }

    }
}
