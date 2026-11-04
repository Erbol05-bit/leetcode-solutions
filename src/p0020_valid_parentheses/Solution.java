package p0020_valid_parentheses;


import java.util.Stack;

class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (c == ')' && top != '(' ||
                        c == '}' && top != '{' ||
                        c == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([])";
        String s5 = "([)]";

        System.out.println("Example 1:");
        System.out.println("Input: " + s1);
        System.out.println("Output: " + solution.isValid(s1));

        System.out.println();

        System.out.println("Example 2:");
        System.out.println("Input: " + s2);
        System.out.println("Output: " + solution.isValid(s2));

        System.out.println();

        System.out.println("Example 3:");
        System.out.println("Input: " + s3);
        System.out.println("Output: " + solution.isValid(s3));

        System.out.println();

        System.out.println("Example 4:");
        System.out.println("Input: " + s4);
        System.out.println("Output: " + solution.isValid(s4));

        System.out.println();

        System.out.println("Example 5:");
        System.out.println("Input: " + s5);
        System.out.println("Output: " + solution.isValid(s5));
    }
}
