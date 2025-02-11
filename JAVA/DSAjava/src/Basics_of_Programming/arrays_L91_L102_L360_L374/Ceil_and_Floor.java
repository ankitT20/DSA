package Basics_of_Programming.arrays_L91_L102_L360_L374;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class Ceil_and_Floor {
    // Ceil and Floor   L 372
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();
        scn.close();

        int lo = 0;
        int hi = arr.length - 1;
        int ceil = 0;
        int floor = 0;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data < arr[mid]) {
                hi = mid - 1;
                ceil = arr[mid];
            } else if (data > arr[mid]) {
                lo = mid + 1;
                floor = arr[mid];
            } else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }
}
/* 
Ceil And Floor
Question
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are given another number d.
a. You are required find the ceil and floor of d in the array a.
Ceil is defined as value in array which is just greater than d. If an element equal to d exists that will be
considered as ceil.
Floor is defined as value in array which is just lesser than d. If an element equal to d exists that will be
constaered as floor.
Asssumption - Altay is sorted

Input format
A number n
n1
n2
.. n number of elements
A number d
Output Format
A number representing ceil
A number representing floor


Sample input
10
1
5
10
15
22
33
40
42
55
66
34
Output:
40
33
 */
