package E19;
import java.io.*;

/**
 * 8.3.5 PipedInputStream 和 PipedOutputStream
 */
//也许这就是一种热爱把，对打代码的热爱。
//幸福并不是勇攀高峰，而是这个攀登的过程。
// 而我现在就感到很幸福
public class Example19 {
    public static void main(String[] args) throws Exception{
        final PipedInputStream pis = new PipedInputStream();
        final PipedOutputStream pos = new PipedOutputStream();
        //PipedInputStream 和 PipedOutputStream 建立连接，也可以写成pos.connect(pis)
        pis.connect(pos);

        new Thread(new Runnable() {  //创建一个线程
            @Override
            public void run() {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                //将从键盘读取的数据写入管道流
                PrintStream ps = new PrintStream(pos);
                while (true){
                    try{
                        System.out.print(Thread.currentThread().getName()+"要求输入内容:");
                        ps.println(br.readLine());
                        Thread.sleep(1000);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }, "发送数据的线程").start();

        new Thread(new Runnable() {  //创建一个线程
            @Override
            public void run() {
                //下面的代码是从管道流中读出数据，每读一行数据输出一次
                BufferedReader br = new BufferedReader(new InputStreamReader(pis));

                while (true){
                    try{
                        System.out.println(Thread.currentThread().getName()+"收到的内容:"+br.readLine());

                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }, "接受数据的线程").start();
    }
}
