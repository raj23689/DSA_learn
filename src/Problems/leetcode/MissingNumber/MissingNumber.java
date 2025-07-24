package Problems.leetcode.MissingNumber;

/// Problem 268 Missing Number
public class MissingNumber {
  public static void main(String[] args) {
    int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
    int response = missingNumber(arr);
    System.out.println("The missing num is: " + response);
  }

  public static int missingNumber(int[] nums) {
    int[] hash = new int[nums.length + 1];

    for (int num : nums) hash[num]++;

    for (int i = 0; i <= nums.length; i++) if (hash[i] == 0) return i;

    return -1;
  }
}
