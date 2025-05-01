package sheet_codes;

import java.util.Arrays;

public class product_except_itself {
    public static void main(String[] args) {
        int n[]={1,2,3,4};
        int a[]=new int[n.length];
        int f=0;

        a[f]=1;
        for(int i=0;i<n.length;i++){   
            System.out.println(i+" "+f+" "+a[f]);         
            if(i==f){
                continue;
            }
            else if(i==n.length-1){
                a[f]=a[f]*n[i]; 
                i=-1;
                f++;
                a[f]=1;
                // System.out.print(f+" ");
            }
            else{
                a[f]=a[f]*n[i];
                // System.out.println(f); 
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
