package ck04.basic.src.main.java.day01.oop;

public class FunctionDemo {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = add(x,y);
        System.out.println(z);
        z = add(x,y,3);
        System.out.println(addAll(1,2,3,4,5,6));
    }

    //方法的重载： 方法名相同 参数列表不同（参数的个数和参数类型）
    //同一个类 方法名相同 参数列表页相同 则报错 只能定义一个
    //方法不能嵌套方法
    public static int add(int a,int b){
        int c = a+b;
        return c;   //返回和返回类型相兼容的数据
    }

    public static int add(long a,int b){
       return 0;
    }

    public static int add(int c,int d,int e){

        return 0;
    }
    public static int add(){
        return add(1,1);
    }

    public static int addAll(int a,int... x){
        int sum = 0;
        for(int i=0;i<x.length;i++){
            sum += x[i];
        }
        return sum;
    }
}
