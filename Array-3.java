// Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)

public int maxSpan(int[] nums) {
  int counter = 0;
  int currentNum = 0;
  int lastIndex = 0;
  for (int i = 0; i < nums.length; i ++) {
    currentNum = nums[i];
    for (int j = nums.length-1; j >= i; j --) {
      if (nums[j] == currentNum) {
        lastIndex = j+1;
        break;
      }
    }
    if (lastIndex - i >= counter) {
      counter = lastIndex - i;
    }
  }
  return counter;
}

// Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

public int[] fix34(int[] nums) {
  int last4 = 0;
  for (int i = 0; i < nums.length; i ++) {
    if (nums[i] == 3) {
      for (int j = last4; j < nums.length; j ++) {
        if (nums[j] == 4) {
          int temp = nums[i+1];
          nums[i+1] = nums[j];
          nums[j] = temp;
          last4 = j;
          break;
        }
      }
    }
  }
  return nums;
}































