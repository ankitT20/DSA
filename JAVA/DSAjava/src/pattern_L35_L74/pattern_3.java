package pattern_L35_L74;

import java.util.*;

public class pattern_3 {
    // Pattern-3
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sp = n - 1; // space
        // int st = 1;  // star
        // for star we will use i = 1
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            sp--;
            // st++;
        }
    }
}
/* 
Input:
5
Output:
                                *
                        *       *
                *       *       *
        *       *       *       *
*       *       *       *       *
 */
