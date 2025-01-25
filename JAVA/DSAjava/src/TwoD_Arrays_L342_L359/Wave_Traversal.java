package TwoD_Arrays_L342_L359;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class Wave_Traversal {
    // Wave Traversal   L 345
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();

        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i][j]);
                }
            } else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
/* 
Wave Traversal
Question
L You are given a number n. representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a wave • down the first column then up the second column and so on.
Note — check the output for details

Input Format
A number n
A number m
e11
e12
e21
e22
.. n * m number of elements

Output Format
e11
e12
...

Input:
2
3
11
12
13
21
22
23
Output:
11
21
22
12
13
23
 */
