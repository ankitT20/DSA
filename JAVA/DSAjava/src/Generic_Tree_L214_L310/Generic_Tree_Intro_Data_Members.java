package Generic_Tree_L214_L310;
import java.io.*;
import java.util.*;

public class Generic_Tree_Intro_Data_Members {
    // Generic Tree - Introduction and Data Members   L214
    private class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void main(String[] args) {
        Node root;
    }
}
// Array, Arraylist, Stack, Queue, Linked List = linear information
// Tree- Generic, binary, BST, AVL = Hierarchical information
// Node, data, children
// Node without child = leaf
// Parent, child, Ansectors, Decendents(lower subtree)
// root - upper most node