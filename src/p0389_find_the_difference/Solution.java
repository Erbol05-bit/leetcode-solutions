package p0389_find_the_difference;

class Solution {

    public char findTheDifference(String s, String t) {
        int result = 0;

        for (char c : s.toCharArray()) {
            result ^= c;
        }

        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return (char) result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "abcd";
        String t1 = "abcde";

        String s2 = "";
        String t2 = "y";

        String s3 = "a";
        String t3 = "aa";

        System.out.println("Example 1:");
        System.out.println("s = \"" + s1 + "\", t = \"" + t1 + "\"");
        System.out.println("Output: " + solution.findTheDifference(s1, t1));

        System.out.println();

        System.out.println("Example 2:");
        System.out.println("s = \"" + s2 + "\", t = \"" + t2 + "\"");
        System.out.println("Output: " + solution.findTheDifference(s2, t2));

        System.out.println();

        System.out.println("Example 3:");
        System.out.println("s = \"" + s3 + "\", t = \"" + t3 + "\"");
        System.out.println("Output: " + solution.findTheDifference(s3, t3));
    }
}
