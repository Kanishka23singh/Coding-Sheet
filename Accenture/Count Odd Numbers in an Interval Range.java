class Solution {
    public int countOdds(int low, int high) {
        // between low to high ->
        // odd between 0 and high minus odd between 0 and low - 1

        //            L            H
        //            <------------>
        // <------------------------>
        // <---------->
        return (high + 1) / 2 - low / 2;
    }
}

/*
class Solution {
    public int countOdds(int low, int high) {
        int cnt = 0;
        for(int i = low; i <= high; i++){
            if(i % 2 != 0){
                cnt++;
            }
        }
        return cnt;
    }
}
*/
