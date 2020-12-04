package homework_198;

public class Test03 {
    public static void main(String[] args) {
        Notes notes = new Notes();
        new Thread(notes,"老师一").start();
        new Thread(notes,"老师二").start();
        new Thread(notes,"老师三").start();
    }
}
class Notes implements Runnable{

    private  int count = 80; //80份学习笔记
    @Override
    public void run() {
        while (true){
            MyNotes(); //调用方法
            if (count <= 0){
                break;
            }
        }

    }
    private synchronized void MyNotes(){
        if (count>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"：还剩余"+count--+"份笔记");
        }

    }
}