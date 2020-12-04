package four.E15;

//定义测试类
public class Example15 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        animalShout(dog);

    }
    /*public static void animalShout(Animal animal) { //运行时报错，因为猫不能强转为狗，猫狗这两者没有关系
        Cat cat = (Cat)animal;
        cat.shout();
        cat.sleep();
    }*/
    public static void animalShout(Animal animal) {
        if (animal instanceof Cat){  //用于判断这个传入的动物是不是Cat
            Cat cat = (Cat)animal;
            cat.shout();
            cat.sleep();
        }else {
            System.out.println("that animal is not a cat");
        }

    }
}
//定义接口
interface Animal{
    void shout();  //定义抽象方法
}
//定义Cat类实现Animal接口
class Cat implements Animal {

    //实现抽象方法shout()
    public void shout() {
        System.out.println("喵喵......");
    }

    //定义sleep()方法
    void sleep(){
        System.out.println("猫睡觉......");
    }
}
//定义Dog类实现Animal接口
class Dog implements Animal{

    @Override
    public void shout() {
        System.out.println("汪汪......");
    }
}


