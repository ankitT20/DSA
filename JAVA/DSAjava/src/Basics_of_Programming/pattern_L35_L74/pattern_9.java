package Basics_of_Programming.pattern_L35_L74;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class pattern_9 {
    // Pattern-9   L 52
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
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
        *               *
                *
        *               *
*                               *
 */
