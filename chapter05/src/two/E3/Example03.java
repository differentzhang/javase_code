package two.E3;

/**
 * 5.2.2 实现Runnable接口创建多线程
 * Java只支持单继承，多实现。
 * 如果继承Thread,你想继承其他的，则继承不了。
 * Thread类有接收Runnable的构造方法，
 * 所以MyThread实现Runnable接口，把Runnable传入，就可以实现多继承
 */
public class Example03 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();  //创建线程MyThread的实例对象
        Thread thread = new Thread(myThread);//创建线程对象
        thread.start();  //开启线程
        while (true){
            System.out.println("main()方法在运行");
        }

    }
}
class MyThread implements Runnable{
    public void run(){
        while (true){ //通过死循环语句打印输出
            System.out.println("MyThread类的run()方法在运行");
        }
    }
}
