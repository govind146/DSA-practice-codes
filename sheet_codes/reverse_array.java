package sheet_codes;
import java.util.*;
public class reverse_array {
    public static void main(String[] args) {
        
    
    int a[]={1,3,43,5,4,};
    int[] b=new int[a.length];
    int v=0;
    for(int i=a.length-1;i>=0;i--){
        b[v]=a[i];
        v++;
    }
    System.out.println(Arrays.toString(b));
}
}