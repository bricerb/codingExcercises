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

// (This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.

public int[] fix45(int[] nums) {
  int last4 = 0;
  for (int i = 0; i < nums.length; i ++) {
    if (nums[i] == 5) {
      for (int j = last4; j < nums.length; j ++) {
        if (nums[j] == 4 && !(nums[j+1] == 5)) {
          int temp = nums[j+1];
          nums[j+1] = nums[i];
          nums[i] = temp;
          break;
        }
      }
    }
  }
  return nums;
}

// Solution for fix45 without index;

// public int[] fix45(int[] nums) {
// 	for(int i=0;i<nums.length-1;i++){
// 		if(nums[i]==4 &&nums[i+1]!=5){
// 			for(int j=0;j<nums.length;j++){
// 				if(nums[j]==5 && j==0){
// 					nums[0]=nums[i+1];
// 					nums[i+1]=5;
// 				}
// 				if(nums[j]==5 && nums[j-1]!=4){
// 					nums[j]=nums[i+1];
// 					nums[i+1]=5;
// 					break;
// 				}
// 			}
// 		}
// 	}
// return nums;
// }

// Solution for fix45 without index or break;

// public int[] fix45(int[] nums) {
// 	for(int i=0;i<nums.length-1;i++){
// 		if(nums[i]==4 &&nums[i+1]!=5){
// 			for(int j=0;j<nums.length;j++){
// 				if(nums[j]==5 && j==0){
// 					nums[0]=nums[i+1];
// 					nums[i+1]=5;
// 				}
// 				if(nums[j]==5 && nums[j-1]!=4){
// 					nums[j]=nums[i+1];
// 					nums[i+1]=5;
// 				}
// 			}
// 		}
// 	}
// return nums;
// }

// Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

public boolean canBalance(int[] nums) {
  int before = 0;
  int after = 0;
  for (int i = 0; i < nums.length; i ++) {
    after += nums[i];
  }
  for (int i = 0; i < nums.length; i ++) {
    before += nums[i];
    after -= nums[i];
    if (before ==  after) {
      return true;
    }
  }
  return false;
}

// Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

public boolean linearIn(int[] outer, int[] inner) {
  boolean inside = false;
  int index = 0;
  int count = 0;
  for (int i = 0; i < inner.length; i ++) {
    for (int j = index; j < outer.length; j ++) {
      if (outer[j] == inner[i]) {
        index  = j;
        count ++;
        break;
      }
    }
  }
  return (count == inner.length);
}

// Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

public int[] squareUp(int n) {
  int[] nums = new int[n];
  for (int i = 0; i < nums.length; i ++) {
    nums[i] = i+1;
  }
  int[] res = new int[n*n];
  int numsIndex = n-1;
  for (int i = res.length-1; i >= 0; i -= n) {
    for (int j = 0; j < n; j ++) {
      res[i-j] = nums[j];
    }
    nums[numsIndex] = 0;
    numsIndex --;
  }
  return res;
}



























