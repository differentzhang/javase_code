package two.E13;

/**
 * 5.5.3 同步的方法
 * 被synchronized修饰的方法在某一时刻只允许2一个线程访问，访问该方法的其他线程都会发生阻塞，
 * 直到当前线程访问完毕后，其他线程才有机会访问.
 */
public class Example13 {
    public static void main(String[] args) {
        Ticket1 ticket = new Ticket1();
        new Thread(ticket,"线程一").start();
        new Thread(ticket,"线程二").start();
        new Thread(ticket,"线程三").start();
        new Thread(ticket,"线程四").start();
    }
}
class Ticket1 implements Runnable{
    private int tickets = 1000;

    @Override
    public void run() {
        while (true){
            saleTicket();  //调用售票方法
            if (tickets<=0){
                break;
            }
        }
    }

    //定义一个同步方法saleTicket()
    private synchronized void saleTicket(){
        if (tickets>0){
            try {
                Thread.sleep(10);  //经过的线程休眠10毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"---卖出的票"+tickets--);
        }
    }
}
