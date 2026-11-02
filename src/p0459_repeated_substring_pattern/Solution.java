package p0459_repeated_substring_pattern;

class Solution {

    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String trimmed = doubled.substring(1, doubled.length() - 1);

        return trimmed.contains(s);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "abab";
        String s2 = "aba";
        String s3 = "abcabc";
        String s4 = "aaaa";
        String s5 = "a";

        System.out.println("Example 1:");
        System.out.println("Input: \"" + s1 + "\"");
        System.out.println("Output: " + solution.repeatedSubstringPattern(s1));

        System.out.println();

        System.out.println("Example 2:");
        System.out.println("Input: \"" + s2 + "\"");
        System.out.println("Output: " + solution.repeatedSubstringPattern(s2));

        System.out.println();

        System.out.println("Example 3:");
        System.out.println("Input: \"" + s3 + "\"");
        System.out.println("Output: " + solution.repeatedSubstringPattern(s3));

        System.out.println();

        System.out.println("Example 4:");
        System.out.println("Input: \"" + s4 + "\"");
        System.out.println("Output: " + solution.repeatedSubstringPattern(s4));

        System.out.println();

        System.out.println("Example 5:");
        System.out.println("Input: \"" + s5 + "\"");
        System.out.println("Output: " + solution.repeatedSubstringPattern(s5));
    }
}