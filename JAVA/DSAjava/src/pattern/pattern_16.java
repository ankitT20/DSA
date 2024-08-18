package pattern;

import java.util.*;

public class pattern_16 {
    // Pattern-16   L 66 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int st = 1;
        int sp = 2 * n -3;
        for (int i = 1; i <= n; i++) {
            int val = 1;
            for (int j = 1; j <= st; j++) {
                System.out.print(val + "\t");
                val++;
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                if (i == n && j == st) {
                    break;
                }
                val--;
                if (val == 4) {
                    val--;
                }
                System.out.print(val + "\t");
            }
            System.out.println();
            st++;
            sp -= 2;

        }
    }
}
/* 
Input:
4
Output:

*/
