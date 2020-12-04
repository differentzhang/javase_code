package six;

/**
 * 3.6.4单例模式
 *
 */
public class Example15 {
    public static void main(String[] args) {
        Single s1 = Single.getINSTANCE();
        Single s2 = Single.getINSTANCE();

        /*Single s1 = Single.INSTANCE;
        Single s2 = Single.INSTANCE;*/

        System.out.println(s1 == s2);
    }
}
class Single{
    //自己创建一个对象
    private static Single INSTANCE = new Single();

    //私有化构造方法
    private Single(){

    }

    //提供返回该对象的静态方法
    public static Single getINSTANCE(){
        return INSTANCE;
    }
}
/*还可以写成这种样子
class Single{
    private Single(){

    }
    public static final Single INSTANCE = new Single();
}*/
