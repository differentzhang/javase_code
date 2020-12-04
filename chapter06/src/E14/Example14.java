package E14;

import java.io.IOException;

public class Example14 {
    public static void main(String[] args) throws Exception{
        Runtime rt = Runtime.getRuntime(); //创建一个Runtime实例对象
        Process process = rt.exec("notepad.exe"); //得到表示进程的Process对象
        Thread.sleep(3000); //程序休息3秒
        process.destroy();  //杀掉进程
        //我这是Mac OS 系统，不是Windows系统，所以这里会运行出错。
    }
}
