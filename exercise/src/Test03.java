public class Test03 {
    public static void main(String[] args) {
        int x = 4, j = 0;
        switch(x){
            case 1:
                j++;
            case 2:
                j++;
            case 3:
                j++;
            case 4:
                j++;
            case 5:
                j++;
            default:
                j++;
        }
        System.out.println(j);
        System.out.println("----------------------------");
        int n = 9;
        while(n>6){
            System.out.println(n);
            n--;
        }
    }
}
