/*
Example 1:
Input
1
1 500 2 500
Output
3/500

Explanation:
In above test case 1/500+2/500=3/500

Example 2:
Input:
2
384 887 778 916
794 336 387 493
Output: 
520915/406246
260737/82824

1.GCD for LCM: Calculate the LCM using the GCD of the denominators. LCM(a, b) = (a * b) / GCD(a, b).
2.Adjust Numerators: Convert fractions to a common denominator using the LCM.
3.Sum Numerators: Add the adjusted numerators.
4.Simplify: Simplify the resulting fraction by dividing both the numerator and the denominator by their GCD.
5.Print: Output the simplified fraction.
*/

class addition
{ 	
    public static void addFraction(int num1, int den1, int num2, int den2)
    {
        // Calculate the GCD of the denominators
        int gcdDen = gcd(den1, den2);
        
        // Calculate the LCM of the denominators
        int lcm = (den1 * den2) / gcdDen;
        
        // Adjust numerators to the common denominator
        int adjustedNum1 = num1 * (lcm / den1);
        int adjustedNum2 = num2 * (lcm / den2);
        
        // Calculate the numerator of the resulting fraction
        int resultNum = adjustedNum1 + adjustedNum2;
        int resultDen = lcm;
        
        // Simplify the resulting fraction
        int gcdResult = gcd(resultNum, resultDen);
        resultNum = resultNum / gcdResult;
        resultDen = resultDen / gcdResult;
        
        // Print the resulting fraction
        System.out.println(resultNum + "/" + resultDen);
    }
    
    public static int gcd(int a, int b){
        while(b % a != 0){
            int rem = b % a;
            b = a;
            a = rem;
        }
        return a;
    }
}
