package three;

/**
 * 4.3 抽象类和接口
 * 不包含方法体的方法为抽象方法
 */
public class Example10 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();
    }
}
//定义抽象类Animal
abstract class Animal{
    //定义抽象方法shout()
    abstract void shout();

}
//定义Dog类继承抽象类Animal
class Dog {  //抽象类Animal中的abstract修饰的方法不必须都实现，想实现哪个就实现哪个.
    //实现抽象方法shout()
    void shout() {
        System.out.println("汪汪🐶🐶......");
    }

}