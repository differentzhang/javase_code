package homework.KTV;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/*
欢迎来到点歌系统
0.添加歌曲
1.将歌曲置顶
2.将歌曲前移一位
3.退出
4当前歌单为:【我是一个粉刷匠 卖报歌 拔萝卜 小兔子乖乖 小跳蛙]
请输入要执行的操作序号:
0
请输入要添加的歌曲名称:
快乐的一天
已添加歌曲:快乐的一天
当前歌单为:【我是一个粉刷匠 卖报歌 拔萝卜 小兔子乖乖 小跳蛙 快乐的一天]
请输入要执行的操作序号:
1
请输入要置顶的歌曲名称:
小跳蛙
当前歌单为:【小跳蛙 我是一个粉刷匠 卖报歌 拔萝卜 小兔子乖乖 快乐的一天]
请输入要执行的操作序号:
2
请输入要置前的歌曲名称:
快乐的一天
当前歌单为:【小跳蛙 我是一个粉刷匠 卖报歌 拔萝卜 快乐的一天 小兔子乖乖]
请输入要执行的操作序号:
3
退出系统
 */
public class Index {

    LinkedList<String> list = new LinkedList<>();

    public static void main(String[] args) {
        Index index = new Index();  //这里我用的new一个本类对象,因为list是一个成员变量,需要实例化
        index.list.add("我是一个粉刷匠");
        index.list.add("卖报歌");
        index.list.add("拔萝卜");
        index.list.add("小兔子乖乖");
        index.list.add("小跳蛙");
        System.out.println("欢迎来到点歌系统\n" +
                "0.添加歌曲\n" +
                "1.将歌曲置顶\n" +
                "2.将歌曲前移一位\n" +
                "3.退出");
        while (true){
            System.out.println("当前歌单为:"+ index.list);
            System.out.println("请输入要执行的操作序号:");
            Scanner scanner = new Scanner(System.in);
            int select = scanner.nextInt(); //读取输入的数字
            switch (select){
                case 0:
                    index.addMusic();
                    break;
                case 1:
                    index.topMusic();
                    break;
                case 2:
                    index.forwardMusic();
                    break;
                case 3:
                    System.exit(0); //退出
                    break;
                default:
                    System.out.println("亲,您输入的有误,请重新输入");
                    break;
            }
        }
    }

    //添加音乐
    public void addMusic(){
        System.out.println("请输入要添加的歌曲名称:");
        Scanner scanner = new Scanner(System.in);
        String Music = scanner.next(); //读取输入的音乐
        list.add(Music);
        System.out.println("已添加歌曲"+Music);
        //System.out.println("当前歌单为:"+list);
    }

    //将歌曲置顶
    public void topMusic(){
        System.out.println("请输入要置顶的歌曲名称:");
        Scanner scanner = new Scanner(System.in);
        String Music = scanner.next(); //读取需要置顶的音乐
        if (!list.contains(Music)){
            System.out.println("抱歉,您需要置顶的歌曲不存在");
            return;
        }
        list.addFirst(Music); //将Music插入到此列表的开头
        int index = list.lastIndexOf(Music);
        list.remove(index);
        //System.out.println("当前歌单为:"+list);
    }
    //将歌曲前移一位
    public void forwardMusic(){
        System.out.println("请输入要置前的歌曲名称:");
        Scanner scanner = new Scanner(System.in);
        String Music = scanner.next(); //读取需要置前的音乐
        if (!list.contains(Music)){
            System.out.println("抱歉,您需要前移的歌曲不存在");
            return;
        }
        if (list.getFirst() == Music){
            System.out.println("亲您的选的歌曲已经在第一位,不能再置前了");
            return;
        }
        int index = list.indexOf(Music);
        list.add(index-1,Music);
        int lastIndex = list.lastIndexOf(Music);
        list.remove(lastIndex);
       // System.out.println("当前歌单为:"+list);
    }
}
