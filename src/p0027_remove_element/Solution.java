package p0027_remove_element;

import java.util.Arrays;

class Solution {

    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int k = solution.removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.println("Array: " +
                Arrays.toString(Arrays.copyOf(nums, k)));
    }
}

