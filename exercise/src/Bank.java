//银行类
public class Bank {
    static String bankName = "招商"; //银行名字
    String name; //客户名字
    String passWord;//用户密码
    double balance; //余额
    double jiaoYi;  //交易额

    public Bank(){

    }
    public Bank(String name, String passWord, double jiaoYi) {
        this.name = name;
        this.passWord = passWord;
        this.jiaoYi = jiaoYi;
        this.balance = jiaoYi - 10; //余额等于用户交易的钱-10块钱手续费
        System.out.println("亲爱的"+name+"，开户成功，账户余额:"+balance);
    }
    //欢迎
    static void welcome(){
        System.out.println("欢迎来到"+bankName+"银行-------------------");
    }

    //存款
    public void deposits(double jiaoYi){
        balance += jiaoYi;
        System.out.println(name+"您好，您的账户已存入"+jiaoYi+"元，当前余额为"+balance);
    }

    //取款
    public void withdrawMoney(String passWord, double jiaoYi){
        if(this.passWord != passWord){
            System.out.println("对不起，您输入的密码有误");
            return;
        }
        if (this.balance < jiaoYi){
            System.out.println("抱歉，您的账户余额不足");
            return;
        }
        balance -=jiaoYi;
        System.out.println(name+"您好，您的账户已取出"+jiaoYi+"元，当前余额为"+balance);
    }
    //再见
    static void bye(){
        System.out.println("请携带好随声财物，欢迎下次光临"+bankName+"银行-------------------");
    }
}
