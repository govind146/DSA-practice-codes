package qspider;

public class vowels {

    public static void main(String[] args) {
        String s = "rwerw224@";
        int v = 0, c = 0, n = 0, sp = 0;

        for (int i = 0; i < s.length(); i++) {
            char e = s.charAt(i);
            if (e == 'a' || e == 'e' || e == 'i' || e == '0' || e == 'u') {
                v++;
            } else if (e > 'a' && e <= 'z') {
                c++;
            } else if (e >= '0' && e <= '9') {
                n++;
            } else {
                sp++;
            }

        }
        System.out.println(v);
        System.out.println(c);
        System.out.println(n);
        System.out.println(sp);
    }

}
