package Map.E29;
import java.util.*;
/**
 * 7.8 Arrays 工具箱
 */

//1. 使用Arrays的sort()方法排序
public class Example29 {
    public static void main(String[] args) {
        int[] arr = {9,8,3,5,2};
        System.out.print("排序前：");
        printArray(arr);

        Arrays.sort(arr);
        System.out.print("排序后：");
        printArray(arr);
    }
    public static void printArray(int[] arr){  //定义打印数组的方法
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1){
                System.out.print(arr[i]+",");
            } else {
                System.out.println(arr[i]+"]");
            }
        }
    }
}
