/*Leetcode 2099: Find Subsequence of Length K With the Largest Sum
You are given an integer array nums and an integer k. You want to find a subsequence of nums of length k that has the largest sum.
Return any such subsequence as an integer array of length k.
A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

Example 1:

Input: nums = [2,1,3,3], k = 2
Output: [3,3]
Explanation:
The subsequence has the largest sum of 3 + 3 = 6.
Example 2:

Input: nums = [-1,-2,3,4], k = 3
Output: [-1,3,4]
Explanation: 
The subsequence has the largest sum of -1 + 3 + 4 = 6.*/

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (a[0] - b[0])); // Min Heap
        for(int i = 0; i < nums.length; i++){
            pq.add(new int[]{nums[i], i});
            if(pq.size() > k){
                pq.remove();
            }
        }

        Set<Integer> idx = new HashSet<>();
        while(!pq.isEmpty()){
            int top[] = pq.remove();
            idx.add(top[1]); // top[1] means 2nd element
        }

        int ans[] = new int[k];
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(idx.contains(i)){
                ans[j] = nums[i];
                j++;
            }
        }
        return ans;
    }
}
