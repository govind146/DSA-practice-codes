package sheet_codes;
import java.util.*;
public class chocolate_distribution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // int packetsCount=s.nextInt();
        // int[] a=new int[packetsCount];
        // for(int i:a){
        //     a[i]=s.nextInt();
        // }
        int a[]={2,3232,4,2,42,2};
        int m=4;
        Arrays.sort(a);
        int b[]=new int[m];
        for(int i=0;i<m;i++){
            b[i]=a[i];
        }

        
        System.out.println(Arrays.toString(b));
        System.out.println(b[m-1]-b[0]);
    }
}
