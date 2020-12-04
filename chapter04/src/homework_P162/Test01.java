package homework_P162;

public class Test01 {
    public static void main(String[] args) {
        Student student = new Student("张三",18);
        Undergraduate undergraduate = new Undergraduate("李四",18,"博士");
        student.show();
        undergraduate.show();
    }
}
class Student{
    String name;
    int age;
/*
    public Student(){

    }*/
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show(){
        System.out.println(name+","+age);
    }
}
class Undergraduate extends Student{
    String degree;

    public Undergraduate(String name, int age, String degree) {
        super(name,age);
        this.degree = degree;
    }

    void show(){
        System.out.println(name+","+age+","+degree);
    }
}