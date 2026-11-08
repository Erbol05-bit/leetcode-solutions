package p0424_longest_repeating_character_replacement;


class Solution {

    public int characterReplacement(String s, int k) {

        int[] count = new int[26];

        int left = 0;
        int maxCount = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'A';

            count[index]++;

            maxCount = Math.max(maxCount, count[index]);

            while ((right - left + 1) - maxCount > k) {

                int leftIndex = s.charAt(left) - 'A';

                count[leftIndex]--;

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.characterReplacement("ABAB", 2));
        System.out.println(solution.characterReplacement("AABABBA", 1));
        System.out.println(solution.characterReplacement("AAAA", 2));
        System.out.println(solution.characterReplacement("ABCDE", 1));
        System.out.println(solution.characterReplacement("ABBB", 2));
    }
}