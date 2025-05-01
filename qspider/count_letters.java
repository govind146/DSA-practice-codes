package qspider;

public class count_letters {
    public static void main(String[] args) {
        
    String s="dharma";
    int a[]=new int[129];
    for(int i=0;i<s.length();i++){
        int pos=s.charAt(i);
        a[pos]++;
    }
    for(int i=0;i<a.length;i++){
        if(a[i]!=0){
            char c=(char)i;
            int freq=a[i];
            System.out.println(c+"-->"+freq);
        }
    }
}} 
