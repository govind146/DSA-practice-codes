package basic;
import java.util.Scanner;

public class perfect {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int sum=0;
    int n=s.nextInt();
    for(int i=1;i<=n/2;i++){
        if(n%i==0){
            sum=sum+i;
        }
    }
    System.out.println(sum);
    if(n==sum){
        System.out.println("perfect");

    }else{
        System.out.println("imperfect");
    }
   } 
}
