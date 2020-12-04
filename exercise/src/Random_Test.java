import java.util.Random;


public class Random_Test {
    public static void main(String[] args) {
        String[] str = {"张三","李四","王五","赵六","小七"};

        Random random = new Random();

        System.out.println(str[random.nextInt(4)]);
    }
}
