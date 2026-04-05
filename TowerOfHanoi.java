/*
 * Tower of Hanoi Problem
 * ----------------------
 * Problem Statement:
 * You are given:
 * - 3 rods: Source (A), Auxiliary (B), Destination (C)
 * - n disks of different sizes stacked on source rod (largest at bottom)
 *
 * Rules:
 * 1. Move only one disk at a time
 * 2. Only the top disk can be moved
 * 3. A larger disk cannot be placed on a smaller disk
 *
 * Basic Idea / Working:
 * To move n disks from A → C:
 * 1. Move n−1 disks from A → B (using C)
 * 2. Move nth (largest) disk from A → C
 * 3. Move n−1 disks from B → C (using A)
 *
 * Example (n = 3):
 * Total moves = 7
 *
 * Recurrence Relation:
 * T(n) = 2T(n−1) + 1
 * Base Case: T(1) = 1
 *
 * Solving:
 * T(n) = 2^n − 1
 *
 * Time Complexity: O(2^n)
 * Space Complexity: O(n)
 *
 * Type: Binary Recursion
 * (Each call makes two recursive calls)
 */

public class TowerOfHanoi{

    // Function to solve Tower of Hanoi
    static void hanoi(int n, char source, char auxiliary, char destination) {

        // Base Case
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move n-1 disks from source to auxiliary
        hanoi(n - 1, source, destination, auxiliary);

        // Step 2: Move nth disk to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move n-1 disks from auxiliary to destination
        hanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // number of disks

        System.out.println("Steps to solve Tower of Hanoi with " + n + " disks:\n");
        hanoi(n, 'A', 'B', 'C');

        // Total moves formula
        int totalMoves = (int) Math.pow(2, n) - 1;
        System.out.println("\nTotal moves = " + totalMoves);
    }
}