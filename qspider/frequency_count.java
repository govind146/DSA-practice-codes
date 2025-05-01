package qspider;

import java.util.*;

public class frequency_count {
    public static void main(String[] args) {
        int a[] = { 1, 4, 3, 2, 5, 2, 1, 5, 4, 4, 0, 6,6 };
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            // System.out.println("before while " + "a["+i+"]="+a[i]);
            while (i + 1 < a.length && a[i] == a[i + 1]) {
                count++;
                i++;
            }
            // System.out.println("after  while " + "a["+i+"]="+a[i]);
            System.out.println(a[i] + "--->" + count);

        }
    }

}
