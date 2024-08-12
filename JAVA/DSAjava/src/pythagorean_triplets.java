import java.util.*;

public class pythagorean_triplets {
    // Pythagorean Triplets L 32
    public static void main(String[] args) {
        // 3 inputs a,b,c -> can a right angle triangle be formed ?
        // perpendicular, base, hypotenuse -> P square + B square = H square
        // we dont know which is the hypotenuse (greatest side, sabse bade wala)
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int max = a;
        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }

        if (max == a) {
            boolean flag = ((b * b + c * c) == (a * a));
            System.out.println(flag);
        } else if (max == b) {
            boolean flag = ((a * a + c * c) == (b * b));
            System.out.println(flag);            
        } else {
            boolean flag = ((a * a + b * b) == (c * c));
            System.out.println(flag);            
        }
    }
}
