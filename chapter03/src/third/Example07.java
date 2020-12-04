package third;

public class Example07 {
    public static void main(String[] args) {
        Person_two p1 = new Person_two("陈杰");
        //Person_two p3 = new Person_two();
        Person_two p2 = new Person_two("李芳",18);
        p1.speak();
        p2.speak();

    }
}

class Person_two{
    String name;
    int age;
    /*public Person_two(){

    }*/
    public Person_two(String name){
        this.name = name;
    }
    public Person_two(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void speak(){
        System.out.println("大家好, 我叫"+name+"我今年"+age+"岁");
    }
}
