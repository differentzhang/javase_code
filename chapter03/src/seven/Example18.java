package seven;

/**
 * 3.7.2静态内部类
 */
public class Example18 {
    public static void main(String[] args) {
        Outer_one.Inner inner = new Outer_one.Inner(); //创建内部类对象
        inner.show(); //调用内部类的方法
    }
}
class Outer_one{
    private static int num = 6;
    //下面代码定义了一个静态内部类
    static class Inner{
        void show(){
            System.out.println("num="+num);
        }
    }
}