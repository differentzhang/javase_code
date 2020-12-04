package four.E19;

public class Example19 {
    public static void main(String[] args) {
        //定义匿名内部类作为参数传递给animalShout()方法
        animalShout(new Animal() {
            //实现shout()方法
            public void shout() {
                System.out.println("喵喵......");
            }
        });

    }

    //定义静态方法animalShout()
    public static void animalShout(Animal an){
        an.shout();
    }
}
//定义Animal接口
interface Animal{
    void shout(); //定义抽象方法shout()
}
