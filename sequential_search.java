// Sequential Search is a simple searching algorithm that checks each element in the list one by one until the required element is found or the list ends.

// 🔹 Steps of Sequential Search
// Start from the first element of the array.
// Compare the current element with the target value.
// If it matches, return the position.
// If not, move to the next element.
// Repeat until the element is found or the array ends.
// If not found, return -1.

public class sequential_search {
    public static int sequentialSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the found element
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 8, 1};
        int target = 2;
        int result = sequentialSearch(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

// 🔹 Time Complexity
// Best Case: O(1) → element found at first position
// Average Case: O(n)
// Worst Case: O(n) → element at last or not present