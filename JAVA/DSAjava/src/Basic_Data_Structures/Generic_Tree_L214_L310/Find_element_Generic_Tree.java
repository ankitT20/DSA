package Basic_Data_Structures.Generic_Tree_L214_L310;
import java.io.*;
import java.util.*;

public class Find_element_Generic_Tree {
    // Find an element in Generic Tree L 265

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

    public static boolean find(Node node, int data) {
        // write your code here
        if (node.data == data) {
            return true;
        }

        for (Node child : node.children) {
            boolean fic = find(child, data);
            if (fic) {
                return true;
            }
        }

        return false;
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
        boolean flag = find(root, data);
        System.out.println(flag);
        // display(root);
    }

}
/* 
Find In Generic Tree
1. You are given a partially written GenericTree class.
2. You are required to complete the body of find function. The function is expected to find the given data in the tree, if found it should return true or return false.
3. Input and Output is managed for you.
Input Format
Input is managed for you
Output Format
Output is managed for you
Constraints
None

Sample Input
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
120
Sample Output
true
 */
