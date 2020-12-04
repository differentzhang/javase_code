package one;

public class Example04{
    public static void main(String[] args){
        Dog_three dog_three = new Dog_three();  //创建一个Dog对象
    }
}

class Animal_three{
    //定义Animal类有参的构造方法
    public Animal_three(String name){
        System.out.println("我是一只"+name+"🐶");
    }
}
//定义Dog类继承Animal类
class Dog_three extends Animal_three{
    public Dog_three(){
        super("沙皮狗");
    }
}

