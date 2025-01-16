package pattern_L35_L74;

import java.util.*;

public class pattern_7 {
    // Pattern-7   L 48 diagonal \
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("\t");
        //     }
        //     System.out.print("*\n");

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                    // System.out.print("#\t");  // run this to see difference
                }  // it prints a perfect square of spaces
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
        *
                *
                        *
                                *
 */
