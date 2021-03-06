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

// Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

public boolean modThree(int[] nums) {
  boolean mod3 = false;
  if (nums.length < 3) {
    return mod3;
  }
  for (int i = 0; i < nums.length - 2; i++) {
    if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
      mod3 = true;
    }
    if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
      mod3 = true;
    }
  }
  return mod3;
}

// Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

public boolean haveThree(int[] nums) {
  boolean has3 = false;
  int count3 = 0;
  for (int i = 0; i < nums.length ; i++) {
    if (i < nums.length - 1 && nums[i] == 3 && nums[i + 1] == 3) {
      return false;
    }
    if (nums[i] == 3) {
      count3++;
    }
  }
  if (count3 == 3) {
    has3 = true;
  }
  return has3;
}

// Given an array of ints, return true if every 2 that appears in the array is next to another 2.

public boolean twoTwo(int[] nums) {
  boolean twos = true;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2) {
      if (i < nums.length - 2 && nums[i + 1] == 2) {
        twos = true;
      } else if (i > 0 && nums[i - 1] == 2) {
        twos = true;
      } else {
        twos = false;
      }
    }
  }
  return twos;
}

// Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive

public boolean sameEnds(int[] nums, int len) {
  boolean sameEnds = true;
  int[] last = new int[len];
  for (int i = 0; i < len; i ++) {
    last[i] = nums[nums.length - len + i];
  }
  for (int i = 0; i < last.length; i++) {
    if (nums[i] == last[i]) {
      sameEnds = true;
    } else {
      return false;
    }
  }
  return sameEnds;
}

// Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

public boolean tripleUp(int[] nums) {
  boolean triple = false;
  if (nums.length < 3) {
    return triple;
  }
  for (int i = 0; i < nums.length - 2; i++) {
    if (nums[i + 1] - nums[i] == 1 &&  nums[i + 2] - nums[i + 1] == 1) {
      triple = true;
    }
  }
  return triple;
}

// Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number. Note that a length-0 array is valid.

public int[] fizzArray3(int start, int end) {
  int[] nums = new int[end - start];
  for (int i = 0; i < nums.length; i++) {
    nums[i] = start + i;
  }
  return nums;
}

// Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.

public int[] shiftLeft(int[] nums) {
  int[] newNums = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    if (i == nums.length - 1) {
      newNums[i] = nums[0];
    } else {
      newNums[i] = nums[i + 1];
    }
  }
  return newNums;
}

// For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

public int[] tenRun(int[] nums) {
  int[] newNums = new int[nums.length];
  boolean hasTemp = false;
  int temp = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 10 == 0) {
      temp = nums[i];
      hasTemp = true;
    }
    if (hasTemp == false) {
      newNums[i] = nums[i];
    } else {
      newNums[i] = temp;
    }
  }
  return newNums;
}

// Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

public int[] pre4(int[] nums) {
  int[] res = null;
  for (int i = 0; i < nums.length; i++) {
     if (nums[i] == 4) {
       res = new int[i];
       break;
     }
  }
  for (int i = 0; i < res.length; i++) {
    res[i] = nums[i];
  }
  return res;
}

// Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

public int[] post4(int[] nums) {
  int[] res = null;
  int tempIndex = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      tempIndex = i;
    }
  }
  res = new int[nums.length - tempIndex - 1];
  for (int i = 0; i < res.length; i++) {
    res[i] = nums[nums.length - res.length + i];
  }
  return res;
}

// We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.

public int[] notAlone(int[] nums, int val) {
  int[] res = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    boolean same = false;
    if (i > 0 && nums[i] == nums[i-1] || i < nums.length-1 && nums[i] == nums[i+1]) {
      same = true;
    }
    res[i] = nums[i];
    if (!same) {
      if (i > 0 && i < nums.length-1 && res[i] < nums[i-1]) {
        res[i] = nums[i-1];
      }
      if (i > 0 && i < nums.length-1 && res[i] < nums[i+1]) {
        res[i] = nums[i+1];
      }
    }
  }
  return res;
}

// Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.

// public int[] zeroFront(int[] nums) {
//   while(true){
//     boolean didSwitch = false;
//     for(int i = 0; i < nums.length; i ++) {
//       if (nums[i] == 0) {
//         if (i > 0 && nums[i-1] != 0) {
//           didSwitch = true;
//           nums[i] = nums[i-1];
//           nums[i-1] = 0; 
//         }
//       }
//     }
//     if (!didSwitch) {
//       break;
//     }
//   }
//   return nums;
// }

public int[] zeroFront(int[] nums) {
  int count = 0;
  if (nums.length == 0) {
    return nums;
  }
  while (nums[count] == 0) {
    count ++;
  }
  for (int i = nums.length-1; i >= count; i --) {
    if (nums[i] == 0) {
      nums[i] = nums[count];
      nums[count] = 0;
      count ++;
    }
  }
  return nums;
}

// Return a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.

// public int[] withoutTen(int[] nums) {
//   for (int i = 0; i < nums.length; i ++) {
//     if (nums[i] == 10) {
//       for (int j = i; j < nums.length - 1; j ++) {
//         nums[j] = nums[j + 1];
//       }
//       nums[nums.length-1] = 0;
      
//       if (nums[i] == 10) {
//         i --;
//       }
//     }
//   }
//   return nums;
// }

public int[] withoutTen(int[] nums) {
  for (int i = 0; i < nums.length; i ++) {
    if (nums[i] == 10) {
      for (int j = i; j < nums.length - 1; j ++) {
        nums[j] = nums[j + 1];
      }
      nums[nums.length-1] = 0;
      if (nums[i] == 10) {
        i --;
      }
    }
  }
  return nums;
}

// Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.

public int[] zeroMax(int[] nums) {
  int[] res = new int[nums.length];
  int temp = 0;
  for (int i = nums.length-1; i >= 0; i --) {
    if (nums[i] == 0) {
      res[i] = temp;
    } else {
      if (nums[i] > temp && nums[i] % 2 == 1) {
        temp = nums[i];
      }
      res[i] = nums[i];
    }
    
  }
  return res;
}

// Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.

public int[] evenOdd(int[] nums) {
  int count = 0;
  for (int i = nums.length-1; i >= count; i --) {
    if (nums[count] % 2 == 0) {
      count ++;
      i ++;
      continue;
    }
    if (nums[i] % 2 == 0) {
      int temp = nums[count];
      nums[count] = nums[i];
      nums[i] = temp;
    }
  }
  return nums;
}

// Consider the series of numbers beginning at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int or other type. This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.

public String[] fizzBuzz(int start, int end) {
  int len = end-start;
  String[] res = new String[len];
  int currentNum = start;
  for (int i = 0; i < len; i ++) {
    StringBuilder sb = new StringBuilder();
    if (currentNum % 3 == 0) {
      sb.append("Fizz");
    }
    if (currentNum % 5 == 0) {
      sb.append("Buzz");
    }
    if (sb.toString().length() == 0) {
      sb.append(String.valueOf(currentNum));
    }
    res[i] = sb.toString();
    currentNum ++;
  }
  return res;
}



