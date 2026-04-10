// Brute Force String Matching is a basic method that checks the pattern at every possible position in the text by comparing characters one by one.

// Steps:
// Take the text and pattern.
// Align the pattern with the start of the text.
// Compare characters one by one.
// If all characters match → pattern found.
// If mismatch occurs → shift pattern by one position.
// Repeat until the end of the text.
// If no match → return -1.


public class BruteForceStringMatching {

    public static void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;

            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                System.out.println("Pattern found at index: " + i);
            }
        }
    }

    public static void main(String[] args) {
        String text = "AABAACAADAABAAABAA";
        String pattern = "AABA";

        search(text, pattern);
    }
}

// 🔹 Time Complexity
// Best Case: O(n)
// Average Case: O(n × m)
// Worst Case: O(n × m)

// (where n = text length, m = pattern length)