public class Solution {
    public String reverseString(String s) {
        char[] ch = s.toCharArray();
        int low = 0;
        int high = s.length() - 1;
        while(low <= high){
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low++;
            high--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "Hello, World!";
        String reversed = solution.reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}

/*
541. Reverse String II
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:

Input: s = "abcd", k = 2
Output: "bacd"
*/

/*
Intuition
The goal is to modify the string by reversing segments of length k for every 2k characters:

1.If there are at least k characters but less than 2k, reverse the first k characters.
2.If fewer than k characters remain, reverse all of them.
Logic
1.Convert to Character Array: This allows direct manipulation of characters.
2.Iterate in 2k Chunks:
For each chunk, identify the segment of k characters (or fewer if near the end of the string).
Reverse this segment using a helper function.
3.Reverse Function:
Utilizes two pointers to swap characters symmetrically towards the center of the segment.
*/

class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray(); // Convert string to character array for in-place modification
        int n = s.length();
        
        for (int i = 0; i < n; i += 2 * k) {
            int left = i; // Start of the current segment
            int right = Math.min(i + k - 1, n - 1); // End of the segment, ensuring it doesn't exceed the string length
            
            reverse(chars, left, right); // Reverse the segment
        }

        return new String(chars); // Convert character array back to string and return
    }

    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

/*
https://docs.google.com/document/d/1aU5QKBxNRufCRnqenB9sfaoo2xEWzRbdN2NK1UU6NwU/edit
Certainly! In Java, you can convert a character array to a string using different methods. Let me explain a few of them:
1.Using new String(char[]): The easiest way is to use the string constructor that accepts a character array as an argument. For example:
char[] charArray = {'H', 'e', 'l', 'l', 'o'};
String str = new String(charArray);

Using StringBuilder: If you want a more efficient approach, you can use a StringBuilder to iterate through the character array and build the string:
2. char[] charArray = {'g', 'e', 'e', 'k', 's'};
StringBuilder sb = new StringBuilder();
for (char c : charArray) {
    			sb.append(c);
}
String result = sb.toString();

Using String.valueOf(char[]): Another method is to directly use the valueOf() method from the String class:
3. char[] charArray = {'c', 'o', 'd', 'i', 'n', 'g'};
            String str = String.valueOf(charArray);
*/
