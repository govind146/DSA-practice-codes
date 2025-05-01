package qspider;

public class unique_in_new_array {
    // static void ok(){
    //     int a[] = { 1, 2, 2, 3, 4, 5, 6, 6, 7, 7, 8, 9, 9, 9 };
    //     int b[]=new int[a.length];
    //     b[0]=a[0];
    //     for(int i=1;i<a.length;i++){
    //         if()
    //     }

    // }
    public static void main(String[] args) {
        int a[] = { 1, 2, 2, 3, 4, 5, 6, 6, 7, 7, 8, 9, 9, 9 };
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                ++count;
            }

        }
        System.out.println(count);
        int b[] = new int[count];
        // System.out.print(a[0]);
        int t = 1;
        b[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                b[t] = a[i];
                t++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(b[i]);
        }
       
    }
}
