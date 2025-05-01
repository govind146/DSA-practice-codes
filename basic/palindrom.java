package basic;
import java.util.*;
public class palindrom {
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
        if(num==reverse){
            System.out.println("palindrome!!!");
        }
        else{
            System.out.println("it's not!!!!");
        }


    }
}
