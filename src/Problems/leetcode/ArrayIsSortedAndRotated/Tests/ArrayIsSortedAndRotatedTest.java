package Problems.leetcode.ArrayIsSortedAndRotated.Tests;

import Problems.leetcode.ArrayIsSortedAndRotated.Solution;

public class ArrayIsSortedAndRotatedTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        test(solution, new int[]{2, 1}, true);
        test(solution, new int[]{2, 4, 1, 3}, false);
        test(solution, new int[]{2, 1, 2, 2, 2}, true;
        test(solution, new int[]{6, 7, 2, 7, 5}, false);
        test(solution, new int[]{7, 9, 1, 1, 1, 3}, true);
        test(solution, new int[]{10, 10, 1, 4, 5, 10}, true);

        test(solution, new int[]{
                4,6,9,9,10,13,13,14,14,14,15,15,15,15,16,16,18,18,19,20,20,22,22,
                22,24,25,25,27,27,28,28,31,31,33,34,36,36,36,39,40,41,41,42,42,
                44,47,50,52,53,53,55,55,56,63,63,70,71,72,72,74,76,76,77,79,80,
                80,80,81,84,84,85,85,88,88,89,89,89,90,91,92,93,93,94,94,94,96,
                97,97,97,97,98,99,99,100,1,1,1,2,2,4
        }, true);

        test(solution, new int[]{
                38,8,53,18,57,44,56,58,57,93,56,12,89,75,37,45,57,40,67,100,6,92,
                100,87,47,67,47,38,16,21,48,29,21,61,29,84,9,23,43,22,84,50,7,21,
                70,31,30,22,2,76,33,25,11,51,74,95,94,2,50,49,55,43,93,60,44,97,
                52,1,63,97,66,20,84,4,85,14,85,18,15,26,51,70,52,8,95,84,37,4,41,
                97,96,17,20,98,34,70,93,83,81,62
        }, false);
    }

    static void test(Solution solution, int[] arr, boolean expected) {
        boolean result = Solution.check(arr);
        System.out.println("Input: " + java.util.Arrays.toString(arr));
        System.out.println("Expected: " + expected + ", Got: " + result);
        System.out.println(result == expected ? "✅ PASS\n" : "❌ FAIL\n");
    }
}
