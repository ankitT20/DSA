package Stacks_L103_L144;
import java.io.*;
import java.util.*;

public class intro_stacks {
    // Introduction to Stacks and its usage   L 103
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(); // Dynamic
        // add = push, get = peek, remove = pop
        st.push(10);
        st.push(20);
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.push(30);
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.push(40);
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + "->" + " " + " " + st.size());



         
        /* 
        ArrayList<Integer> list = new ArrayList<>(); // Dynamic (no fixed length)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list + "->" + list.size());
        // for(int val: list) {
        //     System.out.println(val);
        // }
        for(int i = 0; i < list.size(); i++) {
            int val = list.get(i);
            System.out.println(val);
        }
        
        list.set(2, 300);  // change vale at index
        System.out.println(list + "->" + list.size());
        list.add(2, 3000);  // add value between list
        System.out.println(list + "->" + list.size());
         */
    }
}
/* 
Input:
Output:

 */
