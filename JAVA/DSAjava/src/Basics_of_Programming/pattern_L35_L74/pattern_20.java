package Basics_of_Programming.pattern_L35_L74;

import java.util.*;

public class pattern_20 {
    // Pattern-20   L 74
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print("*\t");
                } else if (i > n / 2 && (i == j || i + j == n + 1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
/* 
Input:
5
Output:
*                               *
*                               *
*               *               *
*       *               *       *
*                               *
 */
