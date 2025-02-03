package Basics_of_Programming.basics_L1_L34;

import java.util.*;

public class first {
    public static void main(String[] args) {
        System.out.print("My First Program!\n");
        System.out.println("My First Program!");
        System.out.println("*\n**\n***\n****\n*****");
        System.out.println("*****\n   *\n  *\n *\n*****");

        int x = 15;
        int y = 10;
        int sum = x + y;
        System.out.println("Sum of " + x + " and " + y + " is " + sum);
        int prd = x * y;
        System.out.println("Product of " + x + " and " + y + " is " + prd);
        // x/y, y/x, x%y
        int v1 = x/y;
        int v2 = y/x;
        int v3 = x%y;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        // exp
        int exp = (x * y) / (x + y);
        System.out.println(exp);

        if (x % 2 == 0) {
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }

        int n1 = 10;
        int n2 = 20;

        if (n1 == n2) {
            System.out.println(n1 + " is equal to " + n2);
        } else {
          if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
          } else {
            System.out.println(n1 + " is smaller than " + n2);
          }  
        }
/* 
        // input
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();

        if (marks > 90) {
            System.out.println("excellent");
        } else if (marks > 80) {
            System.out.println("good");
        } else if (marks > 70) {
            System.out.println("fair");
        } else if (marks > 60) {
            System.out.println("meets expectations");
        } else {
            System.out.println("below par");
        }
 */
/* 
        int i = 1;
        while (i <= 9) {
            System.out.println(i);
            i++;
        }
 */
/* 
        for (int i =1; i <= 9; i++) {
            System.out.println(i);
        }
        System.out.println("Done.");
 */
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();
        
        System.out.println("Dear " + name + ". Here is the counting ");
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

    }
}
// https://www.youtube.com/watch?v=F8xQ5joLlD0&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=1
