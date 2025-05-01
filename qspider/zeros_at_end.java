package qspider;

import java.util.*;

public class zeros_at_end {
    public static void main(String[] args) {

        int a[] = { 0, 1, 2, 0, 3, 0, 2 };
        int b[] = new int[a.length];
        int l = a.length;
        int j = 0;
        for (int i = 0; i <l; i++) {
            if (a[i] != 0) {
                b[j] = a[i];
                j++;
            }
        }
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }

    }

}
