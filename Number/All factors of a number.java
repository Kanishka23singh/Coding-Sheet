
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

