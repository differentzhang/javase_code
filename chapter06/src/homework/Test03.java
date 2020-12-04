package homework;

import java.util.Random;

/**
 * 利用Random类来产生5个20~50之间的随机数
 */
public class Test03 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int count = (random).nextInt(31);
            System.out.println(20+count);
        }
    }
    /*public static void main(String[] args) {
    //这种方法用个num数组来存5个数，我认为没必要，
    而且还浪费空间，增加代码量（冗余）
        Random read = new Random();
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = 20 +read.nextInt(31);
            System.out.println(num[i]);
        }
    }*/
}

