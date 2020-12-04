package homework_P162;

public class Player {
    void play(int index) throws NoThisSoundException{
       if (index > 10){
           throw new NoThisSoundException("您播放的歌曲不存在");
       }
        System.out.println("正在播放歌曲");
    }
}

class Test003{
    public static void main(String[] args) {
        Player player = new Player();
        try {
            player.play(15);
        } catch (NoThisSoundException e) {
            System.out.println("异常信息为："+e.getMessage());;
        }
    }
}
