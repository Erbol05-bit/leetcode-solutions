package p0028_find_the_index_of_the_first_occurrence_in_a_string;

class Solution {

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String haystack1 = "sadbutsad";
        String needle1 = "sad";

        String haystack2 = "leetcode";
        String needle2 = "leeto";

        String haystack3 = "hello";
        String needle3 = "ll";

        String haystack4 = "abc";
        String needle4 = "";

        System.out.println("Example 1:");
        System.out.println("haystack = \"" + haystack1 + "\"");
        System.out.println("needle = \"" + needle1 + "\"");
        System.out.println("Output: " + solution.strStr(haystack1, needle1));

        System.out.println();

        System.out.println("Example 2:");
        System.out.println("haystack = \"" + haystack2 + "\"");
        System.out.println("needle = \"" + needle2 + "\"");
        System.out.println("Output: " + solution.strStr(haystack2, needle2));

        System.out.println();

        System.out.println("Example 3:");
        System.out.println("haystack = \"" + haystack3 + "\"");
        System.out.println("needle = \"" + needle3 + "\"");
        System.out.println("Output: " + solution.strStr(haystack3, needle3));

        System.out.println();

        System.out.println("Example 4:");
        System.out.println("haystack = \"" + haystack4 + "\"");
        System.out.println("needle = \"" + needle4 + "\"");
        System.out.println("Output: " + solution.strStr(haystack4, needle4));
    }
}