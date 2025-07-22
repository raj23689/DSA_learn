## 1: Two Sum

Given an array of integers `nums` and an integer `target`, return **indices of the two numbers** such that they add up to `target`.

- You may assume that each input would have **exactly one solution**, and **you may not use the same element twice**.
- You can return the answer in **any order**.

---

### Examples

#### Example 1:
**Input:**  
`nums = [2, 7, 11, 15]`, `target = 9`  
**Output:**  
`[0, 1]`  
**Explanation:**  
Because `nums[0] + nums[1] == 9`, we return `[0, 1]`.

---

#### Example 2:
**Input:**  
`nums = [3, 2, 4]`, `target = 6`  
**Output:**  
`[1, 2]`

---

#### Example 3:
**Input:**  
`nums = [3, 3]`, `target = 6`  
**Output:**  
`[0, 1]`

---

### Constraints

- `2 <= nums.length <= 10⁴`
- `-10⁹ <= nums[i] <= 10⁹`
- `-10⁹ <= target <= 10⁹`
- **Only one valid answer exists.**

---
# NOTE:— Do the above in pair (later) and Hashmap after learning them.

---

# Confusion Logic Explained:

## 🔍 Why does `j = i + 1` work?

In this loop:

```java
for (i = 0; i < nums.length; i++) {
    for (j = i + 1; j < nums.length; j++) {}
```
You're doing exactly what the problem expects:

For every index `i`, you're checking all the elements after it `(j = i + 1)` to find a pair that adds up to target.

This avoids repeating combinations and ensures you're not adding the same element to itself.

### ✅ Example
For `nums = [2, 7, 11, 15]`, and `target = 9`:

Outer loop: `i = 0`, `nums[i] = 2`

Inner loop: `j = 1`, `nums[j] = 7`

So `2 + 7 = 9` → ✅ Match!

---

## 🧨 Why doesn't j = i work?
If you write:

```java
for (j = i; j < nums.length; j++) {
```
Then on the first comparison, you're doing:

```java
nums[i] + nums[j] → nums[i] + nums[i]
```
This means you're adding the same element to itself, which violates the constraint:

> __"You may not use the same element twice."__

### ❌ Example failure
With `nums = [2, 7, 11, 15]`, and `target = 9`:

Outer loop: `i = 0`, `nums[i] = 2`

Inner loop: `j = 0`, `nums[j] = 2`

So `2 + 2 = 4` → ❌ Not a match

It misses the valid pair `(0, 1)` because `i == j` is __invalid__

---

### ✅ Correct logic

You should always start `j` from `i + 1` to:

- Avoid using the same element twice
- Avoid repeating earlier combinations (e.g., checking both `(i, j)` and `(j, i)`)


### 📊 Summary Table

| Version     | Behavior                       | Correct? |
|-------------|--------------------------------|----------|
| `j = i + 1` | Checks only distinct pairs     | ✅ Yes    |
| `j = i`     | May use the same element twice | ❌ No     |





