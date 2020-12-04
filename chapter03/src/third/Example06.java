package third;

public class Example06 {
    public static void main(String[] args) {
        Person_one p = new Person_one(20);
        p.speak();
    }
}
class Person_one{
    int age;
    //定义有参数的构造方法
    public Person_one(int a){
        age = a;
    }
    public void speak(){
        System.out.println("I am "+age+" years old. !");
    }
}
