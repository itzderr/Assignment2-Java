package ca.ciccc;

import java.util.ArrayList;
import java.util.List;

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
        String total = "";
        int num = 1;
        for(int line = 1; line <= n; line++) {
            // (n-1) dots
            // 1 number
            for(int dot = 1; dot <= n - line; dot++) {
                total += ".";
            }
            for(int number = 1; number <= line; number++) {
                total += num;
            }

            if (line != n) {
                total += '\n';
            }
            num++;
        }

        return total;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        // Todo: your code goes here
        int t = 0;
        int f = 0;
        for (int i = 0; i < nums.length ; i++){
            if(nums[i] == 7){
                f = i;
            }
            for(int p = 0; p < nums.length ; p++){
                if(nums[p] == 1){
                    t = p;
                }
            }
        }
        if(t > f){
            return true;
        }else{
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

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 13){
                i = i + 1;
            }else{
                sum = sum + nums[i];
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
        int temp = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums.length < 3 && nums.length > 1) {
                temp = nums[i + 1];
                nums[i + 1] = nums[i];
                nums[i] = temp;
                break;
            }else if(nums.length == 1){
                break;
            }else if(i == nums.length - 1) {
                break;
            }
            temp = nums[i + 1];
            nums[i + 1] = nums[i];
            nums[i] = temp;
        }
        return nums;

    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        // Todo: your code goes here
        for(int i = 0; i < nums.length -1; i++){
            if(nums[i + 1] == nums[i] + 1){
                for(int p = i + 1; p < nums.length -1; p++){
                    if(nums[p + 1] == nums[p] + 1){
                        return true;
                    }
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
        // Todo: your code goes here
        int oddCount = 0;
        int evenCount = 0;

        for(int i = 0; i <= nums.length - 1; i++){
            if(nums[i] % 2 != 0){
                oddCount += 1;
            }else if(nums[i] % 2 == 0){
                evenCount += 1;
            }
        }
        if(oddCount == evenCount){
            return true;
        }else {
            return false;
        }
    }
}


