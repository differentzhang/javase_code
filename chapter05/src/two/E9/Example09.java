package two.E9;

/**
 * 5.4.3 线程让步  yield：让步
 *  yield()方法不会阻塞该线程，它只是将线程转换成"就绪状态"，让系统的调度器重新调度一次
 *  当某个线程调用yield()方法之后，只有与当前线程优先级相同或者更高的线程才能获得执行的机会
 */
public class Example09 {
    public static void main(String[] args) {
        //创建两个线程
        Thread t1 = new YieldThread("线程A");
        Thread t2 = new YieldThread("线程B");
        //开启线程
        t1.start();
        t2.start();
    }
}

class YieldThread extends Thread{
    //定义一个有参数构造方法
    public YieldThread(String name){
        super(name);
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
            if (i==3){
                System.out.print("线程让步：");
                Thread.yield(); //线程运行到此，做出让步
            }
        }
    }
}