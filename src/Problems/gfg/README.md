 Missing Number in Array
--------------------------
***

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
***

We know there will be `1 - N` numbers, so we can grab the numbers and check if it exists in the `Array` using `Linear Search`.

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

**Time Complexity** : `0(n^2)` (in worst case (if element is not in the `arr`,
                             and is hypothetical cause if ele is found in the beginning of the `arr`, then the second loop
                            just doesn't run completely).

**Space Complexity** : `0(1)`