package homework;

/**
 * 编写一个程序,记录一个字串在整串中出现的次数,
 * 例如记录字串"aynu"在整串"aaaaynubbccdaynuddeee"
 */
public class Test0010 {
   /*public static void main(String[] args) {
       String str = "aaaaynubbccdaynuddeee";
       String s = "aynu";
       int zi = 0;
       int count = 0;
       int i = 0;
       int index = 0;
       while (index!=-1){
           index = str.indexOf(s,i+zi); //找出子串下标
           zi = s.length();  //4  记录子串的长度
           if (index != -1){
               count++;
           }
           i = index;  //i表示下一次子串的下标
       }
       System.out.println(count);
   }*/


   /*public static void main(String[] args) {
       String str = "aaaaynubbccdaynuddeee";
       String str1 = "aynu";
       int count = 0;
       String temp = str;
       while (temp.contains(str1)){
           int index = temp.indexOf(str1);
           temp = temp.substring(index + str1.length());
           count++;
       }
       System.out.println(count);
   }*/
   public static void main(String[] args) {
       String str1 = "aaaaynubbccdaynuddeee";
       String str2 = "aynu";
       String str3 = str1.replace(str2,"");
       int len1 = str1.length();
       int len2 = str2.length();
       int len3 = str3.length();
       int count = (len1 - len3) / len2;
       System.out.println(count);
   }
}
