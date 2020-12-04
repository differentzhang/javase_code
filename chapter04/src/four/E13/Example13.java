package four.E13;

/**
 * 4.4 多态
 * 4.4.1
 */
public class Example13 {
    public static void main(String[] args) {
        Cat an1 = new Cat();
        Dog an2 = new Dog();
        animalShout(an1);
        animalShout(an2);
    }
    //定义一个静态的animalShout()方法，接收一个Animal类型的参数
    public static void animalShout(Animal an) {
        an.shout();
    }
}
//定义接口
interface Animal{
    void shout();  //定义抽象方法
}
//定义Cat类实现Animal接口
class Cat implements Animal{

    //实现shout()方法
    public void shout() {
        System.out.println("喵喵......");
    }
}
class Dog implements Animal{

    //实现shout()方法
    public void shout() {
        System.out.println("汪汪......");
    }
}

