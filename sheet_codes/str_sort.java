package sheet_codes;

import java.util.Arrays;

public class str_sort {
    public static void main(String[] args) {
        // String s[]={"werr","et","wretrtyh","1"};
        // Arrays.sort(s);
        // System.out.println(Arrays.toString(s));
long x= 120,s=0;
while(x!=0){
    long r=x%10;
   
    s=s*10+r;

    x=x/10;

}
if((s>=Math.pow(2,31)-1) || (s<=Math.pow(-2,31)) ){
    System.out.println(0);
}
else{
    System.out.println((int)s);
}
       
    }
    
}
