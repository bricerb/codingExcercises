// Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.

public boolean scoresIncreasing(int[] scores) {
  boolean isGreater = true;
  int compInt = scores[0];
  for (int i = 0; i < scores.length; i ++) {
    if (scores[i] < compInt) {
      isGreater = false;
      break;
    }
    compInt = scores[i];
  }
  return isGreater;
}

// Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.

public boolean scores100(int[] scores) {
  boolean within100 = false;
  for (int i = 0; i < scores.length-1; i ++) {
    if (scores[i] == 100 && scores[i] == scores[i+1]) {
      within100 = true;
    }
  }
  return within100;
}

// Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.

public boolean scoresClump(int[] scores) {
  boolean adjacent = false;
  if (scores.length < 3) {
    return adjacent;
  }
  for (int i = 0; i < scores.length-2; i ++) {
    if(Math.abs(scores[i] - scores[i+1]) <= 2 && Math.abs(scores[i] - scores[i+2]) <= 2) {
      adjacent = true;
    }
  }
  return adjacent;
}

// Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger. We'll say that the second half begins at index length/2. The array length will be at least 2. To practice decomposition, write a separate helper method int average(int[] scores, int start, int end) { which computes the average of the elements between indexes start..end. Call your helper method twice to implement scoresAverage(). Write your helper method after your scoresAverage() method in the JavaBat text area. Normally you would compute averages with doubles, but here we use ints so the expected results are exact.

public int scoresAverage(int[] scores) {
  int average1 = average(scores, 0, scores.length/2);
  int average2 = average(scores, scores.length/2, scores.length);
  return Math.max(average1, average2);
}

public int average(int[] scores, int start, int end) {
  int averages = 0;
  for (int i = start; i < end; i ++) {
    averages += scores[i];
  }
  return averages / (scores.length/2);
}

// Given an array of strings, return the count of the number of strings with the given length.

public int wordsCount(String[] words, int len) {
  int count = 0;
  for (int i = 0; i < words.length; i ++) {
    if (words[i].length() == len) {
      count ++;
    }
  }
  return count;
}

// Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.

public String[] wordsFront(String[] words, int n) {
  String[] res = new String[n];
  for (int i = 0; i < n; i ++) {
    res[i] = words[i];
  }
  return res;
}

// Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.

public List wordsWithoutList(String[] words, int len) {
  ArrayList<String> res = new ArrayList<>();
  for (int i = 0; i < words.length; i ++) {
    if (!(words[i].length() == len)) {
      res.add(words[i]);
    }
  }
  return res;
}


// Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.

public boolean hasOne(int n) {
  while (n > 0) {
    if (n % 10 == 1) {
      return true;
    }
    n = n / 10;
  }
  return false;
}

// We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.

public boolean dividesSelf(int n) {
  boolean isTrue = false;
  int o = n;
  while (o > 0) {
    int j = o % 10;
    if (j == 0) {
      return false;
    }
    if (n % j == 0) {
      isTrue = true;
    } else {
      return false;
    }
    o = o / 10;
  }
  return isTrue;
}

// Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. The original array will contain at least "count" even numbers.

public int[] copyEvens(int[] nums, int count) {
  int[] res = new int[count];
  int index = 0;
  for (int i = 0; i < nums.length; i ++) {
    if (index == count) {
      break;
    }
    if (nums[i] % 2 == 0) {
      res[index] = nums[i];
      index ++;
    }
  }
  return res;
}

// We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array. Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.

public int[] copyEndy(int[] nums, int count) {
  int[] res = new int[count];
  int index = 0;
  for (int i = 0; i < nums.length; i ++) {
    boolean isTrue  = isEndy(nums[i]);
    if (index == count) {
      break;
    }
    if (isTrue) {
      res[index] = nums[i];
      index ++;
    }
  }
  return res;
}

public boolean isEndy(int n) {
  if (n >= 0 && n <= 10) {
    return true;
  } else if (n >= 90 && n <= 100) {
    return true;
  } else {
    return false;
  }
}

// Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string in the other array, the 2nd to the 2nd and so on. Count the number of times that the 2 strings are non-empty and start with the same char. The strings may be any length, including 0.

public int matchUp(String[] a, String[] b) {
  int count = 0;
  for (int i = 0; i < a.length; i ++) {
    if (a[i] != "" && b[i] != "" && a[i].charAt(0) == b[i].charAt(0)) {
      count ++;
    }
  }
  return count;
}

// The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers" array contains a student's answers, with "?" representing a question left blank. The two arrays are not empty and are the same length. Return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.

public int scoreUp(String[] key, String[] answers) {
  int res = 0;
  for (int i = 0; i < key.length; i ++) {
    if (answers[i] == "?") {
      continue;
    } else if (key[i] == answers[i]) {
      res += 4;
    } else {
      res -= 1;
    }
  }
  return res;
}

// Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.

public String[] wordsWithout(String[] words, String target) {
  int count = 0;
  for (int i = 0; i < words.length; i ++) {
    if (words[i].equals(target)) {
      continue;
    }
    count ++;
  }
  String[] res = new String[count];
  int index = 0;
  for (int i = 0; i < words.length; i ++) {
    if (words[i].equals(target)) {
      continue;
    }
    res[index] = words[i];
    index ++;
  }
  return res;
}

// Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such as 40 or 90. Return the sum of largest special score in A and the largest special score in B. To practice decomposition, write a separate helper method which finds the largest special score in an array. Write your helper method after your scoresSpecial() method in the JavaBat text area.

public int scoresSpecial(int[] a, int[] b) {
  return (findSpecial(a) + findSpecial(b));
}

public int findSpecial(int[] n) {
  int highest = 0;
  for (int i = 0; i < n.length; i ++) {
    if (n[i] > highest && n[i] % 10 == 0) {
      highest = n[i];
    }
  }
  return highest;
}

// We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6. The start end end index will both be valid indexes into the array with start <= end.

public int sumHeights(int[] heights, int start, int end) {
  int res = 0;
  for (int i = start; i < end; i ++) {
    res += Math.abs(heights[i] - heights[i+1]);
  }
  return res;
}

// (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index, however increases in height count double. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7. The start end end index will both be valid indexes into the array with start <= end.

public int sumHeights2(int[] heights, int start, int end) {
  int res = 0;
  for (int i = start; i < end; i ++) {
    if (heights[i] - heights[i+1] < 0) {
      res += Math.abs((heights[i] - heights[i+1])*2);
    } else {
      res += Math.abs(heights[i] - heights[i+1]);
    }
  }
  return res;
}

// (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the number of "big" steps for a walk starting at the start index and ending at the end index. We'll say that step is big if it is 5 or more up or down. The start end end index will both be valid indexes into the array with start <= end.

public int bigHeights(int[] heights, int start, int end) {
  int res = 0;
  for (int i = start; i < end; i ++) {
    if (Math.abs(heights[i] - heights[i+1]) >= 5) {
      res += 1;
    }
  }
  return res;
}
