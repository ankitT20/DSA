package Basics_of_Programming.pattern_L35_L74;

import java.util.*;

public class pattern_12 {
    // Pattern-12   L 58  trialgle pattern + fibonacci
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
/* 
Input:
5
Output:
0
1       1
2       3       5
8       13      21      34
55      89      144     233     377
*/
