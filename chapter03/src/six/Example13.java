package six;

/**
 * 3.6.2 静态方法
 * 	静态方法（静态方法不需要new对象，直接使用"类名."来访问
 * 	但是也可以使用"引用."来访问，不建议用。（因为其他程序员会感到困惑。)
 *
 * 	类 = 属性＋方法
 * 	属性描述的是:状态
 * 	方法描述的是:行为动作
 */
public class Example13 {
    public static void main(String[] args) {
        Person.sayHello();  //"类名."调用静态方法
    }
}
class Person{
    public static void sayHello(){ //定义静态方法
        System.out.println("Hello");
    }
}