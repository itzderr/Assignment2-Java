package ca.ciccc;


import org.w3c.dom.ls.LSOutput;

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
        //Todo: your code goes here
        String result = "";

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j < n - i) {
                        result += ".";
                    } else if (j == j) {
                        result += i;
                    }
                }
                if (i < n) {
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
        int count1 = 0;
        int count7 = 0;

        for (int i = 0; i < nums.length; i++ )
            if (nums[i] == 1) {
                count1 += 1;
            }
            else if (nums[i] == 7) {
                count7 +=1;
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
        // Todo: your code goes here
        int sum = 0;
        if (nums.length > 0)
            for (int i = 0; i < nums.length; i++)
                if (nums[i] == 13) {
                    nums[i] = 0;
                    if (i + 1 < nums.length){
                        nums[i + 1] = 0;
                    }
                }
            for (int e : nums)
                sum+= e;

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
        int n = 1;
        if (nums.length < 2)
            return nums;

        for (int i = 0; i < n; i++){

            int j, begin;

            begin = nums[0];
            for(j = 0; j < nums.length - 1; j++){
                nums[j] = nums[j+1];
            }
            nums[j] = begin;
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
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
        //int n = 3;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] < nums.length){
                if (nums[i] + 1 ==  nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]){
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
        // Todo: your code goes here
        int ecount = 0;
        int ocount = 0;

            for (int i = 0; i < nums.length; i++){
                if(nums[i] % 2 ==0){
                    ecount += 1;
                }
                else{
                    ocount += 1;

                }
            }
        return ecount == ocount;
    }

}

