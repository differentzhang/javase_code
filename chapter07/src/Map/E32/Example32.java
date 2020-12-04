package Map.E32;
import java.util.*;

/**
 * 4. 使用Array的fill(Object[] a, Object val)方法填充元素
 */
public class Example32 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Arrays.fill(arr,8);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+":"+arr[i]);
        }
    }
}
