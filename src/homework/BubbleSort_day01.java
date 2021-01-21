package homework;

import java.util.Arrays;

public class BubbleSort_day01 {
    public static void main(String[] args) {
        int[] a = new int[]{4,5,2,6,2,4,8,9,6,1,9,55,66,11,22};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = 0;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
