// Factorial (Linear Recursion)

// Factorial of n is:n!=n×(n−1)!
// Base case:0!=1
class Factorial {
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Factorial: " + factorial(n));
    }
}

// Analysis
// Time Complexity: O(n)
// Space Complexity: O(n) (due to recursion stack)
// Type: Linear recursion