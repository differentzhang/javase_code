package two.E17;

/**
 * 5.6 多线程通信
 */
public class Example17 {
    public static void main(String[] args) {
        Storage st = new Storage();
        Input input = new Input(st);
        Output output = new Output(st);

        new Thread(input).start();
        new Thread(output).start();
    }
}
