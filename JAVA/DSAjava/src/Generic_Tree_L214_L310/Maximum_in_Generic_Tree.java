package Generic_Tree_L214_L310;
import java.io.*;
import java.util.*;

public class Maximum_in_Generic_Tree {
    // Maximum in a Generic Tree L 231

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

    public static int size(Node node) {
        int s = 0;

        for (Node child : node.children) {
            s += size(child);
        }
        s += 1;

        return s;
    }

    public static int max(Node node) {
        // write your code here
        int max = Integer.MIN_VALUE;

        for (Node child : node.children) {
            int cm = max(child);
            max = Math.max(cm, max);
            // if (cm > max) {
            //     max = cm;
            // }
        }
        max = Math.max(node.data, max);

        return max;
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
        int m = max(root);
        System.out.println(m);
        // display(root);
    }

}
/* 
Maximum In A Generic Tree
1. You are given a partially written GenericTree class.
2. You are required to complete the body of max function. The function is expected to find the node with maximum value and return it.
3. Input and Output is managed for you.
Input Format
Input is managed for you
Output Format
Output is managed for you
Constraints
None

Sample Input
12
10 20 -1 30 50 -1 60 -1 -1 40 -1 -1
Sample Output
60
 */
