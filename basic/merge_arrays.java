package basic;
import java.util.*;

public class merge_arrays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]={1,2,3,4,3};
        int b[]={0,4,0,5,6};
        int l=a.length+b.length;
        int c[]=new int[l];
       int j=0;
        
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=a.length;i<l;i++){
            c[i]=b[j++];
        }
        Arrays.sort(c);
        for(int i=0;i<l;i++){
            System.out.print(c[i]);
        }


     
    }
}
