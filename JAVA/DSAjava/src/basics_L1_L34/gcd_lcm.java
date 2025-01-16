package basics_L1_L34;

import java.util.*;

public class gcd_lcm {
    // GCD(hcf) and LCM L28
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int on1 = n1; // original n1
        int on2 = n2; // original n2

        while (n1 % n2 != 0) { // divide till remainder is zero
            int rem = n1 % n2;
            n1 = n2;  // after each division, divisor becomes divident (bhar wala _/-)
            n2 = rem;  // remainder becomes divisor ( _/- andar wala)
        }

        int gcd = n2; // last divident (bhar wala) which gives remainder zero
        int lcm = (on1 * on2) / gcd; // formula for lcm
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
