package Stacks_L103_L144;
import java.io.*;
import java.util.*;

public class Infix_Conversions {
    // Infix Conversions   L 120
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
    
        // code
    }
}
/* 
Input:
a*(b-c+d)/e
Output:
abc-d+*e/
/*a+-bcde
 */

/* 
1. You are given an infix expression.
2. You are required to convert it to postfix and print it.
3. You are required to convert it to prefix and print it.

Constraints
1. Expression is balanced
2. The only operators used are +, -, *, /
3. Opening and closing brackets - () - are used to impact precedence of operations
4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
5. In two operators of equal precedence give preference to the one on left.
6. All operands are single digit numbers.
 */
