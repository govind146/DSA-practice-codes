package basic;
import java.util.*;
public class kth_largest{
   
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
    System.out.println();
    // System.out.print("Enter the position:");
    // int p=s.nextInt();
    System.out.println(a[n-2]); //for kth term a[n-p]
    }
}
