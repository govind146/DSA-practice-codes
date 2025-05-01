package qspider;

import java.lang.reflect.Array;
import java.util.*;

public class array_union {
    public static void main(String[] args) {
        // System.out.println(anagram.string_1);
        int a1[] = {  2, 3, 4, 5,2,8,9 };
        int a2[] = {  3, 4, 1, 5 ,8};
        int a3[] = new int[a1.length + a2.length];
        for (int i = 0; i < a3.length; i++) {
            if (i < a1.length) {
                a3[i] = a1[i];
            } else {
                a3[i] = a2[i - a1.length];
            }

        }
        Arrays.sort(a3);
        int c = 1;
        String s=Arrays.toString(a3);
        System.out.println(s);
        // System.out.println(s.getClass().getSimpleName());
        // [1, 1, 2, 2, 3, 3, 4, 4, 5, 8]
        for (int i = 0; i < a3.length-1; i++) {
            
            if (a3[i] != a3[i + 1]) {
                // System.out.println(a3[i]+"    "+a3[i+1]);
                c = c + 1;

            } else {
                continue;
            }
        }
        System.out.println(c);
        int[] a4 = new int[c];
       
        // [1, 1, ,2,2, 3, 3, 4, 4, 5, 8]
        int k=0;
        for (int i = 0; i < a3.length-1; i++) {
            if (a3[i] != a3[i+1]) {
                // System.out.println(a3[i]+"    "+a3[i+1]);
                a4[k]=a3[i];
                k++;
            } 
        }
        a4[k]=a3[a3.length-1];
        System.out.println(Arrays.toString(a4));

    }
}
