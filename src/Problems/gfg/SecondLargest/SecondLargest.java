package Problems.gfg.SecondLargest;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {3, 3, 6, 1};
        int[] arr2 = {3, 3, 0, 99, -40};
        int[] arr3 = {8, 8, 7, 6, 5};
        int[] arr4 = {10, 10, 10, 10, 10};
        System.out.println("Second Largest: " + Solution.getSecondLargest(arr3));
        System.out.println("Second Largest: " + Solution.getSecondLargest(arr4));
    }
}

class Solution {
  public static int getSecondLargest(int[] arr) {

    if (arr == null || arr.length == 0) {
      return 0;
    }

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : arr) {
      if (num > largest) {
        secondLargest = largest;
        largest = num;
      } else if (num > secondLargest && num < largest) {
        secondLargest = num;
      }
    }

    // Handle a case where all elements are equal
    if (secondLargest == Integer.MIN_VALUE) {
      return -1;
    }

    return secondLargest;
  }
}
