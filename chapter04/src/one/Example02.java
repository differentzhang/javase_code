package one;

/**
 * 4.1.2 重写父类方法
 */
public class Example02 {
    public static void main(String[] args) {
        Dog_one dog_one = new Dog_one();
        dog_one.shout();
    }

}
//定义动物类
class Animal_one{
    //定义动物叫的方法
    void shout(){
        System.out.println("动物发出叫声");
    }
}
//定义Dog类继承Animal类
class Dog_one extends Animal_one{
    //定义狗叫的方法
    public void shout(){
        System.out.println("汪汪......🐶");
    }
}

