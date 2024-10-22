package Linked_Lists_L150_L222;

public class Data_Members_Linked_List {
    // Data Members of a Linked List   L 151
    public static class Node {
        int data;  // int type ka data hai
        Node next;  // Node type ka next hai
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;
    }
}
// used for dynamic memory allocation + uses double memory
// arrays elements are stored contiguously in memory

// stack me LinkedList(summary- head,tail,size) ka address store hoga
