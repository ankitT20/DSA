package functions_L75_L90;

import java.util.Scanner;

public class any_base_addition {
    // Any base addition   L 86
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int d = getValue(n, b1, b2);
        System.out.println(d);
    }
}
