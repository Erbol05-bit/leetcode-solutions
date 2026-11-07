package p1822_sign_of_the_product_of_an_array;

class Solution {

    public int arraySign(int[] nums) {
        int sign = 1;

        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) sign = -sign;
        }

        return sign;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums1 = {-1, -2, -3, -4, 3, 2, 1};
        System.out.println(solution.arraySign(nums1));

        int[] nums2 = {1, 5, 0, 2, -3};
        System.out.println(solution.arraySign(nums2));

        int[] nums3 = {-1, 1, -1, 1, -1};
        System.out.println(solution.arraySign(nums3));

        int[] nums4 = {1, 2, 3, 4};
        System.out.println(solution.arraySign(nums4));

        int[] nums5 = {-1};
        System.out.println(solution.arraySign(nums5));
    }
}
