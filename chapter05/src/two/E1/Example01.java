package two.E1;

/**
 * 5.2 线程的创建
 */
public class Example01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();
        while (true){
            System.out.println("Main方法在运行");
        }
    }
}
class MyThread{
    public void run(){
        while (true){ //该循环是一个死循环，打印输出语句
            System.out.println("MyThread类的run()方法在运行");
        }
    }

}
