package E13;
import java.io.*;
/**
 * 8.3 其他IO流
 * 8.3.1 ObjectInputStream 和 ObjectOutputStream
 */
public class Example13 {
    public static void main(String[] args) throws Exception{
        Person p = new Person("p1","zhangsan",20);
        System.out.println("-----------写入文件前----------");
        System.out.println("Person对象的id："+p.getId());
        System.out.println("Person对象的name："+p.getName());
        System.out.println("Person对象的age："+p.getAge());
        //创建文件输出流对象,将数据写入objectStream.txt文件中
        FileOutputStream fos = new FileOutputStream("objectStream.txt");
        //创建对象输出流对象, 用于处理输出流对象写入的数据
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //将Person对象输出到输入流中
        oos.writeObject(p);

    }
}
class Person implements Serializable{  //Serializable:可序列化
    private String id;
    private String name;
    private int age;
    public Person(String id,String name,int age){
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}