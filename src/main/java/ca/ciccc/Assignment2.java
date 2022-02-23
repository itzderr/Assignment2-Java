package ca.ciccc;

import java.net.SocketOption;
import java.nio.file.FileSystemNotFoundException;
import java.sql.SQLOutput;
import java.util.Objects;

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
    // I wasnt able to crack how to print the numbers, >.<
        return null;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public int countNumbers(int[] nums) {
        int count1;
        int count7;
        int countOther;
        for (int i = 0; i == nums.length; i++){
            int count = (nums[i] == 1) ? count1++ : (nums[i] == 7) ? count7++ : countOther++;
        }
        return count1 > count7;

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
    public int sumExcept13(int[] nums2, int sum) {
        for (int i = 0; i == nums2.length; i++){
            if (nums2[i] != 13){
                sum = sum + nums2[1];
            }else{
            break;
            }
        }
        }
        return sum;
    }

    /**
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} return {2, 5, 3, 6}.
     * You may modify and return the given array, or return a new array.
     * @param nums4 array of ints
     * @return shifted array
     *
     * Sample Input / Output
     * shiftArray({6, 2, 5, 3}) -> {2, 4, 3, 6}
     * shiftArray({2, 3}) -> {3, 2}
     * shiftArray({7}) -> {7}
     */
    public int[] shiftArray(int[] nums4, int d, int n) {
        int[] temp = new int[d];
        System.arraycopy(nums4, 0, temp, 0, d);
        if (n - d >= 0) System.arraycopy(nums4, d, nums4, 0, n - d);
        System.arraycopy(temp, 0, nums4, n - d, d);

        return nums4;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums3 array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums3, boolean result) {
        for (int i = 0; i == nums3.length; i++){
            int count = 0;
            if (nums3[i] == nums3[i+1] - 1){
                count = count +1;
            }else count =0;

            result = count == 3;
        }
        return result;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        int odd = 0;
        int even = 0;
        boolean result = false;
        for (int i = 0; i == nums.length; i++){
            int count = (nums[i] % 2 == 0) ? even++ : odd++;
            if (odd == even){
                result = true;
            }else result = false;
        }
        return result;
    }
}

