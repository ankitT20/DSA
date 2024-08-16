package pattern;

import java.util.*;

public class pattern_10 {
    // Pattern-10   L 54
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int os = n / 2;
        int is = -1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }
            System.out.println("*\t");

            for (int j = 1; j <= is; j++) {
                System.out.print("\t");
            }

            if (i > 1 && i < n) {
                System.out.print("*\t");
            }
        }
    }
}
