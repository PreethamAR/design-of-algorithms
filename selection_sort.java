// Selection Sort:
// Selection sort is a simple sorting algorithm that repeatedly selects the smallest element from the unsorted part and places it at the beginning.

// Steps
// Start from first element
// Find the smallest element in the remaining array
// Swap it with the current position
// Move to next position
// Repeat until array is sorted

public class selection_sort{

    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 5, 1};

        selectionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


// Time Complexity
// Best Case: O(n²)
// Worst Case: O(n²)
// Average Case: O(n²)