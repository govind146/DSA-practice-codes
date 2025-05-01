package basic;
import java.util.*;
public class sum_of_digits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(),sum=0;
        String strn=Integer.toString(num);
       
        for(int i=0;i<strn.length();i++){
            int digit=strn.charAt(i)-'0';
            sum=sum+digit;
        }
        System.out.println(sum);
      
    }
}
