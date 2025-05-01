package practice;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int size = s.nextInt();
        // int a[][] = new int[size][size], ii = size + 1, jj;

        // for (int i = 0; i < size; i++, --ii) {

        // jj = ii;
        // for (int j = 0; j <= i; j++) {

        // if (j == i) {
        // a[i][j] = i + 1;
        // } else {
        // a[i][j] = a[i - 1][j] + jj;
        // }
        // jj++;
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < size; i++) {
        // for (int j = 0; j < size; j++) {
        // if (a[i][j] < 10) {
        // System.out.print(a[i][j] + " ");
        // } else {
        // System.out.print(a[i][j] + " ");
        // }

        // }
        // System.out.println();
        // }
        int size = 8, storage = 1, internalStore = 0;
        int sizeCopy = size;

        for (int i = 1; i <= size; i++) {
            int copy = storage;
            // ----------------------
            for (int j = 1; j <= i; j++) {
                System.out.print(copy + " ");

                copy = copy - internalStore++;
                // internalStore++;
            }
            // -------------------------
            storage = storage + sizeCopy;
            sizeCopy--;
            internalStore = sizeCopy;

            System.out.println();
        }
    }
}