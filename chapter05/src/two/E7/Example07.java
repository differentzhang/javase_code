package two.E7;

//我太爱打代码了，我感觉我上辈子就是一串代码。😂
/**　
 * 5.4 线程的调度
 * Java虚拟机默认采用抢占式调度模型
 * static int MAX_PRIORITY 表示线程的最高优先级，相当于10    priority：优先
 * static int MIN_PRIORITY 表示线程的最低优先级，相当于1
 * static int NORM_PRIORITY 表示线程的普通优先级，相当于5  normal：普通
 * Thread类的setPriority(int newPriority)方法进行设置优先级
 */
public class Example07 {
    public static void main(String[] args) {
        //创建两个线程
        Thread minPriority = new Thread(new MinPriority(), "优先级较低的线程");
        Thread maxPriority = new Thread(new MaxPriority(), "优先级较高的线程");
        minPriority.setPriority(Thread.MIN_PRIORITY); //设置线程的优先级为1
        maxPriority.setPriority(10);  //设置线程的优先级为10
        //开启两个线程
        maxPriority.start();
        minPriority.start();
    }
}

class MaxPriority implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"正在输入："+i);
        }
    }
}
class MinPriority implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"正在输入："+i);
        }
    }
}