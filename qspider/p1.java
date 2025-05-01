package qspider;
import java.util.*;

public class p1 {
    void reverse(Scanner s) {
        int n = s.nextInt(), rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println(rev);
    }

    // -------------------------------------------------
    void qwerty() {
        System.out.println("cerefr");
    }

    // -------------------------------------------------
    public static void q1(Scanner s) {
        System.out.print("Start :");
        int st = s.nextInt();
        System.out.print("End :");
        int en = s.nextInt();
        for (int i = st; i <= en; i++) {
            int j = i, sum = 0;
            while (j > 0) {
                int r = j % 10;
                sum = sum + r;
                j = j / 10;
            }
            // System.out.println(sum);
            if (sum % 3 == 0) {

                System.out.println("  " + i);
            }
        }
    }

    // ----------------------------------------------------------
    public static void q2(Scanner s) {
        System.out.print("Start :");
        int st = s.nextInt();
        System.out.print("End :");
        int en = s.nextInt();
        for (int i = st; i <= en; i++) {
            int j = i, sum = 0;
            while (j > 0) {
                int r = j % 10;
                sum = sum * 10 + r;
                j = j / 10;
            }

            if (sum == i) {

                System.out.println("  " + i);
            }
        }
    }

    // -----------------------------------------------
    public static boolean isInTable(int i) {
        if (i % 3 == 0) {
            return true;
        }
        return false;
    }

    // ---------------------------------------------
    public static void armstrong(Scanner s) {
        int n = s.nextInt();
        String st = Integer.toString(n);
        int f = n;
        int end = 0;
        while (f != 0) {
            int r = f % 10;

            int digit = 1; //
            for (int i = 0; i < st.length(); i++) {
                digit = digit * r; // digit = digit + (int) Math.pow(r, st.length());
            } //
            end = end + digit; //

            f = f / 10;
        }
        if (end == n) {
            System.out.print(end);
        } else {
            System.out.print(end + "  not ok");
        }

    }

    // ----------------------------------------------
    public static void factorial(Scanner s) {
        int n = s.nextInt();
        int x = 1;
        for (int i = n; i > 0; i--) {
            x = x * i;
        }
        // for(int i=1;i<=n;i++){
        // x=x*i;
        // }
        System.out.println(x);
    }

    // -----------------------------------------------
    static void pass(Scanner s) {
        int n = s.nextInt();
        int c = n, sum = 0;
        while (c != 0) {

            int r = c % 10;
            int x = 1;
            for (int i = r; i > 0; i--) {
                x = x * i;
            }
            sum = sum + x;
            c = c / 10;
        }
        System.out.println(sum);

    }

    // -----------------------------------------------
    static int factorialDigit(int d) {
        int x = 1;
        for (int i = 1; i <= d; i++) {
            x = x * i;
        }
        return x;
    }

    static void divide(Scanner s) {
        int n = s.nextInt();
        int q = n;
        int sum = 0;
        while (q != 0) {
            int r = q % 10;
            sum = sum + factorialDigit(r);
            q = q / 10;
        }
        if (sum == n) {
            System.out.println("success");

        }
    }

    // --------------------------------------------------
    static void sum_ext_int(Scanner s) {
        int n = s.nextInt();
        String q = Integer.toString(n);
        int el = 0, cl = 0;
        for (int i = 0; i < q.length(); i++) {
            if (i == 0 || i == q.length() - 1) {
                el = el + q.charAt(i) - '0';
            } else {
                cl = cl + q.charAt(i) - '0';
            }

        }
        if (el == cl) {
            System.out.println(el + "  ok  " + cl);
        } else {
            System.out.println(el + "  not ok  " + cl);
        }
    }

    static void sum_ext_int_2(Scanner s) {
        int n = s.nextInt();
        int c = n;
        int count = 0, xl = 0, cl = 0;
        while (c != 0) {
            int r = c % 10;
            count++;
            c = c / 10;
        }
        int counter = 1;
        while (n != 0) {
            int r = n % 10;
            if (counter == 1 || counter == count) {
                xl = xl + r;
            } else {
                cl = cl + r;
            }
            n = n / 10;
            counter++;
        }
        if (xl == cl) {
            System.out.println(xl + "   ok  " + cl);
        }
    }

    // sum of extreme digits = sum of internal digits
    static void sir_cheppina_tech(Scanner s) {
        int n = s.nextInt();
        int ex = n % 10, il = 0;
        n = n / 10;
        while (n > 9) {
            il = il + (n % 10);
            n = n / 10;
        }
        ex = il + n;
        System.out.println(ex);
        System.out.println(il);

        if (ex == il) {
            System.out.println("ok");
        }

    }
    // =-------------------------------------------------

    static boolean isPrime(int n) {
        // int n = s.nextInt();
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void prime(Scanner s) {
        int n = s.nextInt();
        if (isPrime(n)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    // --------------------------------------------------
    static void lcm(Scanner s) {

        int busa = s.nextInt();
        int busb = s.nextInt();
        // int j=1;
        int large = busa >= busb ? busa : busb;
        for (int i = large; true; i++) {
            // System.out.println(j++ +" "+i);
            if (i % busa == 0 && i % busb == 0) {
                System.out.println(i);
                break;
            }

        }
    }

    // --------------------------------------------------
    static void hcf(Scanner s) {
        int a = 2, b = 7;
        int hcf = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);

    }

    // --------------------------------------------------
    static void st(Scanner s) {

        String sb = s.nextLine();
        String ar[] = sb.split(" ");
        StringBuffer w = new StringBuffer("");

        for (int i = 0; i < ar.length; i++) {
            StringBuffer q = new StringBuffer(ar[i]);

            // if (i == ar.length - 1) {
            w = w.append(q.reverse());
            // }
            // else {
            // w = w.append(q.reverse() + " ");
            // }
        }
        System.out.println(w);

    }

    // --------------------------------------------------

    // take a number ,add 1 to it ,if the sum is a perfect sqrt then its a sunny number
    static void sunny(Scanner s) {
        double n = s.nextDouble();
        // if(Math.sqrt(++n)-Math.floor(Math.sqrt(n))==0){
        // System.out.println("True");
        // }
        // else{
        // System.out.println("False");
        // }

        String a = Math.sqrt(++n) - Math.floor(Math.sqrt(n)) == 0 ? "True" : "False";
        System.out.println(a);

    }

    // --------------------------------------------------
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // p1 obj = new p1();
        // obj.reverse(s);
        // obj.qwerty();
        // q2(s);
        // armstrong(s);
        // factorial(s);
        // pass(s);
        // divide(s);

        // sum_ext_int(s);
        // sum_ext_int_2(s);
        // sir_cheppina_tech(s);

        // prime(s);
        // lcm(s);
        // hcf(s);
        // st(s);
        sunny(s);
    }
}
