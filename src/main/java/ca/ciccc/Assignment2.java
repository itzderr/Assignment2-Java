package ca.ciccc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i > 1) result.append("\n");
            for (int j = 1; j <= n; j++) {
                if (i + j > n) {
                    result.append(i);
                } else {
                    result.append(".");
                }
            }
        }
        return result.toString();
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        int count1 = 0;
        int count7 = 0;
        for (int i: nums) {
            if (i == 1) count1 ++;
            if (i == 7) count7 ++;
        }
        return count1 > count7;
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
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i ++;
                continue;
            }
            result += nums[i];
        }
        return result;
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
        if (nums.length == 0) return nums;
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        boolean result = false;
        for (int i: nums) {
            int[] positives = {i + 1, i + 2};
            for (int v: positives) {
                result = this.hasValue(v, nums);
                if (!result) break;
            }
            if (result) break;
            int[] negatives = {i - 1, i - 2};
            for (int v: negatives) {
                result = this.hasValue(v, nums);
                if (!result) break;
            }
        }
        return result;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        if (nums.length % 2 != 0) return false;
        List<Integer> list = new ArrayList<Integer>(nums.length);
        for (int i: nums) {
            list.add(i);
        }
        List<Integer> odds = list.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
        List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        return odds.size() == even.size();
    }

    public boolean hasValue(int v, int[] nums) {
        List<Integer> list = new ArrayList<Integer>(nums.length);
        for (int i: nums) {
            list.add(i);
        }
        return list.contains(v);
    }
}

