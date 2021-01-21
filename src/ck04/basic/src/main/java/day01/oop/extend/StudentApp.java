package ck04.basic.src.main.java.day01.oop.extend;

public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student("zs");
//        s1.setName("zs");
        s1.study();
        s1.eat();

//        Person p1 = new Student("ls");
//        p1.eat();
//        new Person().eat();
    }
}
