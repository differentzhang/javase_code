package two.E4;

/**
 * 5.2.3 两种实现多线程方式的对比
 */
public class Example04 {
    public static void main(String[] args) { //每个线程都有100张票
        Thread t = new TicketWindow();
        t.setName("📈");  //为线程设置名称
        t.start();
          // //创建一个线程对象TicketWindow并开启
        new TicketWindow().start();//创建一个线程对象TicketWindow并开启
        new TicketWindow().start();//创建一个线程对象TicketWindow并开启
        new TicketWindow().start();//创建一个线程对象TicketWindow并开启
    }
}
class TicketWindow extends Thread{
    private int tickets = 100;
    public void run(){
        while (true){ //通过死循环语句打印语句
            if (tickets>0){
                Thread th = Thread.currentThread(); //获取当前线程
                String th_name = th.getName();
                System.out.println(th_name+"正在发售第"+tickets--+"张票");
            }
        }
    }
}
