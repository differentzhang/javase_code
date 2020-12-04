package E16;

import java.util.Random;

/**
 * 6.3.2 Random类
 *  Random() 构造方法，用于创造一个伪随机数生成器
 *  Random(long seed) 构造方法 使用一个long型的seed种子创建伪随机数生成器。
 */
public class Example16 {
    public static void main(String[] args) {
        Random r = new Random();  //不传入种子   系统会以当前时间戳作为种子，产生随机数
        //随机产生10个[0，100]之间的整数
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(100));
        }
    }
}
