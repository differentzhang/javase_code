package second;
class Person {
    int age = 10;  //成员变量(类中定义的变量)
    //定义speak()方法
    void speak(){
        //int age = 60; //局部变量(方法内部定义的变量)
        System.out.println("大家好,我今年 "+age+"岁");
    }
}
