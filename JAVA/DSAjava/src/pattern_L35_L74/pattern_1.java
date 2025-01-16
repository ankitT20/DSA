package pattern_L35_L74;

import java.util.*;

public class pattern_1 {
    // Pattern-1  L 36
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
// Abstraction is layering 
// input dekr, output pr vishwas rakhna
// layers me kaam krte hai, bhar wala loop, andar wale loop pr trust krta hai, ki andar wala loop apna kaam krega, esse hum bade bade program kr lete hai
/* 
Input:
5
Output:
*
*       *
*       *       *
*       *       *       *
*       *       *       *       *
 */
// https://www.youtube.com/watch?v=3OUOKD-wj0Q&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=35
