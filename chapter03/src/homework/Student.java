package homework;

public class Student {
    private String name;
    private double score;

    //Constructor
    public Student(){

    }
    public Student(String name, double score){
        this.name = name;
        this.score = score;
    }

    //getter and setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getScore(){
        return score;
    }
    public void setScore(double score){
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
