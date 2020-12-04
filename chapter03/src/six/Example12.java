package six;

/**
 * static关键字
 * static关键字只能修饰成员变量,不能用于修饰局部变量
 * 静态变量
 */
public class Example12 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student.schoolName = "传播止咳"; //为静态变量赋值
        System.out.println("我的学校是:"+ stu1.schoolName);
        System.out.println("我的学校是:"+ stu2.schoolName);
    }
}
class Student{
    //定义静态变量
    static String schoolName;
}
