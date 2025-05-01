package qspider;

import java.util.*;

public class missing_num {
    public static void main(String[] args) {
        
    
        Scanner s = new Scanner(System.in);
        // int n = s.nextInt();

        int a[] = { 1, 3, 2, 5, 7, 6, 4 };
        int l = a.length + 1;
        int sum = 0;
        int sumNatural = l * ((l + 1)) / 2;
        for (int i = 0; i < a.length; i++) {

            sum = sum + a[i];
        }
        int missingNumber = sumNatural - sum;
        System.out.println(missingNumber);
    
}
}