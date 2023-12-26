package Problems.gfg;

public class MissingNumInArray {
    public static void main(String[] args) {
        System.out.println("hello");
        int[] arr = {1,2,3,5};
        int n = 5;
        int response = missingNumber(arr, n);
        System.out.println("The missing num is: " + response);
    }


    // Brute force soln:
    // Time Complexity -> 0(n^2) (in worst case(if ele is not in the arr,
    //                             and is hypothetical cause if ele is found in the beg, then the second
    //                            just doesn't run completely).
    // Space Complexity -> 0(1)

    /*  int missingNumber(int[] arr, int n) {
     *   for (int i = 1; i <= n; i++) {
     *      int flag = 0; // Move the flag initialization inside the outer loop
     *      for (int j = 0; j < arr.length; j++) { // Also, iterate until arr.length, not arr.length - 1
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
        for (int i = 1; i <= n; i++) {
            int flag = 0; // Move the flag initialization inside the outer loop
            for (int j = 0; j < arr.length; j++) { // Also, iterate until arr.length, not arr.length - 1
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i; // Once the missing number is found, break the loop
            }
        }
        return -1;
    }

}
