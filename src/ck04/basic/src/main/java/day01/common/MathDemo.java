package ck04.basic.src.main.java.day01.common;

public class MathDemo {
    public static void main(String[] args) {
        // +
        int a = 1+2;
        String str = "asd";
        str = str + 123;
        System.out.println(str);
        Integer.parseInt(String.valueOf(123));
        System.out.println(5/2);

        // ++ --
        // 1、先将c的值赋值给c++这个表达式
        // 2、将c的值自增1
        // 3、将c++的值赋值给d
        int c = 3;
        int d = c++;

        // 1、先将c的值自增1
        // 2、在将自增后的值赋值给++c这个表达式
        // 3、将++c的值赋值给e
        c = 3;
        int e = ++c;

        int t = 3;
        int x = t++ + ++t;
        System.out.println(t+":"+x);

        int aa = 1;
        aa += 2;   // =>  aa = aa+2

        short ss = 3;
        ss+=2;
//        ss = ss +2;

        // &&   &    ||   |   !
        //  && 短路与 || 短路或
        boolean flag = ss>3 && ss<4;

        //  &   |   >>    <<    >>>
        int bb = 3&2 ;

        int cc = 5;

        int dd = cc>6 ? 7 : 8;
        System.out.println("dd = " + dd);


    }
}
