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
        String pattern = "";
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1 ; j--) {
                if(i >= j) {
                    pattern += i;
                } else {
                    pattern += ".";
                }
            }
            if(i != n) {
                pattern += "\n";
            }
        }

        return pattern;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        int countOnes = 0;
        int countSeven = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                countOnes += 1;
            } else if (nums[i] == 7) {
                countSeven += 1;
            }
        }

        if (countOnes > countSeven) {
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
        int sum = 0;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
                continue;
            } else {
                System.out.println(nums[i]);
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
        int[] shiftedArray = new int[nums.length];

        if (nums.length == 0) {
            return shiftedArray;
        }

        for (int index = 0; index < nums.length - 1; index++) {
            if (index > 0) {
                shiftedArray[index] = nums[index + 1];
            }
        }

        if (nums.length > 1) {
            shiftedArray[0] = nums[1];
        }
        shiftedArray[nums.length - 1] = nums[0];
        return shiftedArray;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 2) {
                if (nums[i] == nums[i + 1] - 1 && nums[i + 1] == nums[i + 2] - 1) {
                    return true;
                }
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
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                countEven += 1;
            } else {
                countOdd += 1;
            }
        }
        if (countEven == countOdd) {
            return true;
        } else {
            return false;
        }
    }
}

