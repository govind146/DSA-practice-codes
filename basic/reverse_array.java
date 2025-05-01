package basic;
import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
    
        int a[]=new int[n];
        int l=n-1;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            
        }
        for(int i=0;i<n/2;i++){
            int t=a[i];
            a[i]=a[l];
            a[l]=t;
            l--;
           
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");

        }
       

    }
}
