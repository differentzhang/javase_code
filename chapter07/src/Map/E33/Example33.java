package Map.E33;

import java.util.Arrays;

/**
 * 5. 使用Arrays的toString(int[] arr)方法把数组转换为字符串
 */
public class Example33 {
    public static void main(String[] args) {
        int[] arr = {9,8,3,5,2};
        String arrString = Arrays.toString(arr);  //使用toString()方法将数组转换为字符串
        System.out.println(arrString);
    }
}
