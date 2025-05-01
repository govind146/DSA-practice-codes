package basic;
import java.util.*;

public class count_of_digits {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String n = String.valueOf(num);
        System.out.println("count :" + n.length());
        String r = Integer.toString(num);
        System.out.println(r + "String");
        int g = Integer.parseInt(r);
        System.out.println(g + "int");

    }
}