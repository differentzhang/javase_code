package four.E16;

/**
 * 4.4.3 Object类
 */
public class Example16 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.toString() );
    }
}
class Animal {
    //定义动物叫的方法
    void shout(){
        System.out.println("动物叫！");
    }
}