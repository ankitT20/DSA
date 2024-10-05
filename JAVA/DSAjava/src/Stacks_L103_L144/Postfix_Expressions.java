package Stacks_L103_L144;
import java.io.*;
import java.util.*;

public class Postfix_Expressions {
    // Postfix Evaluations and Conversions | Postfix Expressions   L 122
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
    
        // code
        
    }
}
/* 
Input:
264*8/+3-
Output:
2
((2+((6*4)/8))-3)
-+2/*6483
 */

/* 
1. You are given a postfix expression.
2. You are required to evaluate it and print it's value.
3. You are required to convert it to infix and print it.
4. You are required to convert it to prefix and print it.

Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.
Input Format
Input is managed for you
Output Format
value, a number
infix
prefix

Constraints
1. Expression is a valid postfix expression
2. The only operators used are +, -, *, /
3. All operands are single digit numbers.
 */
