/*
Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554".
*/

class GfG {
    int convertfive(int num) {
        // Your code here
        String s = Integer.toString(num); // String to Integer Conversion
        int n = s.length();
        
        String ans = "";
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '0')
            ans += '5';
            else
            ans += ch;
        }
        return Integer.parseInt(ans); // Integer to String Conversion
    }
}
