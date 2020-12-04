package Map.E25;

/**
 * 7.6.2 自定义泛型
 */
public class Example25 {
    public static void main(String[] args) {
        CachePool pool = new CachePool();
        pool.save(new Integer(1));
        //String temp = pool.get();  //java: 不兼容的类型: java.lang.Object无法转换为java.lang.String
       // System.out.println(temp);
    }
}
class CachePool{
    Object temp;
    public void save(Object temp){
        this.temp = temp;
    }
    public Object get(){
        return temp;
    }
}