package sheet_codes;
import java.util.*;
public class contains_duplicates {
    public static void main(String[] args) {
        int y=0;
        int a[]={445,445,22,4,5,3};
        Arrays.sort(a);
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1]){
                y++;
                System.out.println("dupli present  "+true);
                break;
            }
        }
        if(y==0){
            System.out.println(false);
        }

    }
}
