package E30;

import java.io.File;

//Java中的删除目录是从虚拟机直接删除而不走回收站，文件将无法恢复
//因此在进行删除操作的时候需要格外小心
public class Example30 {
    public static void main(String[] args) {  //能自己删除自己
        File file = new File("/Volumes/张佳奇/IdeaProjects/code/chapter08/src/E30");  //创建一个代表目录的File对象
        deleteDir(file);
    }
    public static void deleteDir(File dir){
        if (dir.exists()){ //判断传入的File对象是否存在
            File[] files = dir.listFiles();  //得到File数组
            for (File file : files){  //遍历所有的子目录和文件
                if (file.isDirectory()){
                    deleteDir(file);  //如果是目录，递归调用deleteDir()
                } else {
                    //如果是文件，直接删除
                    file.delete();
                }
            }
            //删除完一个目录里的所有文件后，就删除这个目录
            dir.delete();
        }
    }
}