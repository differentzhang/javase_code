package homework;

/**
 * 编写一个程序，实现字符串大小写的转换并倒序输出
 */
public class Test01 {
    /*public static void main(String[] args) {
        String s = "HelloWorld";
        char[] ch = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = s.length()-1; i >= 0; i--) {  //其实这里s.length()-1 和ch.length-1都行
            if (ch[i]>='A' && ch[i]<='Z'){
                sb.append(String.valueOf(ch[i]).toLowerCase());
            } else if (ch[i]>='a' && ch[i]<='z'){
                sb.append(String.valueOf(ch[i]).toUpperCase());
            }
        }
        System.out.println(sb);
    }*/
    public static void main(String[] args) {
        String s = "HelloWorld";
        char[] ch = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = s.length()-1; i >= 0; i--) {  //其实这里s.length()-1 和ch.length-1都行
            if (Character.isUpperCase(ch[i])){
                sb.append(Character.toLowerCase(ch[i]));
            } else if (Character.isLowerCase(ch[i])){
                sb.append(Character.toUpperCase(ch[i]));
            }
        }
        System.out.println(sb);
    }

    //a:97 z:122  A:65  Z:90
    /*public static void main(String[] args) {
        String s = "HelloWorld";
        char[] ch = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = s.length()-1; i >= 0; i--) {  //其实这里s.length()-1 和ch.length-1都行
            if ((byte)ch[i]>=65 && (byte)ch[i]<=90){
                sb.append((char) ((byte)ch[i]+32));
            } else if ((byte)ch[i]>=97 && (byte)ch[i]<=122){
               // sb.append(String.valueOf(ch[i]).toUpperCase());
                sb.append((char) ((byte)ch[i]-32));
            }
        }
        //sb.reverse();  同样可以按正序遍历，通过reverse进行翻转
        System.out.println(sb);
    }*/
}
