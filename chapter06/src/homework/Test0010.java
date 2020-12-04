package homework;

/**
 * 编写一个程序,记录一个字串在整串中出现的次数,
 * 例如记录字串"aynu"在整串"hnaynuhaheaynuheheaynuhe"
 */
public class Test0010 {
    public static void main(String[] args) {
        String str = "hnaynuhaheaynuheheaynuhe";
        String s = "aynu";
        int zi = 0;
        int count = 0;
        int i = 0;
        int index = 0;
        while (index!=-1){
            index = str.indexOf(s,i+zi);
            zi = s.length();  //4
            if (index != -1){
                count++;
            }
            i = index;
        }
        System.out.println(count);
    }
}
