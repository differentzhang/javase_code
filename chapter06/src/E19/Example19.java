package E19;

/**
 * 6.4 包装类
 *  基本数据类型    包装类
 *  byte            Byte
 *  short           Short
 *  int             Integer
 *  long            Long
 *  float           Float
 *  double          Double
 *  boolean         Boolean
 *  char            Character
 */
public class Example19 {
    public static void main(String[] args) {
        int a = 20;
        Integer in  =new Integer(a);  // 这种手动装箱拆箱已经过时了（从JDK9），现在都是自动装箱，自动拆箱
      //  Integer b = 20;
        System.out.println(in.toString());
    }
}
