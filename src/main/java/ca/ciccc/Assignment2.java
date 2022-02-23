package ca.ciccc;

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
  public String numberLoops(int n) {
    String srtNumber = "";
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(".");
        srtNumber += ".";
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(i);
        srtNumber += i;
        if (k == i & i < n) {
          srtNumber = srtNumber + "\n";
        }
      }
      System.out.println();
    }
    return srtNumber;
  }

  /**
   * Given an array of integers, return true if the number of 1s is greater than the number of 7s
   *
   * @param nums array of ints
   * @return true if the number of 1s is greater than the number of 7s
   */
  public boolean countNumbers(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if (num == 1) {
        count++;
      } else if (num == 7) {
        count--;
      }
    }
    return (count > 0);
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
    int sum = 0;
    if (nums == null) {
      return sum;
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 13) {
        i++;
      } else {
        sum += nums[i];
      }
    }
    return sum;
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
    if (nums.length >= 2) {
      int arrayTemp = nums[0];
      for (int i = 0; i < nums.length - 1; i++) {
        nums[i] = nums[i + 1];
      }
      nums[nums.length - 1] = arrayTemp;
    }
    return nums;
  }

  /**
   * Return true if the array contains three increasing adjacent numbers, otherwise false.
   *
   * @param nums array of ints.
   * @return true if the array contains three increasing adjacent numbers, otherwise false.
   */
  public boolean tripleIncreasingOrder(int[] nums) {
    boolean adjacent = false;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i + 1] - nums[i] == 1) {
        if (adjacent == true) {
          return true;
        } else {
          adjacent = true;
        }
      } else {
        adjacent = false;
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
    int countOdd = 0;
    int countEven = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        countOdd++;
      } else {
        countEven++;
      }
    }
    if (countEven == countOdd) {
      return true;
    } else {
      return false;
    }
  }
}
