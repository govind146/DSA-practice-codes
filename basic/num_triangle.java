package basic;
import java.util.Scanner;

public class num_triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = i; k <= n; k++) {
                System.out.print(" ");
            }
            int a = i;
            int b = 2;
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (a < 1) {
                    System.out.print(b);
                    ++b;
                } else {
                    System.out.print(a);
                    --a;
                }

            }
            // for (int j = 1; j <= i; j++) {
            // if (j == 1) {
            // continue;

            // }
            // System.out.print(j);

            // }
            System.out.println();

        }

    }
}
