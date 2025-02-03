package Basics_of_Programming.functions_L75_L90;

import java.util.*;

public class any_base_addition {
    // Any base addition   L 86
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {
        int rv = 0;

        // 236 + 754 (base 8), 6 + 4 is 10, 10 = 8*1 + 2
        // 10/8, quotient is 1, remainder is 2
        // 10 % 8 = 2
        // 10 / 8 = 1 (carry)

        // | 10 | 236 , 754 |     (divide by 10)
        // | 10 | 26_6, 75_4|     (quotient_remainder) (add both remainder 6+4 = 10) as (10/8) (Q=1 carry, R=2) R*10^0
        // | 10 | 2_3 , 7_5 |     (3+5+1carry = 9) (9/8)(Q=1, R=1)                         R*10^1 (mul remainder by 10^1)
        // | 10 | 0_2 , 0_7 |     (2+7+1carry = 10) (10/8)(Q=1, R =2)                      R*10^2
        // |    | 0_0 , 0_0 |     (0+0+1carry = 1) (1/8)(Q=0, R =1) (run till Q = 0)       R*10^3 (add all to get on places _ _ _ _ 1212)
        
        int c = 0;
        int p = 1;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = d1 + d2 + c;
            c = d / b;
            d = d % b;

            rv += d * p;
            p = p* 10;
        }
        
        return rv;
    }
}
/* 
Input:
8
236
754
Output:
1212
 */
