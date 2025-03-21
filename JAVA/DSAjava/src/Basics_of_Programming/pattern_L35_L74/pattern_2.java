package Basics_of_Programming.pattern_L35_L74;

import java.util.*;

public class pattern_2 {
    // Pattern-2    L 38
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
/* 
Input:
5
Output:
*       *       *       *       *
*       *       *       *
*       *       *
*       *
*
 */
