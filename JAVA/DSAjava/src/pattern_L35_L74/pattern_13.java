package pattern_L35_L74;

import java.util.*;

public class pattern_13 {
    // Pattern-13   L 60  triangle + combination
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {  // iCj 0C0 1C0 1C1 2C0 2C1 2C3 3C0 3C1 3C2 3C3 3C4 ...
            int icj = 1;
            for (int j = 0; j <= i; j++) {  // run loop i+1 times
                System.out.print(icj + "\t");
                int icjp1 = icj * (i -j) / (j + 1); // icj + 1
                icj = icjp1;
            }
            System.out.println();
        }
    }
}
// Formula: n^C^k+1 = n^C^k*(n-k) / k+1
/* 
Input:
6
Output:
1
1       1
1       2       1
1       3       3       1
1       4       6       4       1
1       5       10      10      5       1
*/
