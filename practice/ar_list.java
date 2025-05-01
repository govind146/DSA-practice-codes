package practice;

import java.util.*;

public class ar_list {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            a.add(s.nextInt());
        }
        for (int i : a) {
            a.get(i);
        }

    }
}
