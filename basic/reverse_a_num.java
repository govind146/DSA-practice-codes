package basic;
import java.util.*;

public class reverse_a_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String n = Integer.toString(num);
        String mt = "";
        for (int i = n.length()-1; i >= 0; i--) {
            mt = mt + n.charAt(i);
        }
        int reverse=Integer.parseInt(mt);
        System.out.println(reverse);

    }

}
