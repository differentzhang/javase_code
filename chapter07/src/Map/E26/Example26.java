package Map.E26;

public class Example26 {
    public static void main(String[] args) {
        CachePool<Integer> pool = new CachePool<Integer>();
        pool.save(new Integer(1));
        Integer temp = pool.get();
        System.out.println(temp);
    }
}
class CachePool<T>{
    T temp;
    public void save(T temp){
        this.temp = temp;
    }
    public T get(){
        return temp;
    }
}
