package Generic_Tree_L214_L310;
import java.io.*;
import java.util.*;

public class Level_Order_Traversals_More_Approaches {
    // Level Order Traversals - More Approaches   L 250

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(){

        }

        Node(int data){
            this.data = data;
        }
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
        int m = Integer.MIN_VALUE;

        for (Node child : node.children) {
            int cm = max(child);
            m = Math.max(m, cm);
        }
        m = Math.max(m, node.data);

        return m;
    }

    public static int height(Node node) {
        int h = -1;

        for (Node child : node.children) {
            int ch = height(child);
            h = Math.max(h, ch);
        }
        h += 1;

        return h;
    }

    public static void traversals(Node node) {
        System.out.println("Node Pre " + node.data);

        for (Node child : node.children) {
            System.out.println("Edge Pre " + node.data + "--" + child.data);
            traversals(child);
            System.out.println("Edge Post " + node.data + "--" + child.data);
        }

        System.out.println("Node Post " + node.data);
    }

    public static void levelOrderLinewise(Node node) {
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);
        
        Queue<Node> cq = new ArrayDeque<>();
        while (mq.size() > 0) {
            node = mq.remove();
            System.out.print(node.data + " ");

            for (Node child : node.children) {
                cq.add(child);
            }

            if (mq.size() == 0) {
                mq = cq;
                cq = new ArrayDeque<>();
                System.out.println();
            }
        }
    }

    public static void levelOrderLinewise2(Node node) {
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);
        mq.add(new Node(-1));
        
        while (mq.size() > 0) {
            node = mq.remove();
            if (node.data != -1) {
                
                System.out.print(node.data + " ");
                
                for (Node child : node.children) {
                    mq.add(child);
                }
            } else {
                if (mq.size() > 0) {
                    mq.add(new Node(-1));
                    System.out.println();
                }
            }
        }
    }

    public static void levelOrderLinewise3(Node node) {
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);
        
        while (mq.size() > 0) {
            int cicl = mq.size();

            for (int i = 0; i < cicl; i++) {
                node = mq.remove();
                System.out.print(node.data + " ");

                for (Node child : node.children) {
                    mq.add(child);
                }
            }

            System.out.println();
        }
    }

    private static class Pair {
    
        Node node;
        int level;

        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }

    public static void levelOrderLinewise4(Node node) {
        Queue<Pair> mq = new ArrayDeque<>();
        mq.add(new Pair(node, 1));
        
        int level = 1;
        while (mq.size() > 0) {
            Pair p = mq.remove();
            if (p.level > level) {
                level = p.level;
                System.out.println();
            }

            System.out.print(p.node.data + " ");
            for (Node child : p.node.children) {
                Pair cp = new Pair(child, p.level + 1);
                mq.add(cp);
            }
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

        Node root = construct(arr);
        levelOrderLinewise4(root);
    }

}
/* 
Level Order Traversals - More Approaches

Sample Input
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
Sample Output
10 
20 30 40 
50 60 70 80 90 100 
110 120
 */
