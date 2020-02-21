package ca.ciccc;

import java.util.Arrays;

/**
 * This is the starter file for the Assignment 2
 *
 * @author Derrick Park
 * @version 1.0
 */
public class Assignment2 {
    /**
     * Write nested for-loops to produce the following output from the given input
     * n.
     *
     * @param n number to create a pattern.
     * @return pattern
     *
     *         Sample Input / Output numberLoops(3);
     *
     *         Sample Output ..1 .22 333
     *
     */
    public String numberLoops(int n) {
        String str = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i < (n - j) - 1) {
                    str += ".";
                } else {
                    str += Integer.toString(i + 1);
                }
            }
            if (i != (n - 1)) {
                str += "\n";
            }
        }
        System.out.print(str);
        return str;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than
     * the number of 7s
     *
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        int ones = 0;
        int sevens = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == 1) {
                ones++;
            }
            if (num == 7) {
                sevens++;
            }
        }

        return ones > sevens;
    }

    /**
     * Return the sum of numbers in the array, returning 0 for an empty array.
     * Except the number 13 is very unlucky, so it does not count the number that
     * comes immediately after a 13, also 13 itself does not count.
     *
     * @param nums array of numbers
     * @return the sum except for 13
     *
     *         Sample Input / Output sumExcept13({1, 2, 2, 1}) -> 6 sumExcept13({1,
     *         2, 2, 1, 13} -> 6 sumExcept13({1, 2, 13, 2, 1, 13} -> 4
     */
    public int sumExcept13(int[] nums) {
        // Todo: your code goes here
        final int UNLUCKY_NUMBER = 13;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == UNLUCKY_NUMBER || (i > 0 && nums[i - 1] == UNLUCKY_NUMBER)) {
                continue;
            }
            sum += num;
        }

        return sum;
    }

    /**
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} return {2,
     * 5, 3, 6}. You may modify and return the given array, or return a new array.
     *
     * @param nums array of ints
     * @return shifted array
     *
     *         Sample Input / Output shiftArray({6, 2, 5, 3}) -> {2, 4, 3, 6}
     *         shiftArray({2, 3}) -> {3, 2} shiftArray({7}) -> {7}
     */
    public int[] shiftArray(int[] nums) {
        // Todo: your code goes here
        final int SHIFT_COUNT = 1;
        int[] array = new int[nums.length];

        for (int i = 0; i < array.length; i++ ) {
            int num = nums[i];
            int index = i - SHIFT_COUNT;
            if (index >= 0) {
                array[index] = nums[i];
            } else {
                array[array.length + index] = num;
            }
        }

        return array;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers,
     * otherwise false.
     *
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers,
     *         otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        // Todo: your code goes here
        boolean result = false;
        for (int i = 0; i < nums.length; i++ ) {
            int num = nums[i];
            if (i < 2) {
                continue;
            }

            if (nums[i - 2] == num - 2 && nums[i-1] == num -1) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers,
     * otherwise false.
     *
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers,
     *         otherwise false.
     */
    public boolean evenOrOdd(int[] nums) {
        // Todo: your code goes here
        int evens = 0;
        int odds = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }

        return evens == odds;
    }
}
