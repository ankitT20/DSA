package Basics_of_Programming.basics_L1_L34;

import java.util.*;

public class fibonacci {
    // 0 1 1 2 3 5 8 13 21 34 55
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }

    }
}
