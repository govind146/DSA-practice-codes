
package basic;
import java.util.Scanner;

public class tree {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public static void tree(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == n) {
                    System.out.print("| |");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // pattern(n);
        tree(n);

    }
}
