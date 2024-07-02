/*So, in simpler terms:
1. If the year is divisible by 400, it's also a leap year.
2. Or, if the year is divisible by 4 and not divisible by 100, it's a leap year.
*/

public class Solution {
	static boolean leapYear(int year) {
		// Write your code here.
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			return true;
		}
		return false;
	}
}
