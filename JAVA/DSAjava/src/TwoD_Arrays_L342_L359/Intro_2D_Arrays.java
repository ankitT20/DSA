package TwoD_Arrays_L342_L359;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class Intro_2D_Arrays {
    // Introduction to 2-D Arrays   L 342
    public static void main(String[] args) throws Exception {
        System.out.println("2d Arrays Demo");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
/* 
2d Arrays Demo
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to display the contents of 2d array as suggested by output format below.

Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements
Output Format
e11 e12 e13 ..
e21 e22 e23 ..

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e1, e2, .. n * m elements <= 10^9

Sample Input
2
4
11
12
13
14
21
22
23
24
Sample Output
11 12 13 14
21 22 23 24
 */
