package ck04.basic.src.main.java.day01.oop;

public class ModifiersDemo {
    public static void main(String[] args) {
        //private [default] protected  public
        //属性尽可能的去封装  private
        Aoo aoo = new Aoo();
        aoo.age = 18;
    }
}

class Aoo{
    int age;

    public void f(){
        System.out.println(age);
    }
}