// Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

public int countEvens(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0) {
      count++;
    }
  }
  return count;
}

// iven an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

public int bigDiff(int[] nums) {
  int max = nums[0];
  int min = nums[0];
  for (int i = 0; i < nums.length; i++) {
    max = Math.max(max, nums[i]);
    min = Math.min(min, nums[i]);
  }
  return max - min;
}
