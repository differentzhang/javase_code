/**
 * p112 代码三
 */
public class Outer {

    public String name = "Outer";

    private class Inner{
        String name = "inner";
        void showName(){
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        Inner inner = new Outer().new Inner();
        System.out.println(inner.name);

    }
}
