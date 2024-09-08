package arrays_L91_L102;
import java.io.*;
import java.util.*;

public class arrays_memory {
    // Arrays - Memory   L92
    public static void swap(int[] arr, int i, int j) {
        // 4k, i=0, j=4
        int temp = arr[i]; // 4k + 0(4) = 4k,   temp me 33 copy krdi
        arr[i] = arr[j];  // 4k[0] me 4k[4] daal do, 4k16 ki value copy krdi 4k me
        arr[j] = temp;  // 4k16 me 33 copy krdo
    }

    public static void main(String[] args) {
        // Stack , Heap concept
        int[] arr; // {IN STACK} create arr variable , with null value/pointer
        arr = new int[5]; // {IN HEAP} create/reserve 5 integer space
        // The value of starting (first arr[0]) will be stored in arr variable
        //  so it points to eg. 4k memory address, arr points to 4k memory address
        // 4k+(0 worth of int), integer is of 4 bytes

        // #1. Implications on performance
        arr[0] = 33; // 4k + 0(int4)
        arr[1] = 47; // 4k + 1(int4) = 4k4
        arr[2] = 59; // 4k + 2(4) = 4k8
        arr[3] = 67; // 4k + 3(4) = 4k12
        arr[4] = 98; // 4k + 4(4) = 4k16
        // also in java, same time will be required to access/store arr[5] or arr[4000]
        // beacuse arr is just an address, arr[4000] java is given address 4k + 4000(4) = 4k + 16k = 20k

        // #2. Implications on Assignment
        int[] two = arr;  // two points towards 4k memory address (of arr)
        // shallow copy, stack se sirf address copy hogaya, two aur arr dono same array ko point krte hai
        // Deep copy me pura array copy hota hai
        two[2] = 590; // 4k + 2(4) = 4k8

        // #3. Implications on functions
        swap(arr, 0, 4);
        // shallow copy arr (matlab bs address pass hota hai)

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
/* 
Input:
Output:
98
47
590
67
33
 */
