package Basics_of_Programming.pattern_L35_L74;

import java.util.*;

public class pattern_19 {
    // Pattern-19   L 72
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) {
                    if (j == n || j <= n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (i <= n / 2){
                    if (j == n || j == n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (i == n / 2 + 1){
                    System.out.print("*\t");
                } else if (i < n){
                // } else if (i > n / 2 + 1 && i != n){
                // } else if (i == n){
                    if (j == 1 || j == n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    if (j == 1 || j >= n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
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
*       *       *               *
                *               *
*       *       *       *       *
*               *
*               *       *       *
 */
