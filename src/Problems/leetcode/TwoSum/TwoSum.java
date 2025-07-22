package Problems.leetcode.TwoSum;

import java.util.Arrays;

public class TwoSum {
  public static void main(String[] args) {
    int[] nums = new int[] {3, 2, 4};
    int target = 6;
    int[] targetArr = {1, 2};
    System.out.println(
        "Result: "
            + Arrays.toString(Solution.twoSum(nums, target))
            + "Expected: "
            + Arrays.toString(targetArr));
  }
}

class Solution {
  public static int[] twoSum(int[] nums, int target) {
    int i;
    int j;
    for (i = 0; i < nums.length; i++) {
      for (j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] {i, j};
        }
      }
    }
    return new int[] {-1, -1};
  }
}
// TODO: Use pair Class to modify the above for O(n log n) TC
// NOTE: Use Hashmap later after learning it.