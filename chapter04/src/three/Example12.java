package three;

/**
 * 接口大总结
 * 一、接口中的方法都是抽象的，不能实例化对象。
 * 二、当一个类实现接口时，如果这个类是抽象的，则实现接口中的部分方法即可，否则需要实现接口中的所有方法
 * 三、一个类通过implements关键字实现接口时，可以实现多个接口，被实现的多个接口之间要用逗号隔开。
 * 四、一个接口可以通过extends关键字继承多个接口，接口之间用逗号隔开。
 * 五、一个类在继承另一个类的同时还可以实现接口，此时，extends关键字必须位于implements关键字之前
 * 例: class Dog extends Person implements Animal{} //先继承，后实现
 */
public class Example12 {
    public static void main(String[] args) {
        Dog_two dog_two = new Dog_two();
        dog_two.breathe();
        dog_two.run();
        dog_two.liveOnLand();
    }
}
interface Animal_two{
    int ID = 1;
    void breathe();
    void run();
}

//定义LandAnimal接口，并继承了Animal接口
interface LandAnimal extends Animal_one{ //接口是可以继承的
    void liveOnLand();
}

//Dog类实现了Animal接口
class Dog_two implements LandAnimal{

    //实现breathe()方法
    public void breathe() {
        System.out.println("狗在呼吸");
    }

    //实现run()方法
    public void run() {
        System.out.println("狗在跑");
    }

    //实现liveOnLand()方法
    public void liveOnLand() {
        System.out.println("狗生活在陆地上");
    }
}
