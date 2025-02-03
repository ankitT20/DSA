package Basics_of_Programming.TwoD_Arrays_L342_L359;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class Rotate_90_degree {
    // Rotate by 90 degree   L 351
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();

        // Transpose
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse
        for(int i = 0; i < arr.length; i++){
            int li = 0;
            int ri = arr[i].length - 1;

            while(li < ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }

        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/* 
Rotate By 90 Degree
1. You are given a number n, representing the number of rows and number of columns.
2. You are given n*n numbers, representing elements of 2d array a.
3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
*Note - you are required to do it in-place i.e. no extra space should be used to achieve it .*

Input Format
A number n
e11
e12..
e21
e22..
.. n * n number of elements
Output Format
output is taken care of by display function

Constraints
1 <= n <= 10^2
-10^9 <= e1, e2, .. n * n elements <= 10^9

Sample Input
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44
Sample Output
41 31 21 11
42 32 22 12
43 33 23 13
44 34 24 14
 */
