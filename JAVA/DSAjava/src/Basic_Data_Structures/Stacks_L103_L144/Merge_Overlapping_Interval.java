package Basic_Data_Structures.Stacks_L103_L144;
import java.io.*;
// import java.lang.reflect.Array;
import java.util.*;

public class Merge_Overlapping_Interval {
    // Merge Overlapping Interval   L 128
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        Pair[] pairs = new Pair[arr.length];
        for (int i = 0; i < arr.length; i++) {
            pairs[i] = new Pair(arr[i][0], arr[i][1]);
        }

        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();
        for (int i = 0; i < pairs.length; i++) {
            if (i == 0) {
                st.push(pairs[i]);
            } else {
                Pair top = st.peek();

                if (pairs[i].st > top.et) {
                    st.push(pairs[i]);
                } else {
                    top.et = Math.max(top.et, pairs[i].et);
                }
            }
        }

        Stack<Pair> rs = new Stack<>();
        while (st.size() > 0) {
            rs.push(st.pop());
        }

        while (rs.size() > 0) {
            Pair p = rs.pop();
            System.out.println(p.st + " " + p.et);
        }
    }

    public static class Pair implements Comparable<Pair> {
        int st;
        int et;

        Pair(int st, int et) {
            this.st = st;
            this.et = et;
        }
        
        // this > other return +ve
        // this = other return 0
        // this < other return -ve
        public int compareTo(Pair other){
            if (this.st != other.st) {
                return this.st - other.st;
            } else {
                return this.et - other.et;
            }
        }
    }
}
/* 
Merge Overlapping Interval
1. You are given a number n, representing the number of time-intervals.
2. In the next n lines, you are given a pair of space separated numbers.
3. The pair of numbers represent the start time and end time of a meeting (first number is start time and second number is end time)
4. You are required to merge the meetings and print the merged meetings output in increasing order of start time.

E.g. Let us say there are 6 meetings
1 8
5 12
14 19
22 28
25 27
27 30

Then the output of merged meetings will belongs
1 12
14 19
22 30
Note -> The given input maynot be sorted by start-time.

Input Format
Input is managed for you 
Output Format
Print a merged meeting start time and end time separated by a space in a line
.. print all merged meetings one in each line.

Constraints
1 <= n <= 10^4
0 <= ith start time < 100
ith start time < ith end time <= 100

Sample Input
6
22 28
1 8
25 27
14 19
27 30
5 12
Sample Output
1 12
14 19
22 30
 */
