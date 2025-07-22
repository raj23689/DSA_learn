package Problems.gfg.LargestElement;

public class LargestElement {
  public static void main(String[] args) {
    int[] arr = {3, 3, 6, 1};
    int[] arr2 = {3, 3, 0, 99, -40};
    int[] arr3 = {8, 8, 7, 6, 5};
    int[] arr4 = {10, 10, 10, 10, 10};
    System.out.println("Largest: " + Solution.largest(arr3));
  }
}

class Solution {
  public static int largest(int[] arr) {

    if (arr == null || arr.length == 0) {
      return 0;
    }

    int largest = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }

    return largest;
  }
}
