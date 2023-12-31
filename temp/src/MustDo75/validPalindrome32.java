package MustDo75;
/**
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
removing all non-alphanumeric characters, it reads the same forward and backward.
Alphanumeric characters include letters and numbers.

 * Example 1:

 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 */
public class validPalindrome32 {
    public static void main(String[] args) {

        boolean valid = isPalindrome(" ");
        String result = valid ? "VALID" : "NOT VALID";
        System.out.println(result);

    }

    private static boolean isPalindrome(String str) {

        String alphanumericString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = alphanumericString.length();
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            char a = alphanumericString.charAt(i);
            char b = alphanumericString.charAt(j);
            if (a != b) {
                return false;
            }

        }

        return true;
    }
}
