# Java Exception Handling

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!

Given an array, $s$, of $n$ real number strings, sort them in descending order &mdash; but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that $.1$ is printed as $.1$, and $0.1$ is printed as $0.1$. If two numbers represent numerically equivalent values (e.g., $.1 \equiv 0.1$), then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array $s$'s elements according to the instructions above.

**Input Format**

The first line consists of a single integer, $n$, denoting the number of integer strings.		
Each line $i$ of the $n$ subsequent lines contains a real number denoting the value of $s_i$.

**Constraints**

* $1 \le n \le 200$ 
* Each $s_i$ has *at most* $300$ digits.


**Output Format**

Locked stub code in the editor will print the contents of array $s$ to stdout. You are only responsible for reordering the array's elements.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T19:43:30.885Z  

```java

class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    long power(int n, int p) throws Exception {
    if (n < 0 || p < 0) {
        throw new Exception("n or p should not be negative.");
    }

    if (n == 0 && p == 0) {
        throw new Exception("n and p should not be zero.");
    }

    long result = 1;

    for (int i = 0; i < p; i++) {
        result *= n;
    }

    return result;
}
}


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-bigdecimal/problem)