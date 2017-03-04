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

























