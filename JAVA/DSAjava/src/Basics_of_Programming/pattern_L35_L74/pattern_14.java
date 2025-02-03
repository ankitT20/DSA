package Basics_of_Programming.pattern_L35_L74;

import java.util.*;

public class pattern_14 {
    // Pattern-14   L 62  Table
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
            // int v = x * i;
            // System.out.println(x + " * " + i + " = " + v);
        }
    }
}
/* 
Input:
5
Output:
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
*/
