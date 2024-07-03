/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

-->Starting with any positive integer, replace the number by the sum of the squares of its digits.
-->Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
-->Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

LOGIC:

1. HashSet for Tracking: Use a `HashSet` named `seen` to store numbers encountered during the process to detect cycles efficiently.
2. Iterative Calculation: Continuously compute the sum of the squares of each digit of `n` until `n` becomes 1 (indicating it's a happy number) or a cycle is detected (`seen.contains(n)`).
3. Sum of Digits Calculation: The `sumOfDigit` method computes the sum of squares of each digit of `n`.
4. Return Condition: Return `true` if `n` eventually equals 1 (happy number), otherwise return `false`.

This approach uses iterative computation and cycle detection to determine if a number is happy efficiently.
*/

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>(); // Cycle Detection: For example, the number 4 leads to a cycle: 4 -> 16 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4. Without checking for cycles, the algorithm could enter an infinite loop.
        while(n != 1 && !seen.contains(n)){ 
            seen.add(n);
            n = sumOfDigit(n);
        }
        return n == 1;
    }

    public static int sumOfDigit(int n){
        int r = 0, s = 0;
        while(n > 0){
            r = n % 10;
            s += r * r;
            n = n / 10;
        }
        return s;
    }
}
