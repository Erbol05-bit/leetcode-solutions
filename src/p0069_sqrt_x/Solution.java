package p0069_sqrt_x;

class Solution {

    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.mySqrt(4));  // 2
        System.out.println(solution.mySqrt(8));  // 2
        System.out.println(solution.mySqrt(0));  // 0
        System.out.println(solution.mySqrt(16)); // 4
    }
}

