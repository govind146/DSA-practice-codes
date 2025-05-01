
package basic;
import java.util.Scanner;

public class tobinary {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        // int n=s.nextInt();
        // String b=Integer.toBinaryString(n);
        // System.out.println(b);

        System.out.print("Enter a number :");
        int num = s.nextInt();
        int a[] = new int[10];
        int r, u = 0;
        int d = num, i = 0;
        while (d != 0) {
        r = d % 2;
        a[i] = r;
        i++;
        u++;
        d = d / 2;
        }
        System.out.println("The binary of " + num + " is :");
        for (int j = u - 1; j >= 0; j--) {
        System.out.print(a[j]);

        }

    }
}
