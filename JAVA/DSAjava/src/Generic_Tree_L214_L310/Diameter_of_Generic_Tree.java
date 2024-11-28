package Generic_Tree_L214_L310;

import java.io.*;
import java.util.*;

public class Diameter_of_Generic_Tree {
    // Diameter of Generic Tree L 305

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

    static int dia = 0;
    static int calculateDiaReturnHeight(Node node) {
        int dch = -1;
        int sdch = -1;

        for (Node child : node.children) {
            int ch = calculateDiaReturnHeight(child);
            if (ch > dch) {
                sdch = dch;
                dch = ch;
            } else if (ch > sdch) {
                sdch = ch;
            }
        }

        int cand = dch + sdch + 2;
        if (cand > dia) {
            dia = cand;
        }

        dch += 1;
        return dch;
    }
    

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        // write your code here
        // syso
        // diameter is defined as maximum number of edges between any two nodes in tree
        calculateDiaReturnHeight(root);
        System.out.println(dia);
    }

}
/* 
Diameter Of Generic Tree
1. You are given a partially written GenericTree class.
2. You are required to find and print the diameter of tree. THe diameter is defined as maximum number of edges between any two nodes in the tree. Check the question video for clarity.
3. Input is managed for you.
Input Format
Input is managed for you
Output Format
diameter
Constraints
None

Sample Input
20
10 20 -50 -1 60 -1 -1 30 -70 -1 80 -1 90 -1 -1 40 -100 -1 -1 -1
Sample Output
4
 */
