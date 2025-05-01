package qspider;

public class secnd_unrepeted_char {
    static boolean pt(int e,char c){
        if(e==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int y=0;
        String s="rlkwgrwiuwrwwliwu";
        int a[]=new int[129];
        for(int i=0;i<s.length();i++){
            int q=s.charAt(i);
            a[q]++;
        }
        for(int i=0;i<s.length();i++){
            int e=a[(int)s.charAt(i)];
            boolean f=pt(e,s.charAt(i));
            if(f==true){
                y++;
                System.out.println(s.charAt(i));
                break;
            }
        }
        if(y==0){
            System.out.println("null");
        }

    }
}
