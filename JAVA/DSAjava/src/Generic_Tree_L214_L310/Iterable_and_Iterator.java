package Generic_Tree_L214_L310;

import java.io.*;
import java.util.*;

public class Iterable_and_Iterator {
    // Iterable and Iterator L 310
    // my exams are from 18 December 2024 to 8 January 2025
    // I will resume DSA from 8 January 2025

    public static class GenericTree implements Iterable<Integer> {
        Node root;

        GenericTree(Node root) {
            this.root = root;
        }

        public Iterator<Integer> iterator() {
            Iterator<Integer> obj = new GTPreorderIterator(root);
            return obj;
        }
    }

    public static class GTPreorderIterator implements Iterator<Integer> {
        Integer nval;
        Stack<Pair> st;

        public GTPreorderIterator(Node root) {
            st = new Stack<>();
            st.push(new Pair(root, -1));
            next();
        }

        public boolean hasNext() {
            if (nval == null) {
                return false;
            } else {
                return true;
            }
        }

        public Integer next() {
            Integer fr = nval;

            nval = null;
            while (st.size() > 0) {
                Pair top = st.peek();
                if (top.state == -1) {
                    nval = top.node.data;
                    top.state++;
                    break;
                } else if (top.state >= 0 && top.state < top.node.children.size()) {
                    Pair cp = new Pair(top.node.children.get(top.state), -1);
                    st.push(cp);

                    top.state++;
                } else {
                    st.pop();
                }
            }

            return fr;
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
        GenericTree gt = new GenericTree(root);
        // for (int val : gt) { // syntactical sugar dependent on Iterable
        //     System.out.println(val);
        // }

        Iterator<Integer> gti = gt.iterator();
        while (gti.hasNext() == true) {
            System.out.println(gti.next());
        }
    }

}
/* 
Sample Input
24
10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1
Sample Output
10 20 -50 60 30 70 -80 110 -120 90 40 -100 
-50 60 20 70 110 -120 -80 90 30 -100 40 10 
 */
