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

// Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.

public int centeredAverage(int[] nums) {
  int max = nums[0];
  int min = nums[0];
  int mean = 0;
  for (int i  = 0; i < nums.length; i++) {
    max = Math.max(max, nums[i]);
    min = Math.min(min, nums[i]);
  }
  for (int i = 0; i < nums.length; i++) {
    mean += nums[i];
  }
  return (mean - (max + min)) / (nums.length - 2) ;
}

// Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

public int sum13(int[] nums) {
  int sum = 0;
  for (int i  = 0; i < nums.length; i++) {
    if (nums[i] == 13) {
      i++;
    } else {
      sum += nums[i];
    }
  }
  return sum;
}

// Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

public int sum67(int[] nums) {
  int sum = 0;
  boolean is6 = false;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 6 || is6) {
      is6 = true;
      if (nums[i] == 7) {
        is6 = false;
      }
    } else {
      sum += nums[i];
    }
  }
  return sum;
}

// Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

public boolean has22(int[] nums) {
  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] == 2 && nums[i + 1] == 2) {
      return true;
    }
  }
  return false;
}

// Given an array of ints, return true if the array contains no 1's and no 3's.

public boolean lucky13(int[] nums) {
  for (int i = 0; i< nums.length; i++) {
    if (nums[i] == 1 || nums[i] == 3) {
      return false;
    }
  }
  return true;
}

// Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

public boolean sum28(int[] nums) {
  int sum = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2) {
      sum += 2;
    }
  }
  return (sum == 8);
}

// Given an array of ints, return true if the number of 1's is greater than the number of 4's

public boolean more14(int[] nums) {
  int ones = 0;
  int fours = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 1) {
      ones++;
    }
    if (nums[i] == 4) {
      fours++;
    }
  }
  return (ones > fours);
}

// Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. The syntax to make a new int array is: new int[desired_length]

public int[] fizzArray(int n) {
  int[] res = new int[n];
  for (int i = 0; i < res.length; i++) {
    res[i] = i;
  }
  return res;
}

// Given an array of ints, return true if every element is a 1 or a 4.

public boolean only14(int[] nums) {
  boolean oneFour = true;
  for (int i = 0; i < nums.length; i++) {
    if (!(nums[i] == 1 || nums[i] == 4)) {
      oneFour = false;
    }
  }
  return oneFour;
}

// Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types. The syntax to make a new string array is: new String[desired_length] 

public String[] fizzArray2(int n) {
  String[] res = new String[n];
  for (int i = 0; i < res.length; i++) {
    res[i] = String.valueOf(i);
  }
  return res;
}

// Given an array of ints, return true if it contains no 1's or it contains no 4's.

public boolean no14(int[] nums) {
  boolean ones = true;
  boolean fours = true;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 1) {
      ones = false;
    }
    if (nums[i] == 4) {
      fours = false;
    }
  }
  return (ones || fours);
}

// We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.

public boolean isEverywhere(int[] nums, int val) {
  boolean isEverywhere = true;
  for (int i = 0; i < nums.length - 1; i++) {
    if (!(nums[i] == val || nums[i + 1] == val)) {
      isEverywhere = false;
    }
  }
  return isEverywhere;
}

// Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

public boolean either24(int[] nums) {
  boolean twos = false;
  boolean fours = false;
  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] == 2 && nums[i + 1] == 2) {
      twos = true;
    }
    if (nums[i] == 4 && nums[i + 1] == 4) {
      fours = true;
    }
  }
  if (twos && fours) {
    return false;
  }
  return twos || fours;
}

// Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.

public int matchUp(int[] nums1, int[] nums2) {
  int count = 0;
  for (int i = 0; i < nums1.length; i++) {
    if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] - nums2[i] != 0) {
      count++;
    }
  }
  return count;
}

// Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.

public boolean has77(int[] nums) {
  boolean sevens = false;
  for (int i = 0; i < nums.length - 1; i++) {
    if (i < nums.length - 2 && nums[i] == 7 && nums[i + 2] == 7) {
      sevens = true;
    }
    if (nums[i] == 7 && nums[i + 1] == 7) {
      sevens = true;
    }
  }
  return sevens;
}

// Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

public boolean has12(int[] nums) {
  boolean has1 = false;
  boolean has12 = false;
  for (int i  = 0; i < nums.length; i++) {
    if (nums[i] == 1) {
      has1 = true;
    }
    if (has1 && nums [i] == 2) {
      has12 = true;
    }
  }
  return has12;
}








