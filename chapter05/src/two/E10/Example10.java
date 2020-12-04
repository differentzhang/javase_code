package two.E10;

/**
 * 5.4.4 线程插队
 *   当某个线程中调用其他线程的join()方法时，调用的线程将被"阻塞"，
 *   直到被join()方法加入的线程执行完成后它才会继续运行
 */
public class Example10 {
    public static void main(String[] args) throws Exception{
        //创建线程
        Thread t = new Thread(new EmergencyThread(), "线程一");
        t.start();
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName()+"输入："+i);
            if (i==2){
                t.join(); //调用join()方法, 效果是:"下面的EmergencyThread类的run()方法会一直执行，直到结束，才轮到main线程"。
            }
            Thread.sleep(500); //线程休眠500毫秒 ,以实现两个线程的交替执行。
        }

    }
}

class EmergencyThread implements Runnable{  //Emergency：紧急情况

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName()+"输入："+i);
            try {              // 这边我测试得设置1000毫秒，不然有可能再抢到CUP使用权。
                Thread.sleep(500); //线程休眠500毫秒 ,以实现两个线程的交替执行。
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
