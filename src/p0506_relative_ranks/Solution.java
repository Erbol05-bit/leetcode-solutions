package p0506_relative_ranks;
import java.util.Arrays;

class Solution {

    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) ->
                Integer.compare(score[b], score[a]));

        for (int i = 0; i < n; i++) {
            int originalIndex = indices[i];

            if (i == 0) {
                result[originalIndex] = "Gold Medal";
            } else if (i == 1) {
                result[originalIndex] = "Silver Medal";
            } else if (i == 2) {
                result[originalIndex] = "Bronze Medal";
            } else {
                result[originalIndex] = String.valueOf(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] score1 = {5, 4, 3, 2, 1};
        int[] score2 = {10, 3, 8, 9, 4};

        String[] result1 = solution.findRelativeRanks(score1);
        String[] result2 = solution.findRelativeRanks(score2);

        System.out.println(Arrays.toString(result1));

        System.out.println();

        System.out.println(Arrays.toString(result2));
    }
}

