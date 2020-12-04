package homework;

public class Test01 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("boy",90);
        stu1.setName("girl");
        stu1.setScore(88);
        System.out.println(stu1);
        System.out.println(stu2);
    }
}
