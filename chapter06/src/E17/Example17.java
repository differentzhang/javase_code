package E17;


import java.util.Random;

public class Example17 {
    public static void main(String[] args) {
        Random r = new Random(13);  //创建对象时传入种子  ,相同的种子产生的随机数是相同的。
        //随机产生10个[0，100]之间的整数
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(100));
        }
    }
}
