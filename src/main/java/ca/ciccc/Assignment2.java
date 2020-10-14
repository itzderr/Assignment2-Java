package ca.ciccc;

import java.lang.reflect.Array;

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

        String output = "";

        for (int i = 1; i <= n; i++){

            for (int j = 0; j <=n-i-1 ; j++) {
                output += ".";
            }
            for (int j = 1; j <=i ; j++) {
                output += Integer.toString(i);
            }

            if (i < n) output += "\n";
        }
        return output;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        // Todo: your code goes here
        int countOne = 0;
        int countSeven = 0;

        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == 1) countOne++;
            if (nums[i] == 7) countSeven++;
        }
        return countOne > countSeven ? true : false;

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
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13){
                i++;
            }else {
                total += nums[i];
            }
        }

        return total;
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

        int len = nums.length;
        if (len <= 1 ) return nums;



        int firstValue = nums[0];

        for (int i = 0; i <= len - 2; i++) {
            nums[i] = nums[i+1];
        }

        nums[len -1] = firstValue;

        return nums;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        // Todo: your code goes here

        int len = nums.length;
        if (len <= 2) return false;

        int i = 0;
        int consecutive = 0;

        while(i <= len-1 -1){
            if (nums[i] - nums[i+1] == -1){
                consecutive ++;
            }else{
                consecutive = 0;
            }
            if (consecutive >= 2) return true;
            i++;
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
        int len = nums.length;
        if (len <= 1) return true;

        int countEven = 0;

        for (int val:nums
             ) {
            if (val%2==0) countEven++;
        }

        return (double)len/2==(double)countEven ? true:false;

    }
}

