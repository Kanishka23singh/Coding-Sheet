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
The subsequence has the largest sum of -1 + 3 + 4 = 6.

Intuition: The code uses a priority queue to maintain the top `k` largest elements in `nums` by their values, paired with their indices. 
It then stores the indices of these top elements in a set and reconstructs the subsequence from the original array while preserving their order. 
This approach ensures the subsequence of length `k` with the largest sum while maintaining the order of elements.

Algorithm:
1.Initialize Priority Queue: Use a min-heap (priority queue) to keep track of the top k largest elements, each element stored as a pair (value, index).
2.Populate Priority Queue: Iterate through nums, adding each element to the priority queue. If the queue exceeds size k, remove the smallest element to ensure it only contains the top k elements.
3.Extract Indices: Extract the indices of the top k elements from the priority queue and store them in a set.
4.Construct Result Array: Iterate through nums and add elements to the result array if their index is in the set, preserving the original order.
5.Return Result: Return the result array containing the subsequence of length k with the largest sum.*/

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
