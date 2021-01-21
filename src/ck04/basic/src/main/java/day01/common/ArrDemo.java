package ck04.basic.src.main.java.day01.common;

public class ArrDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};   //静态初始化

        //动态初始化
        int[] arr2 = new int[]{4,5,6,7};
        int[] arr3 = new int[4];

        int[] arr4 = {1,2,3,4};

        int[] arr5;
        arr5 = new int[]{2,3,4,5};

        System.out.println(arr5[4]);



    }
}
