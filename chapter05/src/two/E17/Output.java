package two.E17;

public class Output implements Runnable{ //输出类线程

    private Storage st;

    Output(Storage st){
        this.st = st;
    }

    @Override
    public void run() {
        while(true){
            st.get(); //循环取出元素
        }
    }
}
