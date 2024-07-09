/*
https://www.geeksforgeeks.org/problems/remove-character3815/1
Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). Both the strings are different and contain only lowercase characters.
NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).
 

Example 1:

Input:
string1 = "computer"
string2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t)
from string1 we get "ompuer".
*/

class Solution{
    static String removeChars(String s1, String s2){
        // code here
        int arr[] = new int[26]; // an array of size 26 to count the frequency of characters
        for(int i = 0; i < s2.length(); i++){
            arr[s2.charAt(i) - 'a'] = -1; // Marking
        }
        
        String s3 = "";
        for(int i = 0; i < s1.length(); i++){
            if(arr[s1.charAt(i) - 'a'] != -1){
                s3 += s1.charAt(i);
            }
        }
        return s3;
    }
}
