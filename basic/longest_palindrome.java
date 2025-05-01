package basic;
import java.util.Scanner;

public class longest_palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int q, r, num = 0, lg = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            q = a[i];
            while (q != 0) {
                // System.out.println(q);
                r = q % 10;
                num = num * 10 + r;
                q = q / 10;
            }
            if (num == a[i] && a[i] >= lg) {
                lg = a[i];
            }
            num = 0;
        }
        System.out.println(lg);

    }
}
