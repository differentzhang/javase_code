package homework_P162;


public class Demo {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.speak();
        People people = new People();
        people.speak();
        people.think();
    }
}
class Monkey{
    int age;

    public Monkey() {
    }

    public Monkey(int age) {
        this.age = age;
    }

    public void speak(){
        System.out.println("咿咿呀呀......");
    }
}
class People extends Monkey{
    String name;

    public People() {
    }

    public People(String name) {
        this.name = name;
    }

    public void speak(){
        System.out.println("小样的，不错嘛！会说话了！");
    }
    void think(){
        System.out.println("别说话！认真思考！");
    }
}