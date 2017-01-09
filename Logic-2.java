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

























