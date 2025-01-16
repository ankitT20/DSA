package basics_L1_L34;

import java.util.*;

public class count_digits_in_number {
    // 987667 = 6
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int dig = 0;
        while (n != 0) {
            n = n / 10;
            dig++;
        }

        System.out.println(dig);
    }
}
