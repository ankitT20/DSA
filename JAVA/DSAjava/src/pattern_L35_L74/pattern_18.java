package pattern_L35_L74;

import java.util.*;

public class pattern_18 {
    // Pattern-18   L 70
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int st = n;  // star
        int sp = 0;  // space
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                if (i > 1 && i <= n / 2 && j > 1 && j < st) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            if (i <= n / 2) {
                sp++;
                st -= 2;
            } else {
                sp--;
                st += 2;
            }
            System.out.println();
        }
    }
}
// Solved fully without seeing solution
/* 
Input:
7
Output:
*       *       *       *       *       *       *
        *                               *
                *               *
                        *
                *       *       *
        *       *       *       *       *
*       *       *       *       *       *       *
*/
