package ca.ciccc;
import java.util.*;


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
        String pattern = "";
        for(int i = 1; i <= n; i++) {
            if (i == 1) {
                pattern += "";
            } else {
                pattern += "\n";
            }
            for (int j = n - i; j > 0; j--) {
                pattern += ".";
            }
            for (int k = 1; k <= i; k++) {
                pattern += String.format("%d", i);
            }
        }
        return pattern;
    };

//    public static void main(String[] args) {
//        System.out.println(numberLoops(1));
//    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        // Todo: your code goes here
        int count1 = 0;
        int count7 = 0;
        for(int i = 0; i <= nums.length - 1; i++){
            if(nums[i] == 1){
                count1 += 1;
            }else if(nums[i] == 7){
                count7 += 1;
            }
        }

        if(count1 > count7){
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
        int i = 0;
        int n = nums.length - 1;
        int sum = 0;
        while(i <= n){
            if(nums[i] == 13){
//                continue;
                i += 2;
            }else {
                sum += nums[i];
                i += 1;
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
     *
     *
     * https://www.geeksforgeeks.org/conversion-of-array-to-arraylist-in-java/
     */
    public int[] shiftArray(int[] nums) {
        // Todo: your code goes here
        if (nums.length != 0) {
            int temp = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[nums.length - 1] = temp;
        }
        return nums;
    };

//    public static void main(String[] args) {
//        int[] array = {6, 2, 5, 3};
//        System.out.println(shiftArray(array));
//    }


    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        // Todo: your code goes here
        int count = 0;
        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] < nums[i + 1] && Math.abs(nums[i] - nums[i + 1]) == 1){
                count += 1;
                if(count == 2){
                    return true;
                }
            }else{
                count = 0;
            }
        }
        return false;
    };



    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        // Todo: your code goes here
        int count = 0;
        for(int i = 0; i <= nums.length -1; i++){
            if(nums[i] % 2 == 0){
                count += 1;
            }
        }

        if(count == (nums.length - count)){
            return true;
        }else{
            return false;
        }

    }
}

