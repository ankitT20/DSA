package Recursion_and_Backtracking.Introduction_to_Recursion_L375_L385;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class Introduction_to_Recursion {
    // Introduction to Recursion   L 375
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        printDecreasing(n);
    }
    public static void printDecreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasing(n - 1);
    }
}
