package pattern_L35_L74;

import java.util.*;

public class pattern_11 {
    // Pattern-11   L 56 triangle + increasing numbers
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val + "\t");
                val++;
            }
            System.out.println();
        }
    }
}
/* 
Input:
5
Output:
1
2       3
4       5       6
7       8       9       10
11      12      13      14      15
 */
