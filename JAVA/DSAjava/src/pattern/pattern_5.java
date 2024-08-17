package pattern;

import java.util.*;

public class pattern_5 {
    // Pattern-5   L 44  diamond
    // input will be odd
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // n/2 tk star badhe, phir ghate
        int sp = n / 2;  // spaces
        int st = 1;  // star
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i < n / 2) {  // use <= , if using i = 1 in for loop
                sp--;
                st += 2;                
            } else {
                sp++;
                st -= 2;
            }
        }
    }
}
/* 
Input:
5
Output:
                *
        *       *       *
*       *       *       *       *
        *       *       *
                *
 */
