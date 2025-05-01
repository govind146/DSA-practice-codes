package basic;

import java.util.Scanner;

public class pAttern {
    static void ok() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int store = 0;
        for (int i = 1; i <= n; i++) {
            store += i;
            int printNum = store;
            for (int j = 0; j < i; j++) {

                System.out.print(printNum--);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int store = 0;
        // for (int i = 1; i <= n / 2; i++) {
        //     store += i;
        //     int printNum = store;
        //     for (int j = 0; j < i; j++) {

        //         System.out.print(printNum--);
        //     }
        //     System.out.println();
        // }
        // for (int i = n / 2 + 1; i >= 1; i--) {
        //     for (int j = i; j > 1; j--) {

        //         System.out.print(store--);
        //     }
        //     System.out.println();
        // }
        ok();
    }
}
