package arrays_L91_L102;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class sum_two_arrays {
    // Sum of two arrays   L100
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn  = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }

        int[] sum = new int[n1 > n2? n1: n2]; // ternary operator   condition ? if true vale: false value
        int c = 0;

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int d = c;

            if (i >= 0) {
                d += a1[i];
            }

            if (j >= 0) {
                d += a2[j];
            }

            c = d / 10;
            d = d % 10;

            sum[k] = d;
            i--;
            j--;
            k--;
        }

        if (c != 0) {
            System.out.print(c);
        }

        for (int val: sum) {  // iterates over sum array, matlab array ki values
            System.out.print(val);
        }
    }
}
/* 
Input:
3
9
9
9
1
1
Output:
1000
 */
