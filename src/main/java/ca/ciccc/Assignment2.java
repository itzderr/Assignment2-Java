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
     * Write nested for-loops to produce the following output from the given input n.
     * @param n number to create a pattern.
     * @return pattern
     *
     * Sample Input / Output
     * numberLoops(3);
     *
     * Sample Output
     * ..1
     * .22
     * 333
     *
     */
    public String numberLoops(int n) {
        // Todo: your code goes here
        StringBuilder pattern = new StringBuilder();
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++){
                if (c + r < n - 1) {
                    pattern.append(".");
                } else {
                    pattern.append(Integer.toString(r + 1));
                    if (c == n - 1 && r != n - 1){
                        pattern.append("\n");
                    }
                }
            }
        }
        String stringPattern = pattern.toString();
        return stringPattern;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        // Todo: your code goes here
        int numOf1 = 0;
        int numOf7 = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                numOf1 +=1;
            } else if (nums[i] == 7) {
                numOf7 += 1;
            }
        }
        if (numOf1 > numOf7) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Return the sum of numbers in the array, returning 0 for an empty array. Except the number 13
     * is very unlucky, so it does not count the number that comes immediately after a 13, also 13 itself
     * does not count.
     * @param nums array of numbers
     * @return the sum except for 13
     *
     * Sample Input / Output
     * sumExcept13({1, 2, 2, 1}) -> 6
     * sumExcept13({1, 2, 2, 1, 13} -> 6
     * sumExcept13({1, 2, 13, 2, 1, 13} -> 4
     */
    public int sumExcept13(int[] nums) {
        // Todo: your code goes here
        int sum = 0;
        if (nums.length == 0) {
            return sum;
        }
        if (nums[0] != 13) {
            sum += nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 13 && nums[i - 1] != 13) {
                sum += nums[i];
            }
        }
        return sum;
    }

    /**
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} return {2, 5, 3, 6}.
     * You may modify and return the given array, or return a new array.
     * @param nums array of ints
     * @return shifted array
     *
     * Sample Input / Output
     * shiftArray({6, 2, 5, 3}) -> {2, 4, 3, 6}
     * shiftArray({2, 3}) -> {3, 2}
     * shiftArray({7}) -> {7}
     */
    public int[] shiftArray(int[] nums) {
        // Todo: your code goes here
        if (nums.length <= 1) {
            return nums;
        }
        int[] newNums = new int[nums.length];
        int[] shortNums = Arrays.copyOfRange(nums, 1, nums.length);
        System.arraycopy(shortNums, 0, newNums, 0, shortNums.length);
        newNums[nums.length - 1] = nums[0];
        return newNums;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        // Todo: your code goes here
        if (nums.length < 3) {
            return false;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] - nums[i] == 1 && nums[i + 2] - nums[i + 1] == 1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        // Todo: your code goes here
        int numberOfEvens = 0;
        int numberOfOdds = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                numberOfEvens += 1;
            } else {
                numberOfOdds += 1;
            }
        }
        if (numberOfEvens == numberOfOdds) {
            return true;
        }
        return false;
    }
}

