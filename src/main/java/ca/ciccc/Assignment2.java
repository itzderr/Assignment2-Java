package ca.ciccc;

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
        for (int i = 1; i <= n; i++){
            for (int j = n-1 ; j >= 0 ; j--){
                if (j > i-1) {
                    pattern += ".";
                } else {
                    pattern = pattern + Integer.toString(i);
                }
            }
            if (i != n){
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
        // Todo: your code goes here
        int count1 = 0;
        int count7 = 0;
        for (int i =0; i < nums.length; i++){
            if (nums[i] == 1){
                count1 ++;
            } else if (nums[i] == 7){
                count7 ++;
            }
        }
        if (count1 > count7){
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
        // Todo: your code goes here
        int sum = 0;
        int i = 0;
        while(i < nums.length){
            if ( nums[i] != 13){
                sum += nums[i];
                i += 1;
            } else {
                i += 2;
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
        int[] shiftArray;
        shiftArray = new int[nums.length];

        for (int i =0; i < nums.length -1; i++){

            shiftArray[i] = nums[i+1];
        }
        if (nums.length != 0){
            shiftArray[nums.length - 1] = nums[0];
        }
        return shiftArray;
    }


    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        // Todo: your code goes here2
        int count = 1;
        for (int i =0; i < nums.length-1; i++){
            if(nums[i] + 1 == nums[i+1]){
                count++;
            } else if(count == 3){
                break;
            }
        }
        if (count == 3){
            return true;
        } else {
            return  false;
        }
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        // Todo: your code goes here
        int countEven = 0;
        int countOdd = 0;
        for (int i =0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                countEven ++;
            }else{
                countOdd ++;
            }
        }
        if (countEven == countOdd){
            return true;
        } else {
            return false;
        }
    }
}

