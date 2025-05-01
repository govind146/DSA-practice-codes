package practice;

import java.util.*;

class a_plus_a_Plus {
    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 3 }, s = 0;

        for (int i = 0; i < a.length; i++) {
            s = s + a[i] * (a.length - i);
        }
        
        System.out.println(s);
    }
}