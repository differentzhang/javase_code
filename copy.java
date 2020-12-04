1:package E9;
2:import java.io.*;
3:public class Example09 {
4:    public static void main(String[] args) throws Exception{
5:        //创建一个FileWriter对象用于向文件中写入数据
6:        //FileWriter writer = new FileWriter("writer");
7:        FileWriter writer = new FileWriter("writer",true);
8:
9:        String str = "你好，转播止咳";
10:        writer.write(str); //将字符数据写入到文本文件中
11:        writer.write("\r\n"); //将输出语句换行
12:        writer.close();
13:    }
14:}
