package one;

/*
在定义一个类的时候，如果没有特殊需求，尽量在类中定义一个无参的构造方法，
避免被继承时出现错误
 */
public class Example05{
    public static void main(String[] args){
        Dog_four dog_four = new Dog_four();  //创建一个Dog对象
    }
}

class Animal_four{

    //定义Animal无参的构造方法
    public Animal_four() {
        System.out.println("我是一只动物");
    }

    //定义Animal类有参的构造方法
    public Animal_four(String name){
        System.out.println("我是一只"+name+"🐶");
    }
}
//定义Dog类继承Animal类
class Dog_four extends Animal_four{
    public Dog_four(){
        //这里什么都不写，想当于是super();
        //也就是调用父类无参数的构造方法
    }
}

