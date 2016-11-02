/* 
We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4
*/

public int bunnyEars(int bunnies) {
  if (bunnies == 0) {
    return 0;
  }
  return 2 + bunnyEars(bunnies-1);
}



/*
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).

factorial(1) → 1
factorial(2) → 2
factorial(3) → 6
*/

public int factorial(int n) {
  if (n == 1) {
  	return 1;
  }
  o = n;
  return o * factorial(n-1);
}



/*
The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.

fibonacci(0) → 0
fibonacci(1) → 1
fibonacci(2) → 1
*/

int trackerNumber = 0;
public int fibonacci(int n) {
  return fastFib(0, 1, n);
}

public int fastFib(int firstFib, int secondFib, int fibTracker) {
  trackerNumber++;
  if (fibTracker == 0) {
    return 0;
  }
  if (fibTracker == 1) {
      return secondFib;
  }
  int currentFibNumber = firstFib + secondFib;
  fibTracker--;
  return fastFib(secondFib, currentFibNumber, fibTracker);
}



/*
We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5
*/

public int bunnyEars2(int bunnies) {
  return fastEars(bunnies, 0);
}

public int fastEars(int bunnies, int tracker) {
  if (bunnies == 0) {
    return tracker;
  }
  
  if (bunnies % 2 == 0) {
    tracker += 3;
  } else {
    tracker += 2;
  }
  return fastEars(bunnies - 1, tracker);
}



/*
We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.

triangle(0) → 0
triangle(1) → 1
triangle(2) → 3
*/

public int triangle(int rows) {
  return fastTriangle(rows, 0);
}

public int fastTriangle(int rows, int tracker) {
  if (rows == 0 ) {
    return tracker;
  }
  
  tracker += rows;
  return fastTriangle(rows - 1, tracker);
}



/*
Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3
*/

public int sumDigits(int n) {
  return fastSumDigits(n, 0);
}

public int fastSumDigits(int n, int tracker) {
  if (n == 0) {
    return tracker;
  }
  
  tracker += n % 10;
  return fastSumDigits(n / 10, tracker);
}



/*

Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

count7(717) → 2
count7(7) → 1
count7(123) → 0
*/

public int count7(int n) {
  return effCount7(n, 0);
}

public int effCount7(int n, int tracker) {
  if (n == 0) {
    return tracker;
  }
  
  if (n % 10 == 7) {
    tracker += 1;
  }
  return effCount7(n / 10, tracker);
}



/*
Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

count8(8) → 1
count8(818) → 2
count8(8818) → 4
*/

public int count8(int n) {
  return fastCount8(n, 0, false);
}

public int fastCount8(int n, int tracker, boolean previous8) {
  if (n == 0) {
    return tracker;
  }
  
  if (n % 10 == 8) {
    if (previous8 == false) {
      tracker += 1;
      previous8 = true;
    } else {
      tracker += 2;
    }
  } else {
    previous8 = false;
  }
  return fastCount8(n / 10, tracker, previous8);
}



/*
Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27
*/

public int powerN(int base, int n) {
  if (n == 1) {
    return base;
  }
  
  n -= 1;
  int basePower = base;
  return base * powerN(base, n);
}




