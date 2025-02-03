package Basics_of_Programming.TwoD_Arrays_L342_L359;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class Spiral_Traversal {
    // Spiral Traversal   L 347
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();

        int minr = 0;  // min row
        int minc = 0;  // min column
        int maxr = n - 1;  // max row
        int maxc = m - 1;  // max column
        int tne = n * m;  // total number of elements
        int cnt = 0;  // count
        
        while(cnt < tne){
            // left wall
            for(int i = minr, j = minc; i <= maxr && cnt < tne; i++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;

            // bottom wall
            for(int i = maxr, j = minc; j <= maxc && cnt < tne; j++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;

            // right wall
            for(int i = maxr, j = maxc; i >= minr && cnt < tne; i--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;

            // top wall
            for(int i = minr, j = maxc; j >= minc && cnt < tne; j--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;
        }
    }
}
/* 
Spiral Display
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.
Note - Please check the sample output for details.

Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements
Output Format
e11
e21
..
en1
en2
en3
..
enm
e(n-1)m
..
e1m
e1(m-1)
..
e12
e22
e32
..

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e1, e2, .. n * m elements <= 10^9

Sample Input
3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35
Sample Output
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24
 */
