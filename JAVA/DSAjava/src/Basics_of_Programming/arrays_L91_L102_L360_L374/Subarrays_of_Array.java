package Basics_of_Programming.arrays_L91_L102_L360_L374;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class Subarrays_of_Array {
    // Subarrays of an Array   L 367
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
/* 
Sample Input
3
10
20
30
Sample Output
10
10 20
10 20 30
20
20 30
30
 */
