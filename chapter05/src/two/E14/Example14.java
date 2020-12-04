package two.E14;

/**
 * 5.5.4 死锁问题
 */
public class Example14 {
    public static void main(String[] args) {
        //创建两个DeadLockThread对象
        DeadLockThread d1 = new DeadLockThread(true);
        DeadLockThread d2 = new DeadLockThread(false);
        //创建并开启两个线程
        new Thread(d1,"Chinese").start();
        new Thread(d2,"American").start();
    }
}
class DeadLockThread implements Runnable{

    static Object chopsticks = new Object(); //定义Object类型的chopsticks锁对象
    static Object knifeAndFork = new Object(); //定义Object类型的knifeAndFork锁对象
    private boolean flag;  //定义boolean类型的变量flag

    DeadLockThread(boolean flag){ //定义有参的构造方法
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag){
            while (true){
                synchronized(chopsticks){  //chopsticks锁对象上的同步代码块
                    System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
                    synchronized(knifeAndFork){ //knifeAndFork锁对象上的同步代码块
                        System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
                    }
                }
            }
        } else {
            while (true){
                synchronized(knifeAndFork){  //chopsticks锁对象上的同步代码块
                    System.out.println(Thread.currentThread().getName()+"---else---knifeAndFork");
                    synchronized(chopsticks){ //knifeAndFork锁对象上的同步代码块
                        System.out.println(Thread.currentThread().getName()+"---else---chopsticks");
                    }
                }
            }
        }
    }
}