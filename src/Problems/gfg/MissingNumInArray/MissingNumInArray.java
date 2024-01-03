package Problems.gfg.MissingNumInArray;

public class MissingNumInArray {
  public static void main(String[] args) {
    System.out.println("hello");
    int[] arr = {1, 2, 3, 5};
    int n = 5;
    int response = missingNumber(arr, n);
    System.out.println("The missing num is: " + response);
  }

  // Brute force soln:
  // Time Complexity -> 0(n^2) (in worst case(if ele is not in the arr,
  //                             and is hypothetical cause if ele is found in the beg, then the
  // second
  //                            just doesn't run completely).
  // Space Complexity -> 0(1)

  /*  int missingNumber(int[] arr, int n) {
   *   // Outer loop that runs from 1 to N
   *   for (int i = 1; i <= n; i++) {
   *      // flag variable to check
   *     //  if an element exists
   *      int flag = 0;
   *      //Search the element using linear search
   *      for (int j = 0; j < arr.length; j++) {
   *          // i is present in the array
   *          if (arr[j] == i) {
   *              flag = 1;
   *              break;
   *          }
   *      }
   *      if (flag == 0) {
   *          return i; // Once the missing number is found, break the loop
   *      }
   *  }
   *  return -1;
   * }
   */
  static int missingNumber(int[] arr, int n) {
    int[] hash = new int[n + 1]; // hash array

    // Storing the freq
    for (int i = 0; i < n - 1; i++) {
      hash[arr[i]]++;
    }

    // checking the frequencies for num 1 - N:
    for (int i = 1; i <= n; i++) if (hash[i] == 0) return i; // found the missing num

    return -1;
  }
}
