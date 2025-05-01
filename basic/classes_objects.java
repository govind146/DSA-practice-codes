package basic;
import java.util.Scanner;

public class classes_objects {
int l,b,p;
    public void input(){
        @SuppressWarnings("resource")
        Scanner s=new Scanner(System.in);
        l=s.nextInt();
        b=s.nextInt();
    }
    public void cal(){
        // l=45;
         p=2*(l+b);
    }
    public void display(){
        System.out.println(p);
    }
    public static void main(String[] args) {
     classes_objects obj=new classes_objects();
     obj.input();
     obj.cal();
     obj.display();
    }

}
