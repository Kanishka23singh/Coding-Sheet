/* https://www.geeksforgeeks.org/problems/sort-a-string2943/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
Given a string consisting of lowercase letters, arrange all its letters in ascending order. 

Example 1:

Input:
S = "edcab"
Output: "abcde"
Explanation: characters are in ascending
order in "abcde".
Example 2:

Input:
S = "xzy"
Output: "xyz"
Explanation: characters are in ascending
order in "xyz".
*/

HINT: Create a frequency map .
  
class Solution 
{ 
    String sort(String s) 
    {
        // code here
        int freq[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        
        String res = "";
        for(int i = 0; i < 26; i++){
            int count = freq[i];
            for(int j = 0; j < count; j++){
                res = res + (char)(i + 'a');
            }
        }
        return res;
    }
} 
