package E13;

import java.io.*;
//反序列化     好像必须在一个包下
public class Example14 {
    public static void main(String[] args) throws Exception{
        //创建文件输入流对象，用于读取指定文件的数据
        FileInputStream fis = new FileInputStream("objectStream.txt");
        //创建对象输入流对象，并且从指定的输入流中读取数据
        ObjectInputStream ois = new ObjectInputStream(fis);
        //从objectStream.txt中读取Person对象
        Person p = (Person) ois.readObject();
        System.out.println("------从文件中读取后---------");
        System.out.println("Person对象的id："+p.getId());
        System.out.println("Person对象的name："+p.getName());
        System.out.println("Person对象的age："+p.getAge());

    }
}