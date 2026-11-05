package p0283_move_zeros;

import java.util.Arrays;

class Solution {

    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = {1, 2, 3, 0, 0};
        solution.moveZeroes(nums3);
        System.out.println(Arrays.toString(nums3));

        int[] nums4 = {0, 0, 1, 0, 2};
        solution.moveZeroes(nums4);
        System.out.println(Arrays.toString(nums4));

        int[] nums5 = {1, 2, 3, 4};
        solution.moveZeroes(nums5);
        System.out.println(Arrays.toString(nums5));
    }
}