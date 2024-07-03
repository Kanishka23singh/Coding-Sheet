// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

class Solution {
    public int addDigits(int num) {
        // Base case
        if (num == 0) return 0;

        // Repeatedly sum the digits until a single digit is obtained
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        return num;
    }
    public int sumOfDigits(int n){
        int r = 0, s = 0;
        while(n > 0){
            r = n % 10;
            s = s + r;
            n = n / 10;
        }
        return s;
    }
}
