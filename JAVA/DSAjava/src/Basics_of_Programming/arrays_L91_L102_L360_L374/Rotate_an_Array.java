package Basics_of_Programming.arrays_L91_L102_L360_L374;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class Rotate_an_Array {
    // Rotate an Array   L 363
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a, int i, int j) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] a, int k) {
        k = k % a.length;
        if (k < 0) {
            k += a.length;
        }

        // part 1
        reverse(a, 0, a.length - k - 1);
        // part 2
        reverse(a, a.length - k, a.length - 1);
        // whole array
        reverse(a, 0, a.length - 1);
    }
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }
}
/* 
Rotate An Array
Question
I. You are given a number n, representing the size of array a.
YOU n representing elements array a.
3. You are given number k.
4. Rotate the array a, k times to the right (for positive values of k), anci to
the ieft for negative values ot k.

Input:
5
1
2
3
4
5
1
Output:
5 1 2 3 4 
 */
