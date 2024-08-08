import java.util.*;

public class is_prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();

            int count = 0;
            // for (int div = 1; div <= n; div++) {
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
                
            // if (count == 2) {
            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }


    }
}
