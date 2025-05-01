package qspider;

import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class p2 {
    int r = 0;

    boolean isPresentOrNot(int a[], int k) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                r = i;
                return true;
            }

        }
        return false;

    }

    int isLargest(int a[]) {
        // System.out.println(r);      
        int b = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b) {
                b = a[i];
            }
        }
        return b;
    }

    void is2ndLargest(int a[]){
        int max=0,max2=0;
        if(a.length<2){
            System.out.println("doesnt exist");
            return;
        }
        for(int i = 0; i < a.length; i++){
            if(a[i]>max){
                max2=max;
                max=a[i];
            }
            else if(a[i]>max2 && a[i]!=max){
                max2=a[i];
            }
            
        }
        System.out.println(max2);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a[] = { 21, 3, 12, 32, 23131, 333, 2 };
        int key = 32;
        p2 isp=new p2();
        // System.out.println(isp.isPresentOrNot(a, key) + " " + isp.r);
        p2 largestNumber=new p2();
        // System.out.println(largestNumber.isLargest(a));
        isp.is2ndLargest(a);
        
    }
}
