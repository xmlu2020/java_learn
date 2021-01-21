package ck04.basic.src.main.java.day01.oop.extend;

/**
 * 子类继承父类的属性和方法
 * 一个类只能继承一个类
 */
public class Student extends Person {

    private String className;

    public Student(String name){
        // super 指的父类对象
        super(name);
        System.out.println("student");
    }
    /*
    方法的重写：子父类中 方法名相同 参数列表页相同

     */
    public void eat(){
        super.eat();
        System.out.println("Student.eat");
    }

    public void study(){
        System.out.println(super.getAge());
        System.out.println(this.getName()+" 在学习");
    }
}
