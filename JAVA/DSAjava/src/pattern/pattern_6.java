package pattern;

import java.util.*;

public class pattern_6 {
    // Pattern-6   L  46
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int st = (n / 2) + 1;
        int sp = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i < n / 2) {
                st--;
                sp += 2;
            } else {
                st++;
                sp -= 2;
            }
        }
    }
}
/* 
Input:
5
Output:
*       *       *               *       *       *
*       *                               *       *
*                                               *
*       *                               *       *
*       *       *               *       *       *
 */
