package sheet_codes;
import java.util.*;
public class repeeated_missing {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,5,7};
        int aa=0,b=0;
        Arrays.sort(a);
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1]){
                aa=a[i];
                b=a[i-1]+1;
                System.out.println(b);
            }
        }
        int d[]={aa,b};
        System.out.println(Arrays.toString(d));
    }
  
}
