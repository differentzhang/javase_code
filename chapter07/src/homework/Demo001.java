package homework;

import java.util.LinkedList;



//LinkedList,删除重复的元素
public class Demo001 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("stu1");
        list.add("stu2");
        list.add("stu3");
        list.add("stu4");

        list.add("stu3");

        //这里用set集合的特点，所以会不包含重复元素，
        //但是set集合是无序的
        /*HashSet<String> set = new HashSet<>();
        Iterator it = list.iterator();
        while (it.hasNext()){
            set.add((String)it.next());
        }

        Iterator it2 = set.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }*/
        LinkedList<String> list2 = new LinkedList<String>();
        for (String str : list){
            //这里判断list2集合中是否包含list中的某个元素，如果不包含，则添加到list2中
            if (!list2.contains(str)){
                list2.add(str);
            }
        }

    }
}
