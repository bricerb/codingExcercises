// Given a string, return a string where for every char in the original, there are two chars.

public String doubleChar(String str) {
  StringBuilder newStr = new StringBuilder();
  char[] chars = str.toCharArray();
  for (char c : chars) {
    newStr.append(c);
    newStr.append(c);
  }
  return newStr.toString();
}

// Return the number of times that the string "hi" appears anywhere in the given string.

public int countHi(String str) {
  int counter = 0;
  for (int i = 0;  i < str.length() - 1; i++) {
    if (str.substring(i, i + 2).equals("hi")) {
      counter++;
    }
  }
  return counter;
}

// Return true if the string "cat" and "dog" appear the same number of times in the given string.