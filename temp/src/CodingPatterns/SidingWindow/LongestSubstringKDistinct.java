package CodingPatterns.SidingWindow;

import java.util.HashMap;

public class LongestSubstringKDistinct {

    public static int lengthOfLongestSubstringKDistinct(String str, int k) {

        // This map will store the frequency of characters in the current window
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0, maxLength = 0;

        // Expand the window by moving the right pointer
        for (int right = 0; right < str.length(); right++) {
            char rightChar = str.charAt(right);

            // Add the current character to the window
            window.put(rightChar, window.getOrDefault(rightChar, 0) + 1);

            // Shrink the window if we have more than K distinct characters
            while (window.size() > k) {
                char leftChar = str.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                // If a character's count goes to 0, remove it from the window
                if (window.get(leftChar) == 0) {
                    window.remove(leftChar);
                }

                // Move the left pointer to reduce the window size
                left++;
            }

            // Update the maximum length found
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }


    public static void main(String[] args) {
        String s = "aaabbccd";
        int k = 2;
        int result = lengthOfLongestSubstringKDistinct(s, k);
        System.out.println("The length of the longest substring with " + k + " distinct characters is: " + result);
    }
}
