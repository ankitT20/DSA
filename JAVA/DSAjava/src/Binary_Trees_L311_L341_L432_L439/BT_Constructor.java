package Binary_Trees_L311_L341_L432_L439;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class BT_Constructor {
    // Binary Tree - Constructor   L314
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
    public static void main(String[] args) {
        
    }
}
