package qspider;
import java.util.*;
public class prt_unique {
    static void new_method(){
        int a[]={1,2,2,3,4,5,6,6,7,7,8};
        System.out.println(a[0]);
        for(int i=1;i<a.length;i++){
            if(a[i]!=a[i-1]){
                System.out.println(a[i]);
            }


        }

    }
    // =============================================================
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]={1,2,2,3,4,5,6,6,7,7,8};
        for(int i=0;i<a.length-1;i++){       
            if(a[i]==a[i+1]){
                continue;
            }
            else{
        // System.out.println(a[i]);
            }
        }
        // System.out.println(a[a.length-1]);
        new_method();
    }
}
