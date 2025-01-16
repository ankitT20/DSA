package pattern_L35_L74;

import java.util.*;

public class pattern_10 {
    // Pattern-10   L 54  hollow diamond
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int os = n / 2;  // inner space
        int is = -1;  // inner space

        for (int i = 1; i <= n; i++) {
            // System.out.println(os + "," + is);
            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");

            for (int j = 1; j <= is; j++) {
                System.out.print("\t");
            }

            if (i > 1 && i < n) {  // no * for 1st and last row
                System.out.print("*\t");
            }
            
            if (i <= n / 2) {
                os--;
                is += 2;
            } else {
                os++;
                is -= 2;
            }

            System.out.println();
        }
    }
}
/*
Input:
5
Output:
                *
        *               *
*                               *
        *               *
                *
*/
