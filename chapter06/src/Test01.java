public class Test01 {
    public static void main(String[] args) {
        Shape rec = new Rectangle(3, 4);
        Shape cir = new Circle(5);
        Shape squ = new Square(4);
        shapeLength(rec);
        shapeLength(cir);
        shapeLength(squ);
        shapeLength(new Shape() {
            double[] x = {1,2,3,4,5,6};
            @Override
            public void perimeter() {
                double l = 0;
                for (int i = 0; i < x.length; i++) {
                    l = l + x[i];
                }
                System.out.println("多边形周长是："+l);
            }
        });

    }
    public static void shapeLength (Shape shape){
        shape.perimeter();
    }
}
//图形接口
interface Shape{
    void perimeter();
}
//长方形
class Rectangle implements Shape{

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //周长
    public void perimeter(){
        System.out.println("长方形的周长是："+2*(length+width));
    }
}
//正方形
class Square implements Shape{
    double l;

    public Square(double l) {
        this.l = l;
    }

    //周长
    public void perimeter(){
        System.out.println("正方形的周长："+l*l);
    }
}
//圆形
class Circle implements Shape{
    double r;
    //final double PI = 3.14;
    public Circle(double r) {
        this.r = r;
    }

    //周长
    public void perimeter(){
        System.out.println("圆形的周长："+2*Math.PI*r);
    }
}