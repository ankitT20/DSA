package basics_L1_L34;

import java.util.*;

public class benjamin_bulbs {
    // Benjamin Bulbs L 34
    public static void main(String[] args) {
        // print all perfect squares , 1sq, 2sq, 3sq, 4sq
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i * i < n; i++) {
            System.out.println(i * i);
        }
    }
}
