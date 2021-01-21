package ck04.basic.src.main.java.day01.common;

public class ForDemo2 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i==3) break;
            System.out.println("i = " + i);
        }
        System.out.println("AAA");

        System.out.println("================");

        xxx:
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                if(j==3){
                    break xxx;
                }
                System.out.println("j = " + j);
            }
            System.out.println("i = " + i);
        }
    }
}
