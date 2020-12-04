package E30;

/**
 * 6.6 JDK7新特性---switch语句支持字符串类型
 */
public class Example30 {
    public static void main(String[] args) {
        String week = "Friday";
        switch(week){
            case "Monday":
                System.out.println("星期一");
                break;
            case "Tuesday":
                System.out.println("星期二");
                break;
            case "Wednesday":
                System.out.println("星期三");
                break;
            case "Thursday":
                System.out.println("星期四");
                break;
            case "Friday":
                System.out.println("星期五");
                break;
            case "Saturday":
                System.out.println("星期六");
                break;
            case "Sunday":
                System.out.println("星期天");
                break;
            default:
                System.out.println("你的输入不正确...");
        }
    }
}
