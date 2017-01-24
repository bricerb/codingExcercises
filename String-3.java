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









