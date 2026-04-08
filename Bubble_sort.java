// Bubble Sort is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order. Larger elements “bubble” to the end of the list.

// Steps of Bubble Sort:

// Start from the first element of the array.
// Compare the current element with the next element.
// If the current element is greater, swap them.
// Move to the next pair and repeat the comparison.
// After one pass, the largest element goes to the end.
// Repeat the process for the remaining elements (ignore sorted part).
// Continue until no swaps are needed.


public class Bubble_sort{
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4};

        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// 🔹 Time Complexity
// Best Case: O(n) → when array is already sorted
// Average Case: O(n²)
// Worst Case: O(n²)
// 🔹 Space Complexity
// O(1) (no extra memory used)