package pattern_L35_L74;

import java.util.*;

public class pattern_16 {
    // Pattern-16   L 66 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sp = 2 * n - 3;  // space
        int st = 1;  // star
        for (int i = 1; i <= n; i++) {
            int val = 1;
            for (int j = 1; j <= st; j++) {
                System.out.print(val + "\t");
                val++;
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            if (i == n) {
                st--;
                val--;
            }
            for (int j = 1; j <= st; j++) {
                // if (i == n && j == st) {
                //     break;
                // }
                // if (val == 4) {
                //     val--;
                // }
                val--;
                System.out.print(val + "\t");
            }
            // System.out.println(st + "," + sp + "," + st);  // This is how we do DRY RUN
            st++;
            sp -= 2;
            System.out.println();

        }
    }
}
// Solved without seeing solution
/* 
Input:
4
Output:
1                                               1
1       2                               2       1
1       2       3               3       2       1
1       2       3       4       3       2       1
*/
