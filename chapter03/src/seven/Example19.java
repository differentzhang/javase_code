package seven;

/**
 * 3.7.3 方法内部类
 */
public class Example19 {
    public static void main(String[] args) {
        Outer outer = new Outer(); //创建外部类对象
        outer.test(); //调用test()方法
    }
}
class Outer_twe{
    private int num = 4;  //定义成员变量
    public void test(){
        //下面是在方法中定义的内部类
        class Inner{
            void show(){
                System.out.println("num="+num); //访问外部类的成员变量
            }
        }
        Inner inner = new Inner(); //创建内部类对象
        inner.show(); //调用内部类的方法
    }
}