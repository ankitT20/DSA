package Stacks_L103_L144;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class OOPs_Classes_and_Objects {
    // OOP's - Classes and Objects   L 131
    public static class Person {  // class consists of datamembers and functions encapsulated together 
        int age;  // Data-member of person class
        String name; // Datamember in class
        void saysHi(){ // function in of class
            System.out.println(name + "[" + age + "] says hi");
        }
    }
    // we can make objects using person class
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "A";
        p1.saysHi();

        Person p2 = new Person();
        p2.age = 20;
        p2.name = "B";
        p2.saysHi();
        
/* 
        // p1 refrence = 4k
        Person p3 = p1; // refrence copied to p3, p3 = 4k
        p3.age = 30;
        p3.saysHi();
        p1.saysHi();
        System.out.println("*****SWAP 1 *******");
        p1.saysHi();
        p2.saysHi();
        swap1(p1, p2);
        p1.saysHi();
        p2.saysHi();
        // no change because datamember temp used
        // changes in stack


        System.out.println("*****SWAP 2 *******");
        p1.saysHi();
        p2.saysHi();
        swap2(p1, p2);
        p1.saysHi();
        p2.saysHi();
        // changed because psn1.age = psn2.age (age overwritten) also int used
        // changes in Heap
 */
        System.out.println("*****SWAP 3 *******");
        p1.saysHi();
        p2.saysHi();
        swap3(p1, p2);
        p1.saysHi();
        p2.saysHi();
        // only p2 age changed

    }

    public static void swap1(Person psn1, Person psn2){
        Person temp = psn1;
        psn1 = psn2;
        psn2 = temp;
        // function has seprate stack (refrence memory)
        // functiion ended = refrences killed
        // changes in stack
    }

    public static void swap2(Person psn1, Person psn2){
        int age = psn1.age;
        psn1.age = psn2.age;  // age overwritten
        psn2.age = age;

        String name = psn1.name;
        psn1.name = psn2.name;
        psn2.name = name;
        // Changes in Heap
    }

    public static void swap3(Person psn1, Person psn2){
        psn1 = new Person();
        int age = psn1.age;  // age = 0
        psn1.age = psn2.age;  // psn1.age overwritten to 20
        psn2.age = age;  // psn2.age = 0, 5k age = 0

        psn2 = new Person();
        String name = psn1.name;
        psn1.name = psn2.name;
        psn2.name = name;
    }
}
// Stack Heap
// Class, Object
// Instance , Refrence
// Heap p1(name,age) , p2 is instance (object of a class)
// Stack p1 = 4k, p2 = 5k - refrence to instance (refrence to object)
