package Queues_L145_L149;
import java.io.*;
import java.util.*;

public class Queues_Intro {
    // Queues | Introduction and Usage   L 145
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();

        que.add(10);
        System.out.println(que);
        que.add(20);
        System.out.println(que);
        que.add(30);
        System.out.println(que);

        System.out.println(que.peek());
        System.out.println(que);

        System.out.println(que.remove());
        System.out.println(que);
    }
}
/* 
Stack[LIFO], Queue[FIFO]
add= push,   enque= add
remove= pop, deque= remove
get= top,    peek
 */
