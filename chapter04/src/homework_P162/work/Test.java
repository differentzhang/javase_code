package homework_P162.work;
/*
用接口做参数，写个计算器，能完成加减乘除运算。
        （1）定义一个接口Compute含有一个方法int computer(int n, int m)。
        （2）设计四个类分别实现此接口，完成加减乘除运算。
        （3）设计一个类UseCompute，类中含有方法：public void useCom(Compute com, int one, int two)，
        此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果。
        （4）设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算。
*/

public class Test {
    public static void main(String[] args) {
        UseCompute useCompute = new UseCompute();

        Add add = new Add();
        System.out.print("加法结果是：");
        useCompute.useCom(add,2,4);

        Sub sub = new Sub();
        System.out.print("减法结果是：");
        useCompute.useCom(sub,2,4);

        Mul mul = new Mul();
        System.out.print("乘法结果是：");
        useCompute.useCom(mul,2,4);

        Div div = new Div();
        System.out.print("除法结果是：");
        try {
            useCompute.useCom(div,8,0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

interface Computer{
    int computer(int n, int m);
}

class UseCompute{
    public void useCom(Computer com, int one, int two) {
        System.out.println(com.computer(one,two));
    }
}
//加
class Add implements Computer{

    @Override
    public int computer(int n, int m) {
        return n+m;
    }
}

//减
class Sub implements Computer{

    @Override
    public int computer(int n, int m) {
        return n-m;
    }
}

//乘
class Mul implements Computer{

    @Override
    public int computer(int n, int m) {
        return n*m;
    }
}

//除
class Div implements Computer {

    @Override
    public int computer(int n, int m) {
        return n/m;
    }
}