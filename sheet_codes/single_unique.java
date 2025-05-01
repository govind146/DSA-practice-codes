package sheet_codes;
import java.util.*;

import basic.sum_of_digits;
public class single_unique {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // int[] a={1,2,4,4,3,2,6,-1,-1,6,1};
        // Arrays.sort(a);
        // for(int i=1;i<a.length;i++){
        //     if(a[i-1]!=a[i] && a[i]!=a[i+1]){
        //         System.out.println(a[i]);
        //         break;
        //     }
        // }
        ArrayList<Integer> n=new ArrayList<>();
       
        String[] h=s.nextLine().split(" ");
        
        System.out.println(h.length);
        for (String str : h) {
            System.out.print(Integer.parseInt(str));
        }




// int g=Integer.parseInt(h[0]);
//         for(int i=0;i<g;i++){
//             String d=s.nextLine();
//             n.add(Integer.parseInt(d));
//         }






        // for(int i=0;i<5;i++){
        //     String[] input = s.nextLine().split(" ");
        //     for (String str : input) {
        //         n.add(Integer.parseInt(str));
        //     }
        // }




        // System.out.println(n);
        // for(int i=0;i<5;i++){
        //     // String d=s.nextLine();
        //     System.out.println(n.get(i));
        // }
       
    }
    
}
