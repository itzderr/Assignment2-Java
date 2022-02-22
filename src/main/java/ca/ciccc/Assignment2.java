package ca.ciccc;

import java.util.Arrays;
import java.util.Enumeration;

/**
 * This is the starter file for the Assignment 2
 *
 * @author Derrick Park
 * @version 1.0
 */
public class Assignment2 {

  /**
   * Write nested for-loops to produce the following output from the given input n.
   *
   * @param n number to create a pattern.
   * @return pattern
   * <p>
   * Sample Input / Output numberLoops(3);
   * <p>
   * Sample Output ..1 .22 333
   */
  public static String numberLoops(int n) {
    // Todo: your code goes here
    StringBuilder result = new StringBuilder("");
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (j <= n - i) {
          result.append(".");
        } else {
          result.append(i);
        }
      }
      if (i != n) {
        result.append("\n");
      }
    }

    return result.toString();
  }

  /**
   * Given an array of integers, return true if the number of 1s is greater than the number of 7s
   *
   * @param nums array of ints
   * @return true if the number of 1s is greater than the number of 7s
   */
  public boolean countNumbers(int[] nums) {
    // Todo: your code goes here
    int ones = 0;
    int sevens = 0;

    for (int num : nums) {
      if (num == 1) {
        ones++;
      } else if (num == 7) {
        sevens++;
      }

      if (ones > (int) Math.ceil(nums.length / 2.0)) {
        break;
      } else if (sevens > (int) Math.ceil(nums.length / 2.0)) {
        break;
      }
    }

    return ones > sevens;
  }

  /**
   * Return the sum of numbers in the array, returning 0 for an empty array. Except the number 13 is
   * very unlucky, so it does not count the number that comes immediately after a 13, also 13 itself
   * does not count.
   *
   * @param nums array of numbers
   * @return the sum except for 13
   * <p>
   * Sample Input / Output sumExcept13({1, 2, 2, 1}) -> 6 sumExcept13({1, 2, 2, 1, 13} -> 6
   * sumExcept13({1, 2, 13, 2, 1, 13} -> 4
   */
  public int sumExcept13(int[] nums) {
    // Todo: your code goes here
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 13) {
        i += 1;
        continue;
      }
      result += nums[i];
    }
    return result;
  }

  /**
   * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} return {2, 5, 3, 6}. You may
   * modify and return the given array, or return a new array.
   *
   * @param nums array of ints
   * @return shifted array
   * <p>
   * Sample Input / Output shiftArray({6, 2, 5, 3}) -> {2, 4, 3, 6} shiftArray({2, 3}) -> {3, 2}
   * shiftArray({7}) -> {7}
   */
  public int[] shiftArray(int[] nums) {
    // Todo: your code goes here
    if (nums.length == 0) {
      return nums;
    }
    int temp = nums[0];
    for (int i = 0; i < nums.length - 1; i++) {
      nums[i] = nums[i + 1];
      nums[i + 1] = temp;
    }
    nums[nums.length - 1] = temp;

    return nums;
  }

  /**
   * Return true if the array contains three increasing adjacent numbers, otherwise false.
   *
   * @param nums array of ints.
   * @return true if the array contains three increasing adjacent numbers, otherwise false.
   */
  public boolean tripleIncreasingOrder(int[] nums) {
    // Todo: your code goes here
    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] == nums[i + 1] - 1 && nums[i + 1] == nums[i + 2] - 1) {
        return true;
      }
    }
    return false;
  }

  /**
   * Return true if the array contains the same number of odds and even numbers, otherwise false.
   *
   * @param nums array of ints.
   * @return true if the array contains the same number of odds and even numbers, otherwise false.
   */
  public boolean evenOrOdd(int[] nums) {
    // Todo: your code goes here
    int odds = Arrays.stream(nums).filter(num -> num % 2 == 1).toArray().length;
    int evens = Arrays.stream(nums).filter(num -> num % 2 == 0).toArray().length;

    return odds == evens;
  }
}

