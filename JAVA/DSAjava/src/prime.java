import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int n = low; n <= high; n++) {
            System.out.println(n);
        }
    }
}
