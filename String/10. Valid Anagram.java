/*Leetcode: 242
Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false*/

/*
This approach iterates through both strings once, resulting in O(n) time complexity, where 'n' is the length of the strings. The algorithm uses a fixed-size array (size 26), leading to O(1) space complexity.

Algorithm:
1. Create an array arr of size 26 for lowercase letters.
2. Iterate through string s:
   - Increment count in arr for each character.
3. Iterate through string t:
   - Decrement count in arr for each character.
4. Check if all elements in arr are zero.
   - If yes, return true (strings are anagrams).
   - Otherwise, return false.

*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
