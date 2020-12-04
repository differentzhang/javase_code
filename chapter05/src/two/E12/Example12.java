package two.E12;

/**
 * 5.5.2 同步代码块
 * synchronized：同步
 */
public class Example12 {
    public static void main(String[] args) {
        Ticket1 ticket = new Ticket1();
        //创建并开启四个线程
        new Thread(ticket,"线程一").start();
        new Thread(ticket,"线程二").start();
        new Thread(ticket,"线程三").start();
        new Thread(ticket,"线程四").start();

    }
}
class Ticket1 implements Runnable{
    private int tickets = 1000;
    Object lock = new Object();// 定义任意一个对象，用作同步代码块的锁。
    @Override
    public void run() {

        while (true){

            synchronized(lock){ //定义同步代码块
                try {
                    Thread.sleep(10); //经过的线程休眠10毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (tickets>0){
                    System.out.println(Thread.currentThread().getName()+"，共10张票---剩下还有"+tickets--+"张票！");
                }else {
                    break;
                }
            }
        }
    }
}