package Basics_of_Programming.functions_L75_L90;

import java.util.*;

public class any_base_to_decimal {
    // Any base to decimal   L 82
    public static void main(String[] args) {
        // [1172](base8) = [634](base10)
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b){
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
}
// What? How? Code? Why?
/* 
Input:
1172
8
Output:
634
 */
