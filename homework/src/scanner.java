import java.util.Scanner;//导包

public class scanner {
    public static void main(String[] args){
        //Scanner s = new Scanner(System.in);

        //java.util.Scanner s = new java.util.Scanner(System.in); //不导包方式

        //输入一个数，正确会再次输入，错误会打印信息退出
/*       try {
           while (true){
               int num = s.nextInt();
               int y = function(num);
               System.out.println(y);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }*/

        //输入一个数，正确会退出，错误会打印信息退出
/*        try {
            while (true){
                int num = s.nextInt();
                int y = function(num);
                System.out.println(y);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //输入一个数，正确会退出，错误会打印信息再次输入
        while (true){
            try {
                Scanner s = new Scanner(System.in); //这一行不能放while上面，因为会循环打印错误信息,为啥会循环打印错误信息？
                int num  = s.nextInt();
                int y = function(num);
                System.out.println(y);
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }



    }
    public static int function(int x){
        int y;
        if(x > 0){
            y = x + 3;
        } else if(x < 0){
            y = x*x - 1;
        } else {
            y = 0;
        }
        return y;
    }

}
