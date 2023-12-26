 Missing Number in Array
--------------------------


Given an array of size `N-1` such that it only contains distinct integers in the range of `1 to N`. Find the missing element.

*Example 1*:

```
Input:
N = 5
A[] = {1,2,3,5}
Output: 4
```

*Example 2*:

```
Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9
```

**Your Task:**

You don't need to read input or print anything. Complete the function `MissingNumber()` that takes array and N as input  parameters and returns the value of the missing number.

**Expected Time Complexity:** ``O(N)`` <br>
**Expected Auxiliary Space:** ``O(1)``

***

Brute Force Approach
--------------------


We know there will be `1 - N` numbers, so we can grab the numbers and check if it exists in the `Array` using `Linear Search`.

Approach:

The algorithm steps are as follows:

1) We will run a loop(say `i`) from `1 - N`.
2) For each integer, `i`, we will try to find it in the given array using linear search.
   1) For that, we will run another loop to iterate over the array and consider a `flag` variable to indicate if the element exists in the array. `flag = 1` means the element is present and `flag = 0` means the element is missing.
   2) Initially, the `flag` value will be set to `0`. While iterating the array, if we find the element, we will set the `flag` to `1` and `break` out from the loop.
   Now, for any number i, if we cannot find it, the flag will remain 0 even after iterating the whole array and we will return the number.


*Psuedo Code:*

```
int temp = 0;
for (int i = 1; i <= N; i++) {
   int flag = 0;
   for (int j = 0; j < N - 1; j++) {
        if (arr[j] == i) {
            flag = 1;
            break;
        }
   }
   
   if (flag == 0) {
        return i;
   }
    
}
```

**Dry run**:

Assume given `array = {1, 3}` and `N = 3`.

**Note**: For each number, before starting the linear search, we set the `flag` to `0`.
```text
For i = 1, flag = 0
We will try to find 1 in the array using linear search and in the first index, we can find it and the flag will be 1. So, it is not the missing number.

For i = 2, flag = 0
We will try to find 2 in the given array using linear search. But number 2 is not present and the flag will remain 0. So, we will return 2 as it is the missing number.
```
**Complexity Analysis**

**Time Complexity** : `0(N^2)`, where N = size of the `array+1`. <br>
**Reason**: In the worst case i.e. if the missing number is `N` itself, the outer loop will run for `N` times, and for every single number the inner loop will also run for approximately `N` times. So, the total time complexity will be `O(N2)`.

**Space Complexity** : `0(1)` - as we are not using any extra space.