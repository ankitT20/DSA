package TwoD_Arrays_L342_L359;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class Shell_Rotate {
    // Shell Rotate   L 353
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
        
        int s = scn.nextInt();
        int r = scn.nextInt();
        scn.close();

        rotateShell(arr, s, r);
        display(arr);
    }

    public static void rotateShell(int[][] arr, int s, int r){
        int[] oned = fillOnedFromShell(arr, s);
        rotate(oned, r);
        fillShellFromOned(arr, s, oned);
    }

    public static int[] fillOnedFromShell(int[][] arr, int s){
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        int sz = 2 * (maxr - minr + maxc - minc);
        int[] oned = new int[sz];
        int idx = 0;

        // left wall
        for(int i = minr; i <= maxr; i++){
            oned[idx] = arr[i][minc];
            idx++;
        }
        minc++;

        // bottom wall
        for(int i = minc; i <= maxc; i++){
            oned[idx] = arr[maxr][i];
            idx++;
        }
        maxr--;

        // right wall
        for(int i = maxr; i >= minr; i--){
            oned[idx] = arr[i][maxc];
            idx++;
        }
        maxc--;

        // top wall
        for(int i = maxc; i >= minc; i--){
            oned[idx] = arr[minr][i];
            idx++;
        }
        minr++;

        return oned;
    }

    public static void fillShellFromOned(int[][] arr, int s, int[] oned){
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        int idx = 0;

        // left wall
        for(int i = minr; i <= maxr; i++){
            arr[i][minc] = oned[idx];
            idx++;
        }
        minc++;

        // bottom wall
        for(int i = minc; i <= maxc; i++){
            arr[maxr][i] = oned[idx];
            idx++;
        }
        maxr--;

        // right wall
        for(int i = maxr; i >= minr; i--){
            arr[i][maxc] = oned[idx];
            idx++;
        }
        maxc--;

        // top wall
        for(int i = maxc; i >= minc; i--){
            arr[minr][i] = oned[idx];
            idx++;
        }
        minr++;
    }

    public static void rotate(int[] oned, int r){
        r = r % oned.length;
        if(r < 0){
            r += oned.length;
        }

        reverse(oned, 0, oned.length - r - 1);
        reverse(oned, oned.length - r, oned.length - 1);
        reverse(oned, 0, oned.length - 1);
    }

    public static void reverse(int[] oned, int left, int right){
        while(left < right){
            int temp = oned[left];
            oned[left] = oned[right];
            oned[right] = temp;

            left++;
            right--;
        }
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
Ring Rotate
You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.

shell-rotate

You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.

Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements of array a
A number s
A number r
Output Format
output is handled by display function

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
0 < s <= min(n, m) / 2
-10^9 <= r <= 10^9

Sample Input
5
7
11
12
13
14
15
16
17
21
22
23
24
25
26
27
31
32
33
34
35
36
37
41
42
43
44
45
46
47
51
52
53
54
55
56
57
2
3
Sample Output
11 12 13 14 15 16 17
21 25 26 36 46 45 27
31 24 33 34 35 44 37
41 23 22 32 42 43 47
51 52 53 54 55 56 57
 */
