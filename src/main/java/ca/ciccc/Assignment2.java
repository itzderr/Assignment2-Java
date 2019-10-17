package ca.ciccc;

import java.util.Arrays;

/**
 * This is the starter file for the Assignment 2
 *
 * @author Derrick Park
 * @version 1.0
 */
public class Assignment2 {

  public static void main(String[] args) {
    Assignment2 a = new Assignment2();
    System.out.println(a.numberLoops(1));
    //    int[] arr = {7, 2, 3, 4, 5, 6, 1};
    //    int[] arr2 = {13, 2, 2, 1, 13};
    //    System.out.println(a.countNumbers(arr));
    //    System.out.println(a.sumExcept13(arr2));
    //    int[] arr3 = {};
    //    System.out.println(Arrays.toString(a.shiftArray(arr3)));
    //    int[] arr4 = {1, 2, 1, 2};
    //    System.out.println(a.tripleIncreasingOrder(arr4));
    //    int[] arr5 = {1, 2, 1};
    //    System.out.println(a.evenOrOdd(arr5));
  }

  /**
   * Write nested for-loops to produce the following output from the given input n.
   *
   * @param n number to create a pattern.
   * @return pattern
   *     <p>Sample Input / Output numberLoops(3);
   *     <p>Sample Output ..1 .22 333
   */
  public String numberLoops(int n) {
    // Todo: your code goes here

    String res = "";
    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < n + 1 - i; j++) {
        if (n == 1) {
          res +=  n + "\n";
        } else {
          res += ".";
        }
      }
      for (int k = 1; k < i + 1; k++) {
        res += i;
      }
      res += "\n";
    }
    return res.substring(0, res.length()-1);
  }

  /**
   * Given an array of integers, return true if the number of 1s is greater than the number of 7s
   *
   * @param nums array of ints
   * @return true if the number of 1s is greater than the number of 7s
   */
  public boolean countNumbers(int[] nums) {
    // Todo: your code goes here
    int oneCnt = 0;
    int sevenCnt = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        oneCnt += 1;
      } else if (nums[i] == 7) {
        sevenCnt += 1;
      }
    }
    return oneCnt > sevenCnt;
  }

  /**
   * Return the sum of numbers in the array, returning 0 for an empty array. Except the number 13 is
   * very unlucky, so it does not count the number that comes immediately after a 13, also 13 itself
   * does not count.
   *
   * @param nums array of numbers
   * @return the sum except for 13
   *     <p>Sample Input / Output sumExcept13({1, 2, 2, 1}) -> 6 sumExcept13({1, 2, 2, 1, 13} -> 6
   *     sumExcept13({1, 2, 13, 2, 1, 13} -> 4
   */
  public int sumExcept13(int[] nums) {
    // Todo: your code goes here
    if (nums.length == 0) return 0;

    int i = 0;
    int sum = 0;

    while (i < nums.length) {
      if (nums[i] == 13) {
        i += 2;
      } else {
        sum += nums[i];
        i += 1;
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
   *     <p>Sample Input / Output shiftArray({6, 2, 5, 3}) -> {2, 4, 3, 6} shiftArray({2, 3}) -> {3,
   *     2} shiftArray({7}) -> {7}
   */
  public int[] shiftArray(int[] nums) {
    // Todo: your code goes here
    if (nums.length == 0) return nums;

    int[] arr = new int[nums.length];
    for (int i = 0; i < (nums.length - 1); i++) {
      arr[i] = nums[i + 1];
    }
    arr[nums.length - 1] = nums[0];
    return arr;
  }

  /**
   * Return true if the array contains three increasing adjacent numbers, otherwise false.
   *
   * @param nums array of ints.
   * @return true if the array contains three increasing adjacent numbers, otherwise false.
   */
  public boolean tripleIncreasingOrder(int[] nums) {
    // Todo: your code goes here
    int increaseCnt = 0;
    for (int i = 0; i < (nums.length - 1); i++) {
      if (nums[i + 1] - nums[i] == 1) {
        increaseCnt += 1;
      } else {
        increaseCnt = 0;
      }
      if (increaseCnt == 2) return true;
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
    int evenNum = 0;
    int oddNum = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        evenNum += 1;
      } else {
        oddNum += 1;
      }
    }
    return evenNum == oddNum;
  }
}
