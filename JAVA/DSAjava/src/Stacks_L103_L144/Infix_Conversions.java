package Stacks_L103_L144;
import java.io.*;
import java.util.*;

public class Infix_Conversions {
    // Infix Conversions   L 120
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        
        // infix - normal                       a+b         v1-op-v2
        // prefix - operends after operators    +ab         op-v1-v2
        // postfix - operators after operends    ab+         v1-v2-op
        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                ops.push(ch);
            } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                postfix.push(ch + "");
                prefix.push(ch + "");
            } else if (ch == ')') {
                while (ops.peek() != '(') {
                    process(ops, postfix, prefix);
                }

                ops.pop();  // popping the (
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (ops.size() > 0 && ops.peek() != '(' && precedence(ch) <= precedence(ops.peek())) {
                    process(ops, postfix, prefix);
                }

                ops.push(ch);  // pushing current operator
            }
        }

        while (ops.size() > 0) {
            process(ops, postfix, prefix);
        }

        System.out.println(postfix.pop());
        System.out.println(prefix.pop());
    }

    public static void process(Stack<Character> ops, Stack<String> postfix, Stack<String> prefix) {
        char op = ops.pop();
        
        String postv2 = postfix.pop();
        String postv1 = postfix.pop();
        String postv = postv1 + postv2 + op;
        postfix.push(postv);

        String prev2 = prefix.pop();
        String prev1 = prefix.pop();
        String prev = op + prev1 + prev2;
        prefix.push(prev);
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        } else {
            return 0;
        }
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
