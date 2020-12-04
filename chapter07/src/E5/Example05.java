package E5;

//foreach循环遍历集合和数组时,只能访问集合中的元素,不能对其中的元素进行修改.
public class Example05 {
    static String[] strs = {"aaa", "bbb", "ccc"};
    public static void main(String[] args) {
        //foreach 循环遍历数组
        for(String str : strs){
            str = "ddd";
        }
        System.out.println("foreach循坏修改后的数组："+strs[0]+","+strs[1]+","+strs[2]);

        //for循环遍历
        for (int i = 0; i < strs.length; i++) {
            strs[i] = "ddd";
        }
        System.out.println("普通for循坏修改后的数组："+strs[0]+","+strs[1]+","+strs[2]);

    }
}
