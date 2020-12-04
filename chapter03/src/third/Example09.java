package third;

public class Example09 {
    public static void main(String[] args){
        //private修饰的只能在本类中访问
        //Person_three p = new Person_three();
    }

}
class Person_three{
    //私有的构造方法(Constructor)
    private Person_three(){
        System.out.println("调用无参的构造方法");
    }
}
