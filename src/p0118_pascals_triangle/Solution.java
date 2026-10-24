package p0118_pascals_triangle;


import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(
                            result.get(i - 1).get(j - 1)
                                    + result.get(i - 1).get(j)
                    );
                }
            }

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int numRows1 = 5;
        int numRows2 = 1;
        int numRows3 = 3;

        System.out.println("Example 1:");
        System.out.println("numRows = " + numRows1);
        System.out.println(solution.generate(numRows1));

        System.out.println();

        System.out.println("Example 2:");
        System.out.println("numRows = " + numRows2);
        System.out.println(solution.generate(numRows2));

        System.out.println();

        System.out.println("Example 3:");
        System.out.println("numRows = " + numRows3);
        System.out.println(solution.generate(numRows3));
    }
}

