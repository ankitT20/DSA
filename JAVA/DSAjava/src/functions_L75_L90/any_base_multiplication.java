package functions_L75_L90;

import java.util.*;

public class any_base_multiplication {
    // Any base multiplication   L90
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        int rv = 0;

        int p = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;

            int sprd = getProductWithSingleDigit(b, n1, d2);
            rv = getSum(b, rv, sprd * p);
            p = p * 10;
        }

        return rv;
    }

    public static int getProductWithSingleDigit(int b, int n1, int d2) {
        int rv = 0;

        int c = 0;
        int p = 1;
        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;

            int d = d1 * d2 + c;

            c = d / b;
            d = d % b;

            rv = rv + d * p;
            p = p * 10;

        }

        return rv;
    }

    public static int getSum(int b, int n1, int n2) {
        int rv = 0;

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
2156
74
Output:
204710
 */
