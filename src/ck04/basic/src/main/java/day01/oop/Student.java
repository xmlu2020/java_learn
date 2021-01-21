package ck04.basic.src.main.java.day01.oop;

public class Student {
    // 属性 静态特征
    private String name;
    private int age;

    public String getName(){
        return name;
    }
//    public void setName(String name){
//        this.name = name;
//    }

    //构造器 构造方法 =》 py __init__
    //构造器不写 默认添加
    // public Student(){}
    // 修饰符 类名(参数列表){方法体}
    public Student(String name){
        // this 当前对象本身
        // 1、可以用来调用本身的属性和方法
        this.name = name;

    }
    // 构造器可以重载
    // 2、  this 可以用来调用其他构造器
    //  这行代码必须写在第一行
    public Student(){
        this("没有名字");
        System.out.println("警告：学生还没有名字");
    }



    // 方法 行为
    // 修饰符 返回类型 方法名(参数列表){ 方法体 }
    //  void表示无返回值
    public void study(){
        System.out.println(name+" 在学习");
    }


}
