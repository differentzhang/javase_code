package E13;
import java.io.*;
/**
 * Runtime类中提供一个exec()方法，该方法用于执行一个dos命令，从而实现和在命令行窗口输入dos命令同样的效果。
 */
public class Example13 {
    public static void main(String[] args) throws IOException{
        Runtime rt = Runtime.getRuntime();
        rt.exec("notepad.exe"); //创建Runtime实例对象
        //我这是Mac OS 系统，不是Windows系统，所以这里会运行出错。
    }
}
