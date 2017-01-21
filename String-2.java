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

// Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

public boolean xyzThere(String str) {
  if (str.length() < 3) {
    return false;
  }
  for (int i = 0; i < str.length() - 2; i++) {
    if (!(str.substring(i, i + 1).equals("."))) {
      if (str.substring(i, i + 3).equals("xyz")) {
        return true;
      }
    } else {
      i++;
    }
  }
  return false;
}

// Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

public boolean bobThere(String str) {
  if (str.length() < 3) {
    return false;
  }
  for (int i = 0; i < str.length() - 2; i++) {
    if (str.substring(i, i+1).equals("b")) {
      if (str.substring(i+2, i+3).equals("b")) {
        return true;
      }
    }
  }
  return false;
}

// We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

public boolean xyBalance(String str) {
  boolean balanced = true;
  boolean isX = false;
  for (int i = 0; i < str.length(); i++) {
    if (str.substring(i, i+1).equals("x")) {
      isX = true;
    }
    if (str.substring(i, i+1).equals("y") && isX) {
      balanced = true;
    }
    if (str.substring(i, i+1).equals("x") && balanced) {
      balanced = false;
    }
  }
  return balanced;
}

// Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

public String mixString(String a, String b) {
  if (a.length() == 0) {
    return b;
  }
  if (b.length() == 0) {
    return a;
  }
  char[] aChar = a.toCharArray();
  char[] bChar = b.toCharArray();
  StringBuilder res = new StringBuilder();
  if (a.length() > b.length()) {
    for (int i = 0; i < b.length(); i++) {
      res.append(aChar[i]);
      res.append(bChar[i]);
    if (i == b.length() - 1) {
      for (int j = i + 1; j < a.length(); j++) {
        res.append(aChar[j]);
      }
    }
    }
  } else {
    for (int i = 0; i < a.length(); i++) {
      res.append(aChar[i]);
      res.append(bChar[i]);
    if (i == a.length() - 1) {
      for (int j = i + 1; j < b.length(); j++) {
        res.append(bChar[j]);
      }
    }
    }
  }
  return res.toString();
}

// Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.

public String repeatEnd(String str, int n) {
  StringBuilder res = new StringBuilder();
  for (int i = 0; i < n; i++) {
    res.append(str.substring(str.length() - n));
  }
  return res.toString();
}

// Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

public String repeatFront(String str, int n) {
  StringBuilder res = new StringBuilder();
  for (int i = n; i >= 0; i--) {
    res.append(str.substring(0, i));
  }
  return res.toString();
}

// Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

public String repeatSeparator(String word, String sep, int count) {
  if (count == 0) {
    return "";
  }
  StringBuilder res = new StringBuilder();
  res.append(word);
  for (int i = 1; i < count; i++) {
    res.append(sep);
    res.append(word);
  }
  return res.toString();
}

// ALTERNATIVE -- Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

public String repeatSeparator(String word, String sep, int count) {
  StringBuilder res = new StringBuilder();
  for (int i = 0; i < count; i++) {
    res.append(word);
    if (!(i == count - 1)) {
      res.append(sep);
    }
  }
  return res.toString();
}

// Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

public boolean prefixAgain(String str, int n) {
  boolean res = false;
  String comparor = str.substring(0, n);
  for (int i = n; i <= str.length()-n; i++) {
    if (str.substring(i, i+n).equals(comparor)) {
      res = true;
    }
  }
  return res;
}

// Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

public boolean xyzMiddle(String str) {
  if (str.length() < 3) {
    return false;
  }
  if (str.equals("xyz")) {
    return true;
  }
  for (int i = 0; i < str.length() - 2; i++) {
    if (str.substring(i, i + 3).equals("xyz")) {
      int pre = i;
      int suf = i + 3;
      if (Math.abs(pre - (str.length() - suf)) <= 1) {
        return true;
      }
    }
  }
  return false;
}

// A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

public String getSandwich(String str) {
  if (str.length() < 10) {
    return "";
  }
  for (int i = 0; i < str.length(); i++) {
    if (str.substring(i, i + 5).equals("bread")) {
      for (int j = str.length(); j > i; j--) {
        if (str.substring(j - 5, j).equals("bread")) {
          return str.substring(i + 5, j - 5);
        }
      }
    }
  }
  return "";
}

// Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

public boolean sameStarChar(String str) {
  boolean res = true;
  if (str.length() < 3) {
    return true;
  }
  for (int i = 1; i < str.length() - 1; i++) {
    if (str.substring(i, i + 1).equals("*")) {
      if (str.substring(i -1, i).equals(str.substring(i + 1, i + 2))) {
        res = true;
      } else {
        return false;
      }
    }
  }
  return res;
}

// Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

public String oneTwo(String str) {
  StringBuilder res = new StringBuilder();
  for (int i = 0; i < str.length() - 2; i +=3) {
    if (str.length() - i < 3) {
      res.append(str.substring(i, str.length()));
    } else {
      res.append(str.substring(i + 1, i + 3));
      res.append(str.substring(i, i + 1));
    }
  }
  return res.toString();
}




