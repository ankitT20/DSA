package Basics_of_Programming.functions_L75_L90;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")

public class number_system {
    // Introduction to Number System   L 78
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
    }
}
/* 
# Decimal(base 10)(meaning it has 10 different digits)(0,1,2,3,4,5,6,7,8,9)
(In counting, when units place is filled, we increase the place)(i.e next place is 10 times of previous)
[9563] = 9*10^3 + 5*10^2 + 6*10^1 + 3*10^0
(4 places) [_ _ _ _] 10^4 distant numbers (0000 to 9999)
to get max number, fill max digit of that number system at all places

# Binary(base 2)(0,1)
[110111] = 1*2^5 + 1*2^4 + 0*2^3 + 1*2^2 + 1*2^1 + 1*2^0
(4 places) [_ _ _ _] 2^4 distant numbers (0000 to 1111)

# Octal(base 8)(0,1,2,3,4,5,6,7)
[563] = 5*8^2 + 6*8^1 + 3*8^0
(4 places) [_ _ _ _] 8^4 different numbers (0000 to 7777)

Hexa(16)

## Conversions
# Decimal to binary
[57](base10) to [ ](base2)
first focus on Algorithm What? , At code time, discuss How  ? Why?
jisme jana hota hai(base 2), usse divide krte raho(2), remainder aate rahenge, jab tk zero na bn jaye
aur phir ulta order me likh do (remainders)
[57](base 10) = [111001](base 2)

# Binary to decimal
[111001](base2) to [ ](base10)
divide by 10, multiply first remainder(from top) by 2^0, second r by 2^1, 2^2 ....

# Decimal to octal
[694](base10) to [](base8)
divide by 8, multiply first remainder(from top) by 10^0, second r by 10^1, 10^2 ....
[694](base10) = [1266](base8)

# Octal to decimal
[1266](base8) to [](base10)
divide by 10, multiply first remainder(from top) by 8^0, second r by 8^1, 8^2 ....

 */
/* 
Input:
Output:

 */
