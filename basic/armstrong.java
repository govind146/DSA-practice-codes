package basic;
import java.util.*;

public class armstrong {
    public static void arm(Scanner s) {
        int n = s.nextInt();
        String st = Integer.toString(n);
        int f = n;
        int end=0;
        while (f != 0) {
            int r = f % 10;

            int digit=1;                //       
            for(int i=0;i<st.length();i++){
                digit=digit*r;          // digit = digit + (int) Math.pow(r, st.length());
                }                       //
            end=end+digit;              //
           
            f = f / 10;
        }
        if(end==n){
            System.out.print(end);
        }
        else{
            System.out.print(end+"  not ok");
        }
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // arm(s);
        double digit=0;
        int num = s.nextInt();
        String q = String.valueOf(num);
        int l=q.length();
        for (int i = 0; i < l; i++) {
            int g=q.charAt(i)-'0';
            digit=digit+(Math.pow(g,l));
        }
        System.out.println(digit);
        if(num==(int)digit){
            System.out.println("armstrong");
        }
    }
}
// int value = newData.intValue();
// String q = String.valueOf(num);