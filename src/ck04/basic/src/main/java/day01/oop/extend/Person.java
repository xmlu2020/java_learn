package ck04.basic.src.main.java.day01.oop.extend;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("Person.eat");

    }

}
