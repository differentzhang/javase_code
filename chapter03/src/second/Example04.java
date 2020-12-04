package second;
public class Example04 {
    public static void main(String[] args) {
        Student_one stu = new Student_one();
        stu.setAge(-30);
        stu.setName("李芳");
        stu.introduce();
    }
}
class Student_one{

    private String name;
    private int age;

    //getter and setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    /*public void setName(String stuName){
        name = stuName; //没有用this的方式
    }*/
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age <= 0) {
            System.out.println("年龄不合法......");
        } else {
            this.age = age;
        }
    }

    //introduce方法
    public void introduce(){
        System.out.println("大家好,我叫"+name+"我今年"+age+"岁!");
    }
}
