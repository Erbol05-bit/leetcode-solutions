package p0242_valid_anagram;

class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        for (int n : count) {
            if (n != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "anagram";
        String t1 = "nagaram";

        String s2 = "rat";
        String t2 = "car";

        String s3 = "a";
        String t3 = "a";

        String s4 = "ab";
        String t4 = "a";

        System.out.println("Example 1:");
        System.out.println("s = \"" + s1 + "\", t = \"" + t1 + "\"");
        System.out.println("Output: " + solution.isAnagram(s1, t1));

        System.out.println();

        System.out.println("Example 2:");
        System.out.println("s = \"" + s2 + "\", t = \"" + t2 + "\"");
        System.out.println("Output: " + solution.isAnagram(s2, t2));

        System.out.println();

        System.out.println("Example 3:");
        System.out.println("s = \"" + s3 + "\", t = \"" + t3 + "\"");
        System.out.println("Output: " + solution.isAnagram(s3, t3));

        System.out.println();

        System.out.println("Example 4:");
        System.out.println("s = \"" + s4 + "\", t = \"" + t4 + "\"");
        System.out.println("Output: " + solution.isAnagram(s4, t4));
    }
}