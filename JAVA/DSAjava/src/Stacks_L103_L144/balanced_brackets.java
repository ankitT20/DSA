package Stacks_L103_L144;
import java.io.*;
import java.util.*;


public class balanced_brackets {
    // Balanced Brackets   L107
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == '}') {
                boolean val = handleClosing(st, '{');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == '[') {
                boolean val = handleClosing(st, ']');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else {
                
            }
        }
    }
}
/* 
Input:
Output:

 */
