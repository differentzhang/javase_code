package Map.E30;
import java.util.*;

//2. 使用Arrays的binarySearch(Object[] a, Object key) 方法查找元素
public class Example30 {
    public static void main(String[] args) {
        int[] arr = {9,8,3,5,2};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr,3);
        System.out.println("数组排序后元素3的索引是："+index);
    }
}
