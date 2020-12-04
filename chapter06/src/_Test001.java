public class _Test001 {
    public static void main(String[] args) {
        String str = "abccdefcdh";
        String[] arr = str.split("c");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
