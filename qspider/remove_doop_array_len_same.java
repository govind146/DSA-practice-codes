package qspider;

import java.util.*;

public class remove_doop_array_len_same {
    public static void main(String[] args) {
        int a[] = { 1,1, 2, 2, 3, 4,4};
        int b[] = new int[a.length];
        int c = 1;
        int j = 0;
        b[j]=a[0];
        for (int i = 1; i < a.length-1; i++) {
            if (a[i] != a[i - 1]) {
                c += 1;
                b[++j] = a[i];
            }
        }
        System.out.println(c);
        System.out.println(Arrays.toString(b));

        int s[]=Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(s));

    }
}
