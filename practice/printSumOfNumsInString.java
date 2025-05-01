package practice;

import java.util.*;

public class printSumOfNumsInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        String input = s.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                count = count + input.charAt(i)-'0';
            }
            
        }
        System.out.println(count);
    }

}
