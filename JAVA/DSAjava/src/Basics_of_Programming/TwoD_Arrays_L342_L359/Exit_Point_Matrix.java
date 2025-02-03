package Basics_of_Programming.TwoD_Arrays_L342_L359;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class Exit_Point_Matrix {
    // Exit Point of a Matrix L 349
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int dir = 0;  // 0 -> east, 1 -> south, 2 -> west, 3 -> north
        int i = 0;
        int j = 0;

        while (true) {
            dir = (dir + arr[i][j]) % 4;
            if (dir == 0) {  // east
                j++;
            } else if (dir == 1) {  // south
                i++;
            } else if (dir == 2) {  // west
                j--;
            } else if (dir == 3) {  // north
                i--;
            }

            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == arr.length) {
                i--;
                break;
            } else if (j == arr[0].length) {
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);

    }
}
/*
Exit Point Of A Matrix
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers (1's and 0's), representing elements of 2d array
a.
4. Consider this array a maze and a player enters from top-left corner in
east direction.
5. The player moves in the same direction as long as he meets '0'. On seeing
a 1, he takes a 90 deg right turn.
6. You are required to print the indices in (row, col) format of the point
from where you exit the matrix.

Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements
Output Format
row
col (of the point of exit)

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
e1, e2, .. n * m elements belongs to the set (0, 1)

Sample Input
4
4
0
0
1
0
1
0
0
0
0
0
0
0
1
0
1
0
Sample Output
1
3
 */
