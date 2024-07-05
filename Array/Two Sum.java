import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int more = target - nums[i]; // How much more we need 
            if (map.containsKey(more)) {
                return new int[] { map.get(more), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {-1,-1}; // throw new IllegalArgumentException("No two elements add up to the target");
    }
}

/* OR
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        int ans[] = new int[2];
        int sum = 0, moreNeeded = 0;
        for(int i = 0; i < nums.length; i++){
            moreNeeded = target - nums[i];
            if(map.containsKey(moreNeeded) && i != map.get(moreNeeded)){
                ans[0] = i;
                ans[1] = map.get(moreNeeded);
            }
        }
        return ans;
    }
}
*/


/* Brute Force Method
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = res[1] = -1;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
    return res;
    }
}
*/
