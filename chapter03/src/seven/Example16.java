package seven;

/**
 * 3.7。1成员内部类
 */
public class Example16 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
class Outer{
    private int num = 4; //定义类的成员变量

    //下面代码中定义了一个成员方法，方法中访问内部类
    public void test(){
        Inner inner = new Inner();
        inner.show();
    }

    //下面代码定义了一个成员内部类
    class Inner{
        void show(){
            //在成员内部类的方法中访问外部类的成员变量
            System.out.println("num="+num);
        }
    }

}