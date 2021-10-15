package ca.ciccc;
import java.util.stream.*;

import javafx.scene.effect.Blend;

/**
 * This is the starter file for the Assignment 2
 *
 * @author Derrick Park
 * @version 1.0
 */
public class Assignment2 {
    /**
     * Write nested for-loops to produce the following output from the given input n.
     *
     * @param n number to create a pattern.
     * @return pattern
     * <p>
     * Sample Input / Output
     * numberLoops(3);
     * <p>
     * Sample Output
     * ..1
     * .22
     * 333
     */
    public String numberLoops(int n) {
        String str = "";
            for (int i = 1; i <= n ; i++) {
                for (int s = 1; s <= n-i; s++) {
                    str = str + ".";
                }
            for (int l = 1; l <= i; l++) {
                    str = str + i;
                }
            if(i != n){
                str = str + "\n";
            }
            }
            return str;
        }

        /**
         * Given an array of integers, return true if the number of 1s is greater than the number of 7s
         * @param nums array of ints
         * @return true if the number of 1s is greater than the number of 7s
         */
        public boolean countNumbers ( int[] nums) {
            int n = 0;
            int m = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == (int)1) {
                    n ++;}
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == (int)7) {
                    m ++;}
            }
                if (n > m){
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
        public int sumExcept13 ( int[] nums) {
            int n = 0;
            while(n < nums.length-1){
                if(nums[n] == 13){
                    nums[n] = 0;
                    nums[n+1] = 0;}
                n ++;
            }
            int sum = 0;
                for(int i = 0; i < nums.length; i++){
                    if (nums[i] != 13)
                    sum += nums[i];
                }

            if (nums.length == 0){
                return 0;
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
        public int[] shiftArray ( int[] nums){
            if (nums.length < 1)
                return nums;

            int n = nums[0];

            for(int i = 1; i < nums.length; i++)
                nums[i - 1] = nums[i];

            nums[nums.length - 1] = n;

            return nums;
        }

        /**
         * Return true if the array contains three increasing adjacent numbers, otherwise false.
         * @param nums array of ints.
         * @return true if the array contains three increasing adjacent numbers, otherwise false.
         */
        public boolean tripleIncreasingOrder ( int[] nums){
            for(int i = 0; i < nums.length-2; i ++){
                if(nums[i] == nums[i + 1] - 1 && nums[i]== nums[i + 2] - 2){
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
        public boolean evenOrOdd ( int[] nums){
            int odd = 0;
            int even = 0;
            for(int i = 0; i < nums.length; i ++){
                if (nums[i] % 2 == 0){
                    odd ++;
                }else{
                    even ++;
                }
            }
            if(odd == even){
                return true;

            }
            return false;
        }
    }
