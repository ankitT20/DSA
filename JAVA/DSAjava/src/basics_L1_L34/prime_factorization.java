package basics_L1_L34;

import java.util.*;

public class prime_factorization {
    // Prime Factorization L 29
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int div = 2; div * div < n; div++) {  // increases 2 when remainder is not zero..... 3...
            while (n % div == 0) { // divide by 2 ...... till remainder is zero
                n = n / div;
                System.out.print(div + " ");
            }
        }

        // for example 46 , 46 / 2 = 23 , now n = 23
        // div 4 <n, 9 <n, 16 <n, 25 <n FOR LOOP TERMINATES , so 23 was skipped because 23 squareroot is 4.796
        if (n != 1) {  // If n is not 1, n is the only prime factor left
            System.out.print(n);
        } 
    }
}
// Property: If p * q = n , then Both p and q , cannot be together greater than root n
// CANNOT be: p > (root n) && q > (root n)
// div < root n , can be written in code as div * div <= n (squared both side)
//{\displaystyle {\sqrt {n}},}
