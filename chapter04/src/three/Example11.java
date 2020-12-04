package three;

/**
 * 4.3.2 接口
 */
public class Example11 {
    public static void main(String[] args) {
        Dog_one dog_one = new Dog_one();
        dog_one.breathe();
        dog_one.run();
    }
}

interface Animal_one{  //因为接口中的方法都是抽象的，所以接口中的方法需要全都实现
//    接口中定义的方法都默认"public abstract"来修饰
//    接口中变量都默认"public static final"来修饰，即全局变量
    int ID = 1;  //定义全局变量
    void breathe();  //定义抽象方法breathe()
    void run();  //定义抽象方法run()
}
//Dog类实现了Animal接口
class Dog_one implements Animal_one{

    //实现breathe()方法
    public void breathe() {
        System.out.println("狗在呼吸");
    }

    //实现run()方法
    public void run() {
        System.out.println("狗在跑");
    }

}