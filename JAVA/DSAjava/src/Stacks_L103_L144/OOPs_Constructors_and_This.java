package Stacks_L103_L144;
import java.io.*;
import java.util.*;
import basics_L1_L34.prime;
@SuppressWarnings("unused")

public class OOPs_Constructors_and_This {
    // OOP's | Constructors and This   L 136
    public static class Person {
        int age;
        String name;

        void saysHi(){
            System.out.println(name + "[" + age + "] says hi");
        }

        // if we forget, java provides our class a default constructor
        Person(){
            // default constructor
        }

        // Parametrized constructor
        Person(int age, String name){
            this.age = age;
            this.name = name;
        }
        // if we write paprametrized constructor, default constructor needs to be specifically written 
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        // 1.Space Allocation, default value 0, null
        // 2.Default constructor called
        p1.age = 10;
        p1.name = "A";
        p1.saysHi();

        Person p2 = new Person(20, "B");
        p2.saysHi();
    }
}
// Person p2 = new Person(20, "B");
// in Stack mem = main, Parameterized constructor
// age = 20, name = "B", this = 5k
// return this
/* 
// new
1. Space Allocation 
2. Parsing
3. Constructor - same name as function
called by new, new se fire hote hai, kaam hota hai properties ko set krna
- default constructor has no parameters
 */
