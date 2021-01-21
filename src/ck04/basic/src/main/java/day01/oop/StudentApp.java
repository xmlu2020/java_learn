package ck04.basic.src.main.java.day01.oop;

public class StudentApp {
    public static void main(String[] args) {
        // int   a  = 3  ;
        Student s1 = new Student("lisi");
//        s1.setName("zs");
        System.out.println(s1.getName());
        s1.study();
        Student s2 = new Student("zhangsan");
        s2.study();
        Student s3 = new Student();
        s3.study();


//        s1.name = "zhangsan";
//        s1.age = 20;
//
//        System.out.println(s1.name+":"+s1.age);
//        s1.study();
//
        Class cls = Student.class;

    }

}
