package TwoD_Arrays_L342_L359;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class Diagonal_Traversal {
    // Diagonal Traversal   L 355
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();

        for(int g = 0; g < arr.length; g++){
            for(int i = 0, j = g; j < arr.length; i++, j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
/* 
Diagonal Traversal
1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n n numbers, representing elements ot 2d array a.
3. You are required to diagonally traverse the upper half of the matrix and print the contents.

Input:
2
11 12
21 22
Output:
11
22
12
 */
