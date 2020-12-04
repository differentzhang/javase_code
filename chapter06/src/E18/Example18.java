package E18;

import java.util.Random;

/**
 *              Random 类的常用方法
 * boolean nextBoolean()    随机生成boolean类型的随机数
 * double nextDouble()      随机生成double类型的随机数  0.0~1.0
 * float nextFloat()        随机生成float类型的随机数   0.0~1.0
 * int nextInt()            随机生成int类型的随机数
 * int nextInt(int n)       随机生成0～n之间int类型的随机数  [0,n)
 * long nextLong()          随机生成long类型的随机数
 */
public class Example18 {
    public static void main(String[] args) {
        Random r1 = new Random();  //创建Random实例对象
        System.out.println("产生float类型的随机数："+r1.nextFloat());
        System.out.println("产生0～100之间int类型的随机数："+r1.nextInt(100));
        System.out.println("产生double类型的随机数："+r1.nextDouble());
    }
}
