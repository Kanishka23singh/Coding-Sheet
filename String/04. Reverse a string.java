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
