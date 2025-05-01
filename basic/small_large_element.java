package basic;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class small_large_element {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        // for(int i=0;i<n;i++){
        //    System.out.print(a[i]+" ");
        // }
        // int sm=a[0],gr=a[0];
       
        // for(int i=0;i<n;i++){
        //   if(sm>=a[i]){
        //     sm=a[i];
        //   }
        //   if(gr<=a[i]){
        //     gr=a[i];
        //   }
        // }
        System.out.println("Smallest :"+a[0]);//sm
        System.out.print("greatest :"+a[n-1]);//gr
        
    }
}
