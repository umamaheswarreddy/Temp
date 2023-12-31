package Programs;

public class CountWordsInString {
    public static void main(String[] args) {


       /* input.trim() removes leading and trailing spaces from the input string to ensure accurate word counting.
.split("\\s+") splits the trimmed string using one or more whitespace characters as the delimiter, which separates the string into words.
.length gives you the count of words.*/

        String input = "This is a sample sentence with multiple words";

        long wordCount = input.trim().split("\\s+").length;

        System.out.println("Number of words: " + wordCount); // Output: 8


        System.out.println("===================onther approch");


        int length = input.trim().split(" ").length;
        System.out.println(length);
    }
}
