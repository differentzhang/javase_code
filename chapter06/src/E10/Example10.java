package E10;

/**
 * 2. currentTimeMills()方法
 *  返回long类型，当前时间与1970年1月1日0点0时0分0秒之间的时间差，单位是毫秒
 *  习惯的被称为时间戳
 */
public class Example10 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); //循环开始时的当前时间
        int sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();//循环结束后的当前时间
        System.out.println("程序运行的时间为："+(endTime-startTime)+"毫秒");
    }
}
