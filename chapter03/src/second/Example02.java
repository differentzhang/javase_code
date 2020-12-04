package second;

public class Example02 {
    public static void main(String[] args){
        Person_one p2 = new Person_one();
        p2.say();
        p2=null;
        p2.say();
    }
}

class Person_one{
    void say(){
        System.out.println("我是一个人!");
    }
}
