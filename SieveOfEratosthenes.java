// The Sieve of Eratosthenes is an efficient algorithm used to find all prime numbers up to a given number n.
// steps:-
// Create a list from 2 to n.
// Assume all numbers are prime initially.
// Start from 2 (first prime).
// Mark all multiples of that number as non-prime.
// Move to the next unmarked number and repeat.
// The remaining unmarked numbers are prime numbers.

import java.util.Scanner;
public class SieveOfEratosthenes{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean[] prime = new boolean[n + 1];

        // Step 1: Assume all numbers are prime
        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }
        // Step 2: Apply Sieve
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        // Step 3: Print prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}