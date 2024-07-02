/*
Example 1:

Input: n = 1
Output: 1
Explanation: There are one ways to climb to the top.
1. 1 step

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
  
Input: n = 4
Output: 5

Input: n = 5
Output: 8

Input: n = 6
Output: 13

We can see a series is forming
1 2 3 5 8 13
It is basically a fibo series
*/

// Approach 1: Recursion ❌ TLE ❌
class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
}
// Approach 2: Tabulation (DP)
class Solution {
    public int climbStairs(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        int dp[] = new int[n+1];
        dp[0] = dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
// Approach 3: Space Optimization
class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }
}
