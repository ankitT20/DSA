package Stacks_L103_L144;
import java.io.*;
import java.util.*;

public class intro_stacks {
    // Introduction to Stacks and its usage   L 103
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        System.out.println(st);
        st.push(30);
        System.out.println(st);
        st.push(40);
        System.out.println(st);
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.pop();

        // 
    }
}
/* 
Input:
Output:

 */
