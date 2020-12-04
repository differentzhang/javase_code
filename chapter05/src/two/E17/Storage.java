package two.E17;

/**
 * 5.6.1 问题引入
 */
/*public class Storage {
    //数据存储数组
    private int[] cells = new int[10];
    //inPos表示存入时数组下标，outPos表示取出时数组下标
    private int inPos,outPos;
    //定义一个put()方法向数组中存入数据
    public void put(int num){
        cells[inPos] = num;
        System.out.println("在cells["+inPos+"]中放入数据---"+cells[inPos]);
        inPos++;  //存完让位置加1
        if (inPos == cells.length){
            inPos = 0; //当inPos为数组长度时，将其置为0
        }
    }

    public void get(){
        int data = cells[outPos];
        System.out.println("从cells["+outPos+"]中取出数据"+data);
        outPos++;
        if (outPos == cells.length){
            outPos = 0;
        }
    }
}*/
public class Storage {
    //数据存储数组
    private int[] cells = new int[10];
    //inPos表示存入时数组下标，outPos表示取出时数组下标
    private int inPos,outPos;
    private int count; //存入或者取出数据的数量

    //定义一个put()方法向数组中存入数据
    public synchronized void put(int num){

        try {
            //如果放入的数据等于cells的长度，此线程等待 。说明存满了，不能再存了。
            while (count == cells.length){
                this.wait();
            }
            cells[inPos] = num;
            System.out.println("在cells["+inPos+"]中放入数据---"+cells[inPos]);
            inPos++;  //存完让位置加1
            if (inPos == cells.length){
                inPos = 0; //当inPos为数组长度时，将其置为0
            }
            count++;  //每放一个数据count加1
            this.notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void get(){
        try {
            while (count == 0){ //如果count为0，此线程等待，说明没有数据了，取不了了
                this.wait();
            }
            int data = cells[outPos];
            System.out.println("从cells["+outPos+"]中取出数据"+data);
            cells[outPos] = 0; //取出后，当前位置的数据置0  其实我认为这行代码有没有都不受影响。
            outPos++;  //取完数据让位置加1
            if (outPos == cells.length){  //当cells[9]取完数据后再从cells[0]开始
                outPos = 0;
            }
            count--;
            this.notify();  //唤醒此同步锁上等待的第一个调用wait()方法的线程
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}