package p0088_merge_sorted_array;
import java.util.Arrays;

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        solution.merge(nums1, 3, nums2, 3);

        System.out.println("Example 1:");
        System.out.println(Arrays.toString(nums1));

        int[] nums3 = {1};
        int[] nums4 = {};

        solution.merge(nums3, 1, nums4, 0);

        System.out.println();
        System.out.println("Example 2:");
        System.out.println(Arrays.toString(nums3));

        int[] nums5 = {0};
        int[] nums6 = {1};

        solution.merge(nums5, 0, nums6, 1);

        System.out.println();
        System.out.println("Example 3:");
        System.out.println(Arrays.toString(nums5));
    }
}

