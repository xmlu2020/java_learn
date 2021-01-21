package ck04.basic.src.main.java.day01.common;

public class SwitchDemo {
    public static void main(String[] args) {
        int a = 2;
        // int byte char 枚举 short  String
        final int y = 4;
        switch (a){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
            case y:
                System.out.println("y");
            default:
                System.out.println("other");
        }
    }
}
