/*
1.Edge Case Handling: If the number is zero, return "0" immediately.
2.Unsigned Conversion: Handle negative numbers by treating them as unsigned.
3.Hex Mapping: Use a predefined string for hex characters.
4.Loop: Extract hex digits from right to left and build the result string.
*/
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0"; // Handle zero case [Edge Case]

        String ans = "";
        String hex = "0123456789abcdef";
        // Treat num as unsigned, Unsigned Conversion: Integer.toUnsignedLong(num) converts num to an unsigned long, effectively treating negative int values as large positive values.
        long n = Integer.toUnsignedLong(num); // Most important line: long n = Integer.toUnsignedLong(num);
        
        while (n > 0) {
            int r = (int) (n % 16); 
            ans = hex.charAt(r) + ans;
            n = n / 16; 
        }
        
        return ans;
    }
}

/*
In Java, the line long n = Integer.toUnsignedLong(num); helps handle negative integers correctly when converting them to their hexadecimal representation. Let's break down how this works and why it's necessary:

1.Understanding the Problem:

Negative Numbers and Two's Complement:
Negative integers in Java are stored using two's complement representation.
This means the most significant bit (MSB) acts as a sign bit, and the value is interpreted accordingly.
For example, -1 in a 32-bit signed integer is represented as 0xFFFFFFFF.

2.Hexadecimal Conversion:

When converting a negative integer to hexadecimal, we need to ensure it's treated as a positive value in terms of bit manipulation.
Java's Integer.toUnsignedLong(num) method converts the signed int num to an unsigned long.
This conversion effectively interprets the bits of num as if they represent a positive number, disregarding the sign bit.

3.Role of Integer.toUnsignedLong(num):

Conversion Detail: The method Integer.toUnsignedLong(num) interprets num as an unsigned 32-bit integer.
Handling Negative Numbers: When num is negative, Integer.toUnsignedLong(num) converts it to its corresponding positive value, treating the bit pattern as an unsigned integer.
Ensuring Correct Conversion: This approach ensures that the loop while (n > 0) processes the bits of num correctly, regardless of its sign, producing the correct hexadecimal representation.
*/
