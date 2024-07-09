/* Leetcode: 171
Excel Sheet Column Number
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701

HINT: Forming a digit i.e digit = digit * base number + n; (Analogy s = s * 10 + r)
int digit = digit * base + n 
where digit = this variable typically holds the accumulated value of the number being formed in the desired base system (e.g., decimal, binary, hexadecimal).
base = represents the base of the number system you are working in (e.g., 10 for decimal, 2 for binary, 16 for hexadecimal),
n = represents each individual digit of the number being processed or constructed in the specified base system.
  
Here, base is 26.
*/
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
}
