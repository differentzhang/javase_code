package four.E14;

/**
 * 4.4 多态
 * 4.4.1
 */
//定义测试类
public class Example14 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        animalShout(cat);

    }
    //定义一个静态的animalShout()方法，接收一个Animal类型的参数
    /*public static void animalShout(Animal animal) {
        animal.shout();
        animal.sleep(); //java: 找不到符号
    }*/
    public static void animalShout(Animal animal) {
        Cat cat = (Cat)animal;
        cat.shout();
        cat.sleep();
    }
}
//定义接口
interface Animal{
    void shout();  //定义抽象方法
}
//定义Cat类实现Animal接口
class Cat implements Animal{

    //实现抽象方法shout()
    public void shout() {
        System.out.println("喵喵......");
    }

    //定义sleep()方法
    void sleep(){
        System.out.println("猫睡觉......");
    }
}


