// Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later, but for this problem the value is simply 0.

public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for (String s : strings) {
    map.put(s, 0);
  }
  return map;
}

// Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.

public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for (String s : strings) {
    map.put(s, s.length());
  }
  return map;
}

// Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.

public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  for (String s : strings) {
    map.put(s.substring(0, 1), s.substring(s.length() - 1));
  }
  return map;
}

// The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.

public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for (String s : strings) {
    if (map.containsKey(s)) {
      map.put(s, map.get(s) + 1);
    } else {
      map.put(s, 1);
    }
  }
  return map;
}

// Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.

public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  for (String s : strings) {
    if (map.containsKey(s.substring(0,1))) {
      map.put(s.substring(0,1), map.get(s.substring(0,1)) + s);
    } else {
      map.put(s.substring(0,1), s);
    }
  }
  return map;
}

// Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.

public String wordAppend(String[] strings) {
  StringBuilder res = new StringBuilder();
  Map<String, String> map = new HashMap<String, String>();
  for (String s : strings) {
    if (map.containsKey(s)) {
      res.append(s);
      map.remove(s);
    } else {
      map.put(s, s);
    }
  }
  return res.toString();
}














