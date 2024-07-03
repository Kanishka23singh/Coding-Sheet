/*
Given a number N, check if a number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number. 
Return 1 if the number is Perfect otherwise return 0.

Example 1:

Input:
N = 6
Output:
1 
Explanation: Factors of 6 are 1, 2, 3 and 6. Excluding 6 their sum is 6 which is equal to N itself. So, it's a Perfect Number.
  
Example 2:

Input:
N = 10
Output:
0
Explanation: Factors of 10 are 1, 2, 5 and 10. Excluding 10 their sum is 8 which is not equal to N itself. So, it's not a Perfect Number.

HINT : We will use same factor concept which is So, if 'i' is factor of 'n' say Then factor pair of n will be 'i' & 'n/i'
*/

class Solution {
    static int isPerfectNumber(long N) {
        // code here
        if(N == 1){ // Edge case
            return 0;
        }
        
        long ans = 0;
        for(int i = 1; i <= Math.sqrt(N); i++){
            if(N % i == 0){
                ans += i;
                if(i != N/i && N/i != N){ // Edge Case Conditiom: N/i != N (because we donot want to include the number itself)
                    ans += N/i;
                }
            }
        }
        return ans == N ? 1 : 0;
    }
    
};
