// Optimal Approach: Binary Search
class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1;
        long high = num;
        while(low <= high){
            long mid = low + (high - low) / 2; // To prevent integer overflow
            if(mid * mid == num)
            return true;
            if(mid * mid < num)
            low = mid + 1;
            else
            high = mid - 1;
        }
        return false;
    }
}

/*
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }

        for(int i = 1; i <= num/2; i++){
            if(i * i == num){
                return true;
            }
            if(i * i > num){
                return false;
            }
        }
        return false;
    }
}
*/
