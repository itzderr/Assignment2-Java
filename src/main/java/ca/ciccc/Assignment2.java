package ca.ciccc;

import java.lang.reflect.Array;
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
        System.out.println(a.tripleIncreasingOrder(new int[] {1, 2, 4, 7, 7, 6, 7, 6, 7, 9}));

    }

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
        String finalStr = "";
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                finalStr += ((j > i)?".":i);
            }
            if (i != n)
                finalStr += "\n";
        }

        return finalStr;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        int uns = 0;
        int sevens = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                uns += 1;
            else if (nums[i] == 7)
                sevens += 1;

        }

        return uns > sevens;
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
        boolean lock = false;
        for (int i = 0; i < nums.length; i++) {
            if (lock) {
                lock = false;
                continue;
            }else {
                if (nums[i] == 13) {
                    lock = true;
                }else {
                    sum += nums[i];
                }
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
        if (nums.length == 0) {
            return nums;
        }
        int first = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }

        nums[nums.length -1] = first;

        return nums;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        boolean isThereSeq = false;
        for (int i = 0; i < nums.length; i++) {
            if (i+1 < nums.length) {
                if (nums[i+1] == nums[i]+1) {
                    if (i+2 < nums.length && nums[i+2] == nums[i+1]+1) {
                        isThereSeq = true;
                        break;
                    }
                }
            }
        }

        return isThereSeq;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        int odds = 0;
        int evens = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evens += 1;
            }else {
                odds += 1;
            }
        }

        return odds == evens;
    }
}

