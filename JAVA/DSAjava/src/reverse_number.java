import java.util.*;

public class reverse_number {
    // reverse a number L-20
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nod = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }

        // int div = (int)Math.pow(10, nod -1);
        while (n != 0) {
            int q = n % 10;
            System.out.println(q);

            n = n / 10;
            // div = div / 10;
        }
    }
}
