package Binary_Trees_L311_L341_L432_L439;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class Traversals_BT {
    // Traversals in a Binary Tree   L 318
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();;
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }
                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }
                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static void traversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data + " in Preorder");  // euler left -> pre
        traversal(node.left);
        System.out.println(node.data + " in Inorder");  // euler between -> in
        traversal(node.right);
        System.out.println(node.data + " in Postorder");  // euler left -> post
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        Node root = construct(arr);
        traversal(root);
    }
}
/* 
Input:
23
50 25 12 n n 37 30 n n 40 n n 75 62 60 n n 70 n n 87 n n
Output:
50 in Preorder
25 in Preorder
12 in Preorder
12 in Inorder
12 in Postorder
25 in Inorder
37 in Preorder
30 in Preorder
30 in Inorder
30 in Postorder
37 in Inorder
40 in Preorder
40 in Inorder
40 in Postorder
37 in Postorder
25 in Postorder
50 in Inorder
75 in Preorder
62 in Preorder
60 in Preorder
60 in Inorder
60 in Postorder
62 in Inorder
70 in Preorder
70 in Inorder
70 in Postorder
62 in Postorder
75 in Inorder
87 in Preorder
87 in Inorder
87 in Postorder
75 in Postorder
50 in Postorder
 */
