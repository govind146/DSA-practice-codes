package qspider;

import java.util.Arrays;

public class split {
    public static void main(String[] args) {
        
        String d="wertyuil";
        char s[]=d.toCharArray();
        // char u=s[0]; // Removed unused variable
        String f[]=d.split("");
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
        }
        

    }
}
