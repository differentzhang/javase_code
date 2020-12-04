package E11;

/**
 * 3. arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 *  用于将一个数组中的元素快速拷贝到另一个数组。
 *    src：表示源数组
 *    dest：表示目标数组
 *    srcPos：表示源数组中拷贝元素的起始位置
 *    destPos：表示拷贝到目标数组的起始位置
 *    length：表示拷贝元素的个数
 *
 * 需要注意的是，在进行数组复制时，目标数组必须有足够的空间来存放拷贝的元素，否则会发生角标越界异常
 */
public class Example11 {
    public static void main(String[] args) {
        int[] fromArray = {101,102,103,104,105,106}; //源数组
        int[] toArray = {201,202,203,204,205,206,207}; //目标数组
        System.arraycopy(fromArray,2,toArray,3,4); //拷贝数组元素
        for (int i = 0; i < toArray.length; i++) {
            System.out.println(i+"："+toArray[i]);
        }
    }
}
