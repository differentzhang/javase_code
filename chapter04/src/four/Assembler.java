package four;

//计算机组装者
public class Assembler {
    public static void main(String[] args) {
        MainBoard mb = new MainBoard();
        NetWorkCard nc = new NetWorkCard();
        mb.usePCICard(nc);
        SoundCard sc = new SoundCard();
        mb.usePCICard(sc);
    }
}

//定义PCI接口
interface PCI{
    void start();
    void stop();
}

//定义NetWorkCard(网卡)类实现PCI接口
class NetWorkCard implements PCI{

    @Override
    public void start() {
        System.out.println("Send(发送)...");
    }

    @Override
    public void stop() {
        System.out.println("NetWork Stop(网络停止)");
    }
}

//定义SoundCard类实现PCI接口
class SoundCard implements PCI{

    @Override
    public void start() {
        System.out.println("DU du...");
    }

    @Override
    public void stop() {
        System.out.println("Sound Stop");
    }
}

//定义MainBoard类
class MainBoard{
    //定义一个userPCICard()方法，接受PCI类型的参数
    public void usePCICard(PCI p){
        p.start();
        p.stop();
    }
}