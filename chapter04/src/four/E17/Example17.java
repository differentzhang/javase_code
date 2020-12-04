package four.E17;

public class Example17 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.toString() );
    }
}

class Animal {
    //重写Object类的toString方法
    public String toString(){
        return "I am an animal";
    }
}