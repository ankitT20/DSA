package Basics_of_Programming.arrays_L91_L102_L360_L374;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class Subsets_of_Array {
    // Subsets of an Array   L 369
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int limit = (int)Math.pow(2, arr.length);
        for(int i = 0; i < limit; i++) {
            String set = "";
            int temp = i;

            for(int j = arr.length - 1; j >= 0; j--) {
                int rem = temp % 2;
                temp = temp / 2;

                if(rem == 0) {
                    set = "-\t" + set;
                } else {
                    set = arr[j] + "\t" + set;
                }
            }

            System.out.println(set);
        }
    }
}
/* 
Input:
3
10
20
30
Output:
-       -       -
-       -       30
-       20      -
-       20      30
10      -       -
10      -       30
10      20      -
10      20      30
*/
