package E6;

/**
 * 装饰设计模式
 */
public class Example06 {
    public static void main(String[] args) {
        Car benz = new Car("Benz");
        System.out.println("------------包装前------------");
        benz.show();

        RadarCar decoratedCar_benz = new RadarCar(benz);
        System.out.println("------------包装后------------");
        decoratedCar_benz.show();
    }
}

class Car{
    private String carName;
    public Car(String carName){
        this.carName = carName;
    }
    public void show(){
        System.out.println("我是"+carName+"，具有基本功能");
    }
}
//定义一个RadarCar类
class RadarCar{
    public Car myCar;
    public RadarCar(Car myCar){
        this.myCar = myCar;
    }
    public void show(){
        myCar.show();
        System.out.println("具有倒车雷达功能");  //实现了功能的增强
    }
}