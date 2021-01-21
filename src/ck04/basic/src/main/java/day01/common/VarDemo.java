package ck04.basic.src.main.java.day01.common;

public class VarDemo {
    public static void main(String[] args) {
        // 类型 变量名 赋值操作 数值;
        int a = 3;
        // 整数类型 byte  <  short < int < long

        // 浮点型  小数  float  double
        double d = 2.6;  //BigDecimal
        d = d -2.0;   // 0.6    0.6000000000000001   0.599999999999999999
        System.out.println(d);         //向控制台输出

        System.out.println(d==0.6);    // 范围 1E-6
        //  d-0.6  取绝对值  < 1E-6

        // boolean  char
        boolean flag = false;   // false true

        char c = 'A';

        String str = "ABC";

    }
}
