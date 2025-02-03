package Basic_Data_Structures.Generic_Tree_L214_L310;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class Display_Generic_Tree {
    // Display a Generic Tree   L 227
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    // d(10) -> 10 will print itself and its's family
    // d(20), d(30), d(40) will print themselves and theirs family
    // d(10) = s(10) + d(20) + d(30) + d(40)
    public void display(Node node) {
        String str = node.data + "-->";
        for (Node child: node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child: node.children) {
            display(child);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root;
        Stack<Node> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];
                
                if(st.size() > 0){
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }
    }
}
