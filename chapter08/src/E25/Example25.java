package E25;

import java.io.File;

/**
 * 8.4 File 类
 * 8.4.1 File类常用的方法
 *          File类常用的构造方法
 * File(String pathname)    //通过指定一个字符串类型的文件路径来创建一个新的File对象
 * File(String parent, String child)  //根据指定的一个字符串类型的父路路径和一个字符串的子路径(包括文件名)创建一个File对象
 * File(File parent, String child)  //根据指定的File类的父路径和和一个字符串的子路径(包括文件名)创建一个File对象
 *
 *          File类的常用方法
 *  boolean exits() //判断File对象对应的文件或目录是否存在，若存在则返回true，否则返回false
 *  boolean delete() //删除File对象对应的文件或目录，若成功删除则返回true，否则返回false
 *  boolean createNewFile() //当File对象对应的文件不存在时，该方法将新建一个此File对象所指定的新文件，若创建成功则返回true，否则返回false
 *  String getName()
 *  String getPath()
 *  String getAbsolutePath()
 *  String getParent()
 *  boolean canRead()
 *  boolean canWrite()
 *  boolean isFile()
 *  boolean isDirectory()
 *  boolean isAbsolute()
 *  long lastModified()
 *  long length()
 *  String[] list()
 *  File[] listFile()
 */
public class Example25 {
    public static void main(String[] args) {
        File file = new File("example");

        System.out.println("文件名称："+file.getName());

        System.out.println("文件的相对路径："+file.getPath());

        System.out.println("文件的绝对路径："+file.getAbsolutePath());

        System.out.println("文件的父路径："+file.getParent());

        System.out.println(file.canRead() ? "文件可读" : "文件不可读");

        System.out.println(file.canWrite() ? "文件可写" : "文件不可写");

        System.out.println(file.isFile() ? "是一个文件" : "不是一个文件");

        System.out.println(file.isDirectory() ? "是一个目录" : "不是一个目录");

        System.out.println(file.isAbsolute() ? "是绝对路径" : "不是绝对路径");

        System.out.println("最后的修改时间为："+file.lastModified());

        System.out.println("文件大小为："+file.length()+"bytes");

        System.out.println("是否成功删除文件："+file.delete());
    }
}
