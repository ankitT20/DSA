package Basics_of_Programming.pattern_L35_L74;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class pattern_8 {
    // Pattern-8   L 50  diagonal /
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // // int sp = n - 1;
        // for (int i = 0; i < n; i++) {
        //     // for (int j = 0; j < sp; j++) {
        //     //     System.out.print("\t");
        //     // }
        //     // System.out.print("*\n");
        //     // sp--;

        //     //  for printing square of spaces
        //     for (int j = 0; j < n; j++) {
        //         if ((i + j) == (n - 1)) {  // (i + j == n + 1) if used i = 1 and <= in for loop
        //             System.out.print("*\t");
        //         } else {
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == n + 1) {
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
                                *
                        *
                *
        *
*
 */
