package p0136_single_number;


import java.util.Arrays;

class Solution {

    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result = result ^ num;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        System.out.println("Example 1:");
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + solution.singleNumber(nums1));

        System.out.println();

        System.out.println("Example 2:");
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + solution.singleNumber(nums2));

        System.out.println();

        System.out.println("Example 3:");
        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("Output: " + solution.singleNumber(nums3));
    }
}
