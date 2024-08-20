package functions_L75_L90;

import java.util.*;

public class intro_functions {
    // Introduction to Functions   L 75
    public static int f(int x) {
        int xsquare = x * x;
        return xsquare;
    }

    public static void display(int n, int r, int npr) {
        System.out.println(n + "P" + r + " = " + npr);
    }

    public static int fact(int x) {
        int rv = 1;
        for (int i = 1; i <= x; i++) {
            rv *= i;
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // calculate nPr
        int n = scn.nextInt();
        int r = scn.nextInt();

        // int nfact = 1;  // N factorial
        // for (int i = 1; i <= n; i++) {
        //     nfact *= i;
        // }
        
        // int nmrfact = 1;  // N - r factorial
        // for (int i = 1; i <= n - r; i++) {
        //     nmrfact *= i;
        // }

        int nfact = fact(n);
        int nmrfact = fact(n -r);
        int npr = nfact / nmrfact;
        display(n, r, npr);
        // System.out.println(n + "P" + r + " = " + npr);
    }
}
// DRY - DONT REPEAT YOURSELF
// Modularity, Maintainability, Memory
// https://www.youtube.com/watch?v=tXbgyBCLteM&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=75
/* 
Input:
5
2
Output:
5P2 = 20
 */
