package two.E5;

/**
 * 实现Runnable接口相对于继承Thread类来说有如下显著的好处
 * 1、《适合多个相同程序代码的线程去处理同一个资源的情况，》把线程同程序代码、数据有效的分离，
 *    很好的体现了面向对象的设计思想
 * 2、《可以避免由于Java的单继承带来的局限性。》
 *    在开发中经常碰到这样一种情况，就是使用一个已经继承了某一个类的子类创建线程，由于一个类不能同时有两个父类，
 *    所以不能用继承Thread类的方式，那么就只能采用实现Runnable接口的方式。
 * 事实上，大部分的应用程序都会采用第二种方式来创建多线程，即实现Runnable接口。
 */
public class Example05 {
    public static void main(String[] args) {  //共享100张车票
        TicketWindow tw = new TicketWindow();
        new Thread(tw,"窗口1").start(); //创建线程对象并命名为窗口1，开启线程
        new Thread(tw,"窗口2").start();//创建线程对象并命名为窗口2，开启线程
        new Thread(tw,"窗口3").start();//创建线程对象并命名为窗口3，开启线程
        new Thread(tw,"窗口4").start();//创建线程对象并命名为窗口4，开启线程
    }
}
class TicketWindow implements Runnable{

    private int tickets = 100;
    @Override
    public void run() {
        while (true){
            if (tickets>0){
                Thread th = Thread.currentThread(); //获取当前线程
                String th_name = th.getName();
                System.out.println(th_name+"正在发售第"+tickets--+"张票");
            }
        }
    }
}
