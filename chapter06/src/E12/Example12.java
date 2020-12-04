package E12;

/**
 * 6.2.2 Runtime类
 * Runtime类用于表示虚拟机运行时的状态，它用于封装JVM虚拟机进程，每次使用Java命令启动虚拟机都会对应一个Runtime实例，
 * 并且只有一个实例，因此该类采用单例模式进行设计，对象不可以直接实例化，
 * 若想在程序中获得一个Runtime实例，只能通过以下方式：
 *  Runtime run = Runtime.getRuntime()
 */
public class Example12 {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime(); //获取
        System.out.println("处理器的个数"+rt.availableProcessors()+"个");
        System.out.println("空闲内存数量"+rt.freeMemory()/1024/1024+"M"); //字节为单位，这里转换称M
        System.out.println("最大可用内存数量"+rt.maxMemory()/1024/1024+"M");
    }
}
