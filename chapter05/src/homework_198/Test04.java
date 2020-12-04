package homework_198;

/**
 * 有问题
 */
public class Test04 {
    public static void main(String[] args) throws Exception{
        Thread[] threadList = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadList[i] = new Accumulator(10 * i + 1); // 1 21 31 41 ...91
            threadList[i].start();
        }
        for (int i = 0; i < 10; i++) {
            threadList[i].join();  //线程插队  不然会乱 ，为啥会乱，我还是真的不太懂？
        }
        System.out.println("Sum is :" +Accumulator.sum);
    }
}

class Accumulator extends Thread{ //这里以21 为例子
    private int startNum;
    public static int sum;
    public Accumulator(int startNum){  //21
        this.startNum =startNum;   //startNum = 21
    }
    public static synchronized void add(int num){  //区间【21，30】的加到sum上了
        sum += num;
    }
    @Override
    public void run() {
        int num = 0;
        for (int i = 0; i < 10; i++) {
            num += startNum + i;  // num+21 +22 +23 +...+29 +30
        }
        add(num);  //区间【21，30】的加到sum上了
    }
}