package four;

public class Example10 {
    public static void main(String[] args) {
        Person p =new Person("itcast");//实例化Person对象
    }
}
class Person{
    public Person(){
        System.out.println("无参的构造方法被调用了......");
    }
    public Person(String name){
        this(); //调用无参的构造方法
        System.out.println("有参的构造方法被调用了......");
    }
}