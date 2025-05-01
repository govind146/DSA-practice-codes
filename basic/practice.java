package basic;
public class practice {
    public static void main(int n) {
        int end = 0;
        System.out.println(n);
        while (n != 0) {
            int r = n % 10;
            if (r > end) {
                end = r;
                System.out.print(end + ",");
            }
            n = n / 10;
        }

    }
}