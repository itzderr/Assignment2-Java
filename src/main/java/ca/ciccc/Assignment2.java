package ca.ciccc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

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
        String result = "";

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--){
                if(j <= i) {
                    result += i;
                }
                else {
                    result += ".";
                }
            }
            if (i != n) {
                result += "\n";
            }
        }
        return result;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        int cnumb1 = 0;
        int cnumb7 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnumb1 += 1;
            } else if (nums[i] == 7) {
                cnumb7 += 1;
            }
        }

        if (cnumb1 > cnumb7) {
            return true;
        }

        return false;
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
        int sum =0;
        for (int i=0;i <= nums.length-1;i++){
            if ( nums[i] != 13 ){
                sum += nums[i];

            }
            else {
              i++;
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
        int temp =0;
        int lenTemp= nums.length;
        if (lenTemp>2) {
            temp = nums[0];

            for (int i = 0; i < lenTemp - 1; i++) {
                nums[i] = nums[i+1];
            }
            nums[lenTemp - 1] = temp;
        }
        return nums;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        boolean  tIan  = false;
        for (int x = 0; x + 2 < nums.length; x++) {
            if (nums[x] + 1 == nums[x + 1] && nums[x]+2 == nums[x + 2]) {
                tIan = true;
            }
        }

        return tIan;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        int tempE = 0;
        int tempO = 0;
            for (int x =0;x<nums.length;x++) {
                if (nums[x] % 2 == 0) {
                    tempE+=1;
                }
                else {
                    tempO+=1;
                }
            }
            if (tempE == tempO)
                    return true;


        return false;
    }
}

