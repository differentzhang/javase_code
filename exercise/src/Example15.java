public class Example15 {
    public static void main(String[] args) {
        Single s3 = new Single();
    }
}
class Single{
    private static Single INSTANCE = new Single();
    static {
        System.out.println("123");
    }
    public Single(){
        System.out.println("456");
    }
    static {
        System.out.println("789");
    }
}