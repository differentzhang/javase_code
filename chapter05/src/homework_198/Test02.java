package homework_198;

/*
public class Test02 {
    public static void main(String[] args) {
        new Thread(new MyRunnable(),"main").start();
        new Thread(new MyRunnable(),"new").start();
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        if ("main".equals(Thread.currentThread().getName())){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        } else {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }

    }
}*/
public class Test02 {
    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main");
        }
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("new");
        }
    }
}