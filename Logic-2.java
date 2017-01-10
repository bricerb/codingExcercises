// We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops.

public boolean makeBricks(int small, int big, int goal) {
  int big5 = big * 5;
  if (big5 > goal) {
    big5 = goal - (goal % 5);
  }
  if (big == 0) {
    return (small >= goal);
  }
  if (small == 0) {
    return (goal % 5 == 0 && big5 >= goal);
  }
  if (0 == big5 % goal ) {
    return true;
  }
  if (big5 + small < goal) {
    return false;
  }
  
  if (big5 + small >= goal) {
    return true;
  }
  if (goal % 5 <= small) {
    return true;
  }
  return false;
}

// Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

public int loneSum(int a, int b, int c) {
  int sum = 0;
  if (a != b && a != c) {
    sum += a;
  }
  if (b != a && b != c) {
    sum += b;
  }
  if (c != b && a != c) {
    sum += c;
  }
  return sum;
}

// Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

public int luckySum(int a, int b, int c) {
  int sum = 0;
  if (a != 13) {
    sum +=a;
    if (b != 13) {
      sum += b;
      if (c != 13) {
        sum += c;
      }
    }
  }
  return sum;
}

// Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().

public int noTeenSum(int a, int b, int c) {
  return fixTeen(a) + fixTeen(b) + fixTeen(c);
}

public int fixTeen(int n) {
  if (n >= 13 && n <= 19) {
    if (!(n == 15 || n == 16)) {
    if (n != 15 || n != 16) {
      n = 0;
    }
  }
  return n;
}

// For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().

public int roundSum(int a, int b, int c) {
  return round10(a) + round10(b) + round10(c);
}

public int round10(int num) {
  if (num % 10 >= 5 ) {
    num = num + (10 - (num % 10));
  } else {
    num = num - (num % 10);
  }
  return num;
}
























