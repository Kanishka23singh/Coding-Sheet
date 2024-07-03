/* IMPORTANT
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
Input: nums = [1,2,3]
Output: 6

Input: nums = [1,2,3,4]
Output: 24

Input: nums = [-1,-2,-3]
Output: -6

Input: nums = [-100,-98,-1,2,3,4]
Output : 39200

LOGIC: 
The logic focuses on identifying the three largest and two smallest numbers in the array. By tracking these extremes, it computes two potential maximum products: one from the product of the three 
largest numbers and another from the product of the two smallest (possibly negative) numbers and the largest number. If the array contains negative numbers, the product of the two smallest numbers 
(min1, min2) and the largest number (max1) can also result in a large positive product. This is because multiplying two negative numbers yields a positive result. 
This approach ensures the highest possible product is calculated, accounting for both positive and negative integer values efficiently.
*/

class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for(int num : nums){
            // Update the three largest values
            if(num > max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if(num > max2){
                max3 = max2;
                max2 = num;
            }
            else if(num > max3){
                max3 = num;
            }

            // Update the two smallest values
            if(num < min1){
                min2 = min1;
                min1 = num;
            }
            else if(num < min2){
                min2 = num;
            }
        }

        // Maximum product is the maximum of the product of the three largest numbers.
        // & the product of the two smallest numbers with the largest number.
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
}
/*
product1: Product of the last three elements (three largest elements).
product2: Product of the first two elements (two smallest elements, possibly negative) and the last element (the largest element).
*/
