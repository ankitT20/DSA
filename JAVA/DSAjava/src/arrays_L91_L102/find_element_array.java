package arrays_L91_L102;
import java.io.*;
import java.util.*;

public class find_element_array {
    // Find Element in Array   L96
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();

        int idx = -1; // index
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                // System.out.println(i);;
                idx = i;
                break;
            }
        }

        System.out.println(idx);
    }
}
/* 
Input:
5
1
2
8
5
3
8
Output:
2
 */
