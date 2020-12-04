package Set.E11;
import java.util.HashSet;

public class Example11 {  //先比较hashCode然后在equals方法
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        Student stu1 = new Student("1","Jack");
        Student stu2 = new Student("2","Rose");
        Student stu3 = new Student("2","Rose");
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        System.out.println(hs);
    }
}
class Student{
    String id;
    String name;
    public Student(String id,String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){  //重写toString方法
        return id+":"+name;
    }

    //重写hashCode方法
    public int hashCode(){
        return id.hashCode();  //返回id属性的哈希值
    }
    //重写equals方法
    public boolean equals(Object obj){
        if (this == obj){ //判读是否是同一个对象
            return true;  //如果是，直接返回true
        }
        if (!(obj instanceof Student)){ //判断对象是Student类型
            return false; //如果对象不是Student类型，返回false
        }
        Student stu = (Student)obj;  //将对象强转为Student类型
        boolean b = this.id.equals(stu.id); //判断id值是否相同
        return b;
    }
}
