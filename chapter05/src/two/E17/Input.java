package two.E17;

public class Input implements Runnable{ //输入类线程

    private Storage st;
    private int num;

    Input(Storage st){
        this.st = st;
    }

    @Override
    public void run() {
        while(true){
            st.put(num++); //将num存入数组，每次存入后num自增
        }
    }
}
