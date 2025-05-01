package practice;
import java.util.*;
public class basic_codes {
    // ---------------------------------
    static void fib(int l){
        int s=0,q=1,w=1;
        for(int i=0;i<l;i++){
            // if(s>=l){
            //     break;
            // }
            // else{
            System.out.println(w);
            w=s+q;
            s=q;
            q=w;
            // }
        }
    }
    // ---------------------------------------
    static void prime(int l){
    
    for(int j=1;j<l;j++){
        int c=0;
    for(int i=1;i<=Math.sqrt(j);i++){
        if(j%i==0){
            c=c+1;
        }

    }
    if(c==1){
        System.out.println(j);
    }
}
}
    // --------------------------------------
    public static void main(String[] args) {
        // fib(10);
        prime(100);
        
    }
    
}
