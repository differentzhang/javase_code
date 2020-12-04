package two.E11;

import javax.swing.plaf.SliderUI;

/**
 * 5.5 多线程同步
 */
public class Example11 {
    public static void main(String[] args) {
        SaleThread saleThread = new SaleThread(); //创建saleThread对象
        //创建并开启四个线程
        new Thread(saleThread,"线程一").start();
        new Thread(saleThread,"线程二").start();
        new Thread(saleThread,"线程三").start();
        new Thread(saleThread,"线程四").start();
    }
}
class SaleThread implements Runnable{
    private int tickets = 10; //10张票
    @Override
    public void run() {
        while (tickets>0){
            try {
                Thread.sleep(10); //模拟了售票过程中线程的延迟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"，共10张票---剩下还有"+tickets--+"张票！");
        }
    }
}
