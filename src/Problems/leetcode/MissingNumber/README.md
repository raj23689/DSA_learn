268. Missing Number
--------------------

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return _the only number in the range that is missing from the array_.

_Example 1:_

```text
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
```

_Example 2:_

```text
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
```

_Example 3:_

```text
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
```

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

Better Approach (using Hashing):
--------------------------------

Using the hashing technique, we will store the frequency of each element of the given array. Now, the number( i.e. between 1 to N) for which the frequency will be 0, will be returned.

**Approach**:

The algorithm steps are as follows:

- The range of the number is `1 to N`. So, we need a hash array of size `N+1` (_as we want to store the frequency of `N` as well_).
- Now, for each element in the given array, we will store the frequency in the hash array.
  After that, for each number between 1 to N, we will check the frequencies. And for any number, if the frequency is 0, we will return it.


**Dry run**:

Assume the given `array = {1,3}` and `N = 3`. The hash array will look like the following:


![7](https://github.com/raj23689/DSA_learn/assets/92665411/11598fcb-7398-49cd-b02b-bc83f3450e3b)

We can clearly see that for index `2` the frequency is `0` and so `2` is our answer.

_Pseudo Code_:

```text
hash[n+1] = {0};

storing the frequencies
for(i = 0; i < n; i++) {
    {
        hash[arr[i]]++;
    }
}
// Check the frequencies for num
// 1 to N
for (i -> n) {
    if (hash[i] == 0) {
         return i; // found the num
    }
}
   
```

**Complexity Analysis**

**Time Complexity**: `O(N) + O(N)` `~ O(2*N)`, where `N = size of the array+1`.

_Reason_: For storing the frequencies in the hash array, the program takes `O(N)` time complexity and for checking the frequencies in the second step again `O(N)` is required. So, the total time complexity is `O(N) + O(N)`.


**Space Complexity** : `O(N)`, where `N = size of the array+1`. Here we are using an extra hash array of size `N+1`.

 