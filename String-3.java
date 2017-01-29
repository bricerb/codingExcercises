// Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

public int countYZ(String str) {
  int counter = 0;
  for (int i = 0; i < str.length(); i++) {
    if ((Character.toLowerCase(str.charAt(i)) == 'y' || Character.toLowerCase(str.charAt(i)) == 'z') && i < str.length()) {
      if (i + 1 == str.length() || !Character.isLetter(str.charAt(i + 1))) {
       counter++;
      }
    }
  }
  return counter;
}

// Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

public String withoutString(String base, String remove) {
  StringBuilder sb = new StringBuilder();
  for (int i = 0; i < base.length(); i++) {
    if (i + remove.length() <= base.length()) {
      if (base.substring(i, i + remove.length()).toLowerCase().equals(remove.toLowerCase())) {
        i += remove.length() - 1;
        continue;
      }
    }
    sb.append(base.charAt(i));
  }
  return sb.toString();
}

// Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

public boolean equalIsNot(String str) {
  int is = 0;
  int not = 0;
  for (int i = 0; i < str.length(); i++) {
    if (i + 2 <= str.length() && str.substring(i, i + 2).equals("is")) {
      is ++;
    }
    if (i + 3 <= str.length() && str.substring(i, i + 3).equals("not")) {
      not ++;
    }
  }
  return (is == not);
}

// We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.

public boolean gHappy(String str) {
  boolean isHappy = true;
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'g' && i + 1 < str.length() && str.charAt(i + 1) == 'g') {
      isHappy = true;
    } else if (str.charAt(i) == 'g' && i - 1 >= 0 && str.charAt(i - 1) == 'g') {
      isHappy = true;
    } else if (str.charAt(i) == 'g') {
      isHappy = false;
    }
  }
  return isHappy;
}

// We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.

public int countTriple(String str) {
  int len = str.length();
  int count = 0;
  for (int i = 0; i < len - 2; i++) {
    char tmp = str.charAt(i);
    if (tmp == str.charAt(i + 1) && tmp == str.charAt(i + 2)) {
      count++;
    }
  }
  return count;
}

// Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

public int sumDigits(String str) {
  int res = 0;
  for (int i = 0; i < str.length(); i++) {
    if (Character.isDigit(str.charAt(i))) {
      res += Integer.parseInt(str.substring(i, i + 1));
    }
  }
  return res;
}

// Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".

public String sameEnds(String string) {
  StringBuilder sb = new StringBuilder();
  int len = string.length();
  for (int i = len / 2; i > 0; i--) {
    if (string.substring(0, i).equals(string.substring(len - i, len))) {
      sb.append(string.substring(0, i));
      break;
    }
  }
  return sb.toString();
}

// Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

public String mirrorEnds(String string) {
  StringBuilder sb = new StringBuilder();
  int len = string.length();
  for (int i = 0; i < len; i++) {
    if (string.substring(i, i + 1).equals(string.substring(len - i - 1, len - i))) {
      sb.append(string.charAt(i));
    } else {
      break;
    }
  }
  return sb.toString();
}

// Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

public int maxBlock(String str) {
  if (str.length() == 0) {
    return 0;
  }
  int count = 0;
  int tempCount = 0;
  char temp = str.charAt(0);
  for (int i = 0; i <= str.length() - 1; i++) {
    if (temp == str.charAt(i)) {
      tempCount++;
      if (tempCount >= count) {
        count = tempCount;
      }
    } else {
      temp = str.charAt(i);
      tempCount = 1;
    }
  }
  return count;
}

// Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

public int sumNumbers(String str) {
  int sum = 0;
  StringBuilder sb = new StringBuilder();
  for (int i = 0; i < str.length(); i++) {
    if (Character.isDigit(str.charAt(i))) {
      sb.append(str.charAt(i));
    } else {
      if (sb.toString().length() > 0) {
        sum += Integer.parseInt(sb.toString());
        sb = new StringBuilder();
      }
    }
    if (i == str.length() - 1 && sb.toString().length() > 0) {
      sum += Integer.parseInt(sb.toString());
    }
  }
  return sum;
}




