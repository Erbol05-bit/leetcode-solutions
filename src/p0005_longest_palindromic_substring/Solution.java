package p0005_longest_palindromic_substring;

public class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int length1 = extended(s, i, i);
            int length2 = extended(s, i, i + 1);
            int length = Math.max(length1, length2);
            if (length > maxLength) {
                start = i - (length - 1) / 2;
                maxLength = length;
            }
        }
        return s.substring(start, start + maxLength);
    }
    private int extended (String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.longestPalindrome("babad"));
        System.out.println(solution.longestPalindrome("cbbd"));
        System.out.println(solution.longestPalindrome("a"));
        System.out.println(solution.longestPalindrome("ac"));
        System.out.println(solution.longestPalindrome("racecar"));
        System.out.println(solution.longestPalindrome("abba"));
    }

}

