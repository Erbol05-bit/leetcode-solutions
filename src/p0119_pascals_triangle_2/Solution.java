package p0119_pascals_triangle_2;


import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        result.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = result.size() - 1; j > 0; j--) {
                result.set(j, result.get(j) + result.get(j - 1));
            }

            result.add(1);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int rowIndex1 = 3;
        int rowIndex2 = 0;
        int rowIndex3 = 1;

        System.out.println("Example 1:");
        System.out.println(solution.getRow(rowIndex1));

        System.out.println();

        System.out.println("Example 2:");
        System.out.println(solution.getRow(rowIndex2));

        System.out.println();

        System.out.println("Example 3:");
        System.out.println(solution.getRow(rowIndex3));
    }
}

