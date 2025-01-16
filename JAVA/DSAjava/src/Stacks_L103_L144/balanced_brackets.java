package Stacks_L103_L144;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class balanced_brackets {
    // Balanced Brackets   L107
    public static void main(String[] args) {
        @SuppressWarnings("resource")
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
            } else if (ch == ']') {
                boolean val = handleClosing(st, '[');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else {
                
            }
        }
        if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean handleClosing(Stack<Character> st, char corresponding_open_ch) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != corresponding_open_ch) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}
/* 
Input:
[(a + b) + {(c + d) * (e / f)}]
Output:
true
*/
/*
Input:
[(a + b) + {(c + d) * (e/f)]}
Output:
false
*/
