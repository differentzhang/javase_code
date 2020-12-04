package homework;

import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person("zhangsan",18);
        Person p2 = new Person("lisi",17);
        Person p3 = new Person("wangwu",18);
        set.add(p1);
        set.add(p2);
        set.add(p3);
       /* Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/
        for (Object obj : set){
            Person p = (Person)obj;
            System.out.println(p.name+":"+p.age);
        }
    }
}
class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int hashCode(){
        return name.hashCode();
    }
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if (!(o instanceof Person)){
            return false;
        }
        Person person = (Person)o;
        boolean b = this.name.equals(person.name);
        return b;
    }
    /*@Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/
}