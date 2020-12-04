public class Bank_Test {
    public static void main(String[] args) {
        Bank.welcome();
        Bank bank = new Bank("小梦", "123456", 100);
        bank.deposits(500);
        bank.withdrawMoney("123",100);
        bank.withdrawMoney("123456",1000);
        bank.withdrawMoney("123456",200);
        Bank.bye();
    }
}
