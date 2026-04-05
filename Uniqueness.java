// Element Uniqueness:
// Check every element with the rest.
// If any two elements are equal → duplicate exists.


public class Uniqueness {

    static boolean isUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        if (isUnique(arr))
            System.out.println("Unique");
        else
            System.out.println("Duplicate found");
    }
}
// Analysis :
// Time Complexity: O(n²)
// Space Complexity: O(1)