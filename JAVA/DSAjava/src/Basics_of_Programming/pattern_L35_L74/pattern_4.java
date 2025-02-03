package Basics_of_Programming.pattern_L35_L74;

import java.util.*;

public class pattern_4 {
    // Pattern-4   L 42
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int st = n; // star
        // for space we will use i = 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            st--;
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
