package Basic_Data_Structures.Generic_Tree_L214_L310;

import java.io.*;
import java.util.*;

public class Ceil_and_Floor {
    // Ceil And Floor In Generic Tree L 295

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    static int ceil;
    static int floor;

    public static void ceilAndFloor(Node node, int data) {
        // Write your code here
        // ceil = smallest among larger , just larger
        // floor = largest among smaller , just smaller
        // travel and change strategy
        if (node.data > data) {
            if (node.data < ceil) {
                ceil = node.data;
            }
        }

        if (node.data < data) {
            if (node.data > floor) {
                floor = node.data;
            }
        }
        
        for (Node child : node.children) {
            ceilAndFloor(child, data);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        int data = Integer.parseInt(br.readLine());

        Node root = construct(arr);
        ceil = Integer.MAX_VALUE;  // smallest among larger
        floor = Integer.MIN_VALUE;  // largest among smaller
        ceilAndFloor(root, data);
        System.out.println("CEIL = " + ceil);
        System.out.println("FLOOR = " + floor);
    }

}
/* 
Ceil And Floor In Generic Tree
1. You are given a partially written GenericTree class.
2. You are required to find the ceil and floor value of a given element. Use the "travel and change" strategy explained in the earlier video. The static properties - ceil and floor have been declared for you. You can declare more if you want. If the element is largest ceil will be largest integer value (32 bits), if element is smallest floor will be smallest integer value (32 bits). Watch the question video for clarity.
3. Input and Output is managed for you.
Input Format
Input is managed for you
Output Format
Output is managed for you
Constraints
None

Sample Input
24
10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1
70
Sample Output
CEIL = 90
FLOOR = 60
 */
