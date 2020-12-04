package one;

/**
 * 面向对象（下）
 * 4.1 类的继承
 *  :子类在继承父类的时候会自动拥有父类所有成员
 *  java中，类只支持单继承，不允许多重继承
 */
public class Example01{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.name = "沙皮狗";
        dog.printName();
        dog.shout();
    }
}

class Animal{
    String name; //定义name属性

    //定义动物叫的方法
    void shout(){
        System.out.println("动物发出叫声");
    }
}
//定义Dog类继承Animal类
class Dog extends Animal{
    //定义一个打印name的方法
    public void printName(){
        System.out.println("name="+name);
    }
}