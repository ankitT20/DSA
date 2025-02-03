package Basic_Data_Structures.Stacks_L103_L144;
import java.io.*;
import java.util.*;

public class Sliding_Window_Maximum {
    // Sliding Window Maximum   L 116
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
           arr[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());
    
        // code
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];

        st.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0; i--) {
            // -a+
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                nge[i] = arr.length;
            } else {
                nge[i] = st.peek();
            }

            st.push(i);
        }

        int j = 0;
        for (int i = 0; i < arr.length - k; i++) {
            // enter the loop to find tge maximum of window starting at i
            if (j < i) {
                j = i;
            }

            while (nge[j] < i + k) {
                j = nge[j];
            }

            System.out.println(arr[j]);
        }
    }
}
/* 
Input:
17
2
9
3
8
1
7
12
6
14
4
32
0
7
19
8
12
6
4
Output:
9
9
8
12
12
14
14
32
32
32
32
19
19
19
 */

/* 
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the elements of array a.
3. You are given a number k, representing the size of window.
4. You are required to find and print the maximum element in every window of size k.

e.g.
for the array [2 9 3 8 1 7 12 6 14 4 32 0 7 19 8 12 6] and k = 4, the answer is [9 9 8 12 12 14 14 32 32 32 32 19 19 19]

0 <= n < 100000
-10^9 <= a[i] <= 10^9
0 < k < n
 */
