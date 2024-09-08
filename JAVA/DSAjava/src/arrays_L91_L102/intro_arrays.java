package arrays_L91_L102;
import java.io.*;
import java.util.*;

public class intro_arrays {
    // Introduction to Arrays   L91
    public static void main(String[] args) {
        int[] arr; // Declare array
        arr = new int[5]; // Size of array is 5

        int[] arr1 = new int[5]; // combine above 2 lines
        // declaration and assignment can be joined

        arr[0] = 33;
        arr[1] = 47;
        arr[2] = 59;
        arr[3] = 67;
        arr[4] = 98;

        System.out.println(arr.length);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
/* 
Input:
Output:
5
33
47
59
67
98
 */
