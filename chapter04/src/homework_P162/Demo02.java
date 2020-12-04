package homework_P162;


public class Demo02 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.work();
        ProjectManager projectManager = new ProjectManager();
        projectManager.work();
    }
}

abstract class Employee{
     String name;
     int number;
     int salary;

    public abstract void work();

}
class Programmer extends Employee{

    @Override
    public void work() {
        System.out.println("程序员在工作!");
    }
}
class ProjectManager extends Employee{

    @Override
    public void work() {
        System.out.println("项目经理在工作!");
    }

    public void bonus(){
        System.out.println("项目经理的奖金!");
    }
}