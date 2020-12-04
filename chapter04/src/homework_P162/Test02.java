package homework_P162;

/**
 * company: www.abc.com
 * Author: Administrator
 * Create Data: 2020/11/3 0003
 */
public class Test02 {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.area(2.0));
        Circle circle = new Circle();
        System.out.println( circle.area(3.0));
    }
}

interface Shape{
    double area(Double d);
}
class Square implements Shape{

    @Override
    public double area(Double d) {
        return d*d;
    }
}
class Circle implements Shape{

    @Override
    public double area(Double d) {
        return (d*d*3.14);
    }
}
