package Basics_of_Programming.functions_L75_L90;

import java.util.*;

public class decimal_any_base {
    // Decimal to any Base   L 80
    public static void main(String[] args) {
        // [634](base10) = [1172](base8)
        // divide by 8 (jisme jana hota hai), till zero, mul first remainder by 10^0, second by 10^1, 10^2 ... 
        // 6*10^2 + 3*10^1 + 4*10^0 = 1*8^3 + 1*8^2 + 7*8^1 + 2*8^0
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        int rv = 0;

        int p = 1;
        while (n > 0) {
            int dig = n % b;
            n = n / b;

            rv += dig * p;
            p = p * 10;
        }
        return rv;
    }
}
/* 
Input:
63
8
Output:
77
 */
