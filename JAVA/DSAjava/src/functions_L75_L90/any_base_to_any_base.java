package functions_L75_L90;

import java.util.*;

public class any_base_to_any_base {
    // Any base to any base   L 84
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int d = getValue(n, b1, b2);
        System.out.println(d);
    }

    // public static int getValue(int n, int b1, int b2){
    //     int rv = 0;

    //     int p = 1;
    //     while (n > 0) {
    //         int dig = n % 10;
    //         n = n / 10;

    //         rv += dig * p;
    //         p = p * b1;
    //     }

    //     if (b2 != 10) {
    //         p = 1;
    //         int rvn = 0;
    //         while (rv > 0) {
    //             int dig = rv % b2;
    //             rv = rv / b2;

    //             rvn += dig * p;
    //             p = p * 10;
    //         }
    //         rv = rvn;
    //     }

    //     return rv;
    // }

    public static int getValue(int n, int b1, int b2){
        int dec = anyBaseToDecimal(n, b1);
        int dn = decimalToAnyBase(dec, b2);
        return dn;
    }
    // Modularity = reuse old code

    public static int anyBaseToDecimal(int n, int b){
        int rv = 0;

        int p = 1;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;

            rv += dig * p;
            p = p * b;
        }
        
        return rv;
    }

    public static int decimalToAnyBase(int n, int b){
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
172
8
2
Output:
1111010
 */
