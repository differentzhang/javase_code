package E31;

import java.io.RandomAccessFile;
import java.util.Random;
import java.util.RandomAccess;

/**
 * 8.5 RandomAccessFile
 *          RandomAccessFile的构造方法
 * RandomAccessFile(File file, String mode)  //参数file指定被访问的文件
 * RandomAccessFile(String name, String mode)  //参数name指定被访问的文件路径
 *
 *          RandomAccessFile定位文件位置的方法
 * long getFilePointer()    //返回当前读写指针所处的位置
 * void seek(long pos)  //设定读写指针的位置，与文件开头相隔pos个字节数
 * int skipBytes(int n)  //使读写指针从当前位置开始，跳过n个字节
 * void setLength(long newLength)  //设置此文件的长度
 */
public class Example31 {
    public static void main(String[] args) throws Exception{
        RandomAccessFile raf = new RandomAccessFile("time.txt","rw");
        int times = 0; //int类型的变量表示试用次数
        times = Integer.parseInt(raf.readLine());  //第一次读取文件时times为5
        if (times>0){
            //试用一次，次数减少一次
            System.out.println("您还可以试用"+times--+"次!");
            raf.seek(0);  //使记录指针指向文件的开头
            raf.writeBytes(times+"");  //将剩余的次数再次写入文件
        } else {
            System.out.println("软件试用次数已到"); //当time<=0，告诉用户试用期已到
        }
        raf.close();  //关闭RandomAccessFile对象
    }
}
