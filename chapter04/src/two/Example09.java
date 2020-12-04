package two;

import javax.xml.namespace.QName;

public class Example09 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.introduce();
    }
}
class Student{
    //使用final关键字修饰name属性
//     final String name; //变量 name 未在默认构造器中初始化,
    final String name = "李芳"; //必须赋值，只有一次次，可以在这里赋值，也可以在构造器中赋值

    //定义introduce()方法，打印学生信息
    public void introduce(){
        System.out.println("我是一个学生，我叫"+name);
    }
}
