package Basic_Data_Structures.Stacks_L103_L144;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class duplicate_brackets {
    // Duplicate Brackets   L104
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (st.peek() == '(') {
                    System.out.println(true);
                    return;
                } else {
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }

        System.out.println(false);

    }
}
/* 
Input:
((a+b)+(c+d))
Output:
false

Input:
(a+b)+((c+d))
Output:
true
 */
