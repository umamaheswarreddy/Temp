package Programs;

import java.util.HashSet;
import java.util.Set;

/**
 * Licensed Materials - Property of IBM 6949-80Q © Copyright IBM Corp. 2019 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * @author 002KA5
 * @project temp
 * @created-on 01/02/23
 */
public class LongestUniqueSubsttr {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "ababc";
        System.out.println("The input string is " + str);

        int len = lengthOfLongestSubstring(str);

        System.out.println("The length of the longest " +
                "non-repeating character " +
                "substring is " + len);
    }
}
