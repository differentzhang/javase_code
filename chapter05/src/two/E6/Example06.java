package two.E6;

/**
 * 5.2.4 后台线程    daemon: 守护进程;后台程序
 *
 * 在上面的售票案例中，main线程结束了，但整个Java程序却没有随之结束，仍然在执行售票的代码，
 * 对Java程序来说，只要还有一个前台程序还在运行，这个进程就不会结束，  如果一个进程中只有后台线程运行，这个进程就会结束
 *    新创建的线程默认都是前台线程
 * 如果某个线程对象在启用之前调用了setDaemon(true)语句，这个线程就会变成一个后台线程
 */
public class Example06 {
    public static void main(String[] args) {
        System.out.println("main线程是后台线程吗？"+Thread.currentThread().isDaemon());
        DamonThread dt = new DamonThread();  //创建一个DamonThread对象dt
        Thread t = new Thread(dt, "后台线程");  //创建线程t共享dt资源
        System.out.println("t线程默认是后台线程吗？"+t.isDaemon());  //判断是否为后台线程
        t.setDaemon(true);// 这一语句必须在t.start 之前，否则会引发IllegalThreadStateException,这句话是书上说的，
                           //而我故意放错，运行不会出现异常。而是执行下去，造成我这样的原因是因为我这下面是的run()方法是死循环，
                           //导致不会执行到下一语句，会一直停留在当前语句
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        /*
         当开启线程t后，会执行死循环中的打印语句，
         但是我们将线程t设置为后台程序后，当前台线程死亡后，JVM会通知后台线程。
         由于后台线程从接受指令，到做出响应，需要一定的时间，
         因此，打印了几次"后台线程---is running"语句后，后台线程也就结束了。
         《由此说明进程中只有后台线程运行时，进程就会结束。》
         */
    }
}

class DamonThread implements Runnable{ //创建DamonThread类，实现Runnable接口

    @Override
    public void run() {

        while (true){   //死循环打印
            System.out.println(Thread.currentThread().getName()+"---is running");
        }
    }
}