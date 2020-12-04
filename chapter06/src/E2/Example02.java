package E2;

/**
 * 6.1.2 String类的常见操作
 *                          String类常用方法
 * int indexOf(int ch)                  返回指定字符在此字符串中第一次出现处的索引
 * int lastIndex(int ch)                返回指定字符在此字符串中最后一次出现处的索引
 * char charAt(int index)               返回字符串中index位置的字符，其中index的取值范围是：0～(字符串长度-1)
 * boolean endsWith(String suffix)      判断此字符串是否以指定的字符串结尾
 * int length()                         返回此字符串的长度
 * boolean equals(Object anObject)      将此字符串与指定的字符串比较
 * boolean isEmpty()                    当且仅当字符串长度为0时返回true
 * boolean startsWith(String prefix)    判断此字符串是否以指定的字符串开始
 * boolean contains(CharSequence cs)    判断此字符串中是否包含指定的字符序列
 * String toLowerCase()                 使用默认语言环境的规则将String中的所有字符都转换为小写
 * String toUpperCase()                 使用默认语言环境的规则将String中的所有字符都转换为大写
 * String valueOf(int i)                返回int参数类型的字符串表示形式
 * char[] toCharArray()                 将此字符串转换为一个字符数组
 * String replace(CharSequence oldstr,CharSequence newstr) 返回一个新的字符串，它是通过用newstr替换此字符串中出现的所有oldstr得到的
 * String[] split(String regex)         根据参数regex将原来的字符串分割为若干个子字符串
 * String substring(int beginIndex)     返回一个新字符串，它包含字符串中索引beginIndex后的所有字符
 * String substring(int beginIndex，int endIndex) 返回一个新字符串，它包含次字符串中从索引beginIndex到索引endIndex之间的所有字符
 * String trim()                        返回一个新字符串，它去除了原字符串首位的空格
 */
public class Example02 {
    public static void main(String[] args) {
        String s = "abcdedcba";   //声明字符串
        System.out.println("字符串的长度为："+s.length());
        System.out.println("字符串中第一个字符："+s.charAt(0));
        System.out.println("字符c第一次出现的位置："+s.indexOf('c'));
        System.out.println("字符c最后一次出现的位置："+s.lastIndexOf('c'));
    }
}
