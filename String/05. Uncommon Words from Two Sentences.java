/* Leetcode: 884
Uncommon Words from Two Sentences
A sentence is a string of single-space separated words where each word consists only of lowercase letters.
A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.
  
Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]
*/

import java.util.*;

public class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] word1 = s1.split(" ");
        String[] word2 = s2.split(" ");
        
        Map<String, Integer> wordCount = new HashMap<>();

        // Count occurrences of words in s1
        for (String word : word1) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Count occurrences of words in s2
        for (String word : word2) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // List to collect uncommon words
        List<String> uncommonWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                uncommonWords.add(entry.getKey());
            }
        }

        // Convert List to String array
        String[] res = new String[uncommonWords.size()];
        return uncommonWords.toArray(res);
    }
}
