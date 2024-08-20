package functions_L75_L90;

import java.util.*;

public class digits_frequency {
    // Digits Frequency   L 77
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int rv = 0;

        while (n > 0) {
            int dig = n % 10;
            n = n / 10;

            if (dig == d) {
                rv++;
            }
        }

        return rv;
    }
}
/* 
Input:
125201      
1
Output:
2
 */
