package six;

/**
 * 3.6.3 静态代码块
 * 类加载时执行。
 * 由于类只加载一次,所以只执行一次。
 */

/**
 * 1、除了静态代码块之外，还有一种语句块叫做:实例语句块
 * 2、实例语句在类加载是并没有执行.
 * 3、实例语句语法?
 *  {
 * 	    java语句;
 * 	    java语句;
 *      java语句;
 *  }
 * 4、实例语句块在什么时候执行?
 * 	只要是构造方法执行，必然在构造方法执行之前，自动执行"实例语句块”中的代码。
 * 	实际上这也是SUN公司为java程序员准备一个特殊的时机，叫做对象构建时机。
 */
public class Example14 {
//    静态代码块
    //在main方法执行之前执行
    static{
        System.out.println("测试类的静态代码块执行了!");
    }
    public static void main(String[] args) {
        Person_one p1= new Person_one();
        Person_one p2= new Person_one();
    }
}
class Person_one{
    static String country;

    //只执行一次
    static{
        country = "chain";
        System.out.println("Person_one类中的静态代码块执行了");
    }
}
