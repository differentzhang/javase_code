package one;

/**
 * super关键字
 *
 */
public class Example03{
    public static void main(String[] args){
        Dog_two dog_two = new Dog_two();  //创建一个Dog对象
        dog_two.shout();  //调用dog重写的shout()方法
        dog_two.printName();  //调用dog重写的printName()方法
    }
}

class Animal_two{
    String name = "动物";

    //定义动物叫的方法
    void shout(){
        System.out.println("动物发出叫声");
    }
}
//定义Dog类继承Animal类
class Dog_two extends Animal_two{
    String name = "犬类";

    //重写父类的shout方法
    void shout(){
        super.shout();   //访问父类的成员方法
    }

    //定义打印name的方法
    void printName(){
        System.out.println("name="+super.name);   //访问父类的成员变量
    }
}
