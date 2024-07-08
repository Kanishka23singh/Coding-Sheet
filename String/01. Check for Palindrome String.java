public class Solution {

	public static boolean checkPalindrome(String str) {
	
		// It replaces any character that isn't in the set a-z, A-Z, or 0-9 with nothing.
		str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // most important line

		int left = 0;
		int right = str.length() - 1;

		while(left < right){
			if(str.charAt(left) != str.charAt(right))
			return false;
			else{
				left++;
				right--;
			}
		}
		return true;
	}
}
