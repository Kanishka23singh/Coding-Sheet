/*
 Input : n = 10       
 Output: 1 2 5 10

 Input:  n = 100
 Output: 1 2 4 5 10 20 25 50 100

 Input:  n = 125
 Output: 1 5 25 125 


Remember occurs in pairs.
For example:
Factors of 8 : 1 * 8, 2 * 4 --> [1,8,2,4]
Factors of 9 : 1 * 9, 3 * 4 --> [1,9,3]
Factors of 12 : 1 * 12, 2 * 6, 3 * 4 --> [1,12,2,6,3,4]

So, if 'i' is factor of 'n' say
Then factor pair of 'i' will be 'n/i'
*/
class Factors {
  public static List<Integer> allFactors(int n) {
      List<Integer> factors = new ArrayList<>(); // Initialize the factors list
      int sqrtN = (int) Math.sqrt(n); // Calculate the square root of n
      for (int i = 1; i <= sqrtN; i++) { // Loop from 1 to the square root of n
          if (n % i == 0) { // Check if i is a factor of n
              factors.add(i); // Add i to the factors list
              if (i != n / i) { // If i and n / i are different
                  factors.add(n / i); // Add n / i to the factors list
              }
          }
      }
      return factors; // Return the list of factors
  }
}

