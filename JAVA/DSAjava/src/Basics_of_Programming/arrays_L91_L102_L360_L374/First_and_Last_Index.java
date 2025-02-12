package Basics_of_Programming.arrays_L91_L102_L360_L374;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class First_and_Last_Index {
    // First and Last Index   L 374
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();
        scn.close();

        int low = 0;
        int high = arr.length - 1;
        int firstIndex = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (data > arr[mid]) {
                low = mid + 1;
            } else if (data < arr[mid]) {
                high = mid - 1;
            } else {
                firstIndex = mid;
                high = mid - 1;
            }
        }

        System.out.println(firstIndex);

        low = 0;
        high = arr.length - 1;
        int lastIndex = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (data > arr[mid]) {
                low = mid + 1;
            } else if (data < arr[mid]) {
                high = mid - 1;
            } else {
                lastIndex = mid;
                low = mid + 1;
            }
        }

        System.out.println(lastIndex);
    }
}
/* 

Input Format
A number n
n1
n2
.. n number of elements
A number d
Output Format
A number representing first index
A number representing last index

Sample Input 
15 
1 
5 
10 
15 
22 
33 
33 
33 
33 
33 
40 
42 
55 
66 
77 
33 
Sample Output 
5 
9
 */
