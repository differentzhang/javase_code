package homework_198;

public class Test01 {
    public static void main(String[] args) {
        new MyThread("线程一").start();
        new MyThread("线程二").start();
    }
}
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
        //System.out.println(this.getName());  应该都行
    }
}