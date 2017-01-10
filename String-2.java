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

public boolean catDog(String str) {
  int countCat = 0;
  int countDog = 0;
  if (str.length() >= 3) {
    for (int i = 0; i < str.length() - 1; i ++) {
      if (!(i + 2 > str.length() - 1)) {
        if (str.substring(i, i + 3).equals("cat")) {
          countCat ++;
        }
        if (str.substring(i, i + 3).equals("dog")) {
          countDog ++;
        }
      }
    }
  }
  return (countCat == countDog);
}

// Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

public int countCode(String str) {
  int count = 0;
  for (int i = 0; i < str.length() - 1; i ++) {
    if (i + 3 < str.length()) {
      if (str.substring(i, i+2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
        count ++;
      }
    }
  }
  return count;
}

// Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  if (a.length() > b.length()) {
    if (a.substring(a.length() - b.length()).equals(b)){
      return true;
    } else {
      return false;
    }
  } else {
    if (b.substring(b.length() - a.length()).equals(a)) {
      return true;
    } else {
      return false;
    }
  }
}
















