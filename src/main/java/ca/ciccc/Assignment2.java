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
        // n = 3
        // 2 dots 1 num
        // 1 dot 2 nums
        // 3 nums

        // n = k
        // k-1 dots 1 num
        // k-2 dots 2 nums
        // k-3 dots 3 nums
        // k nums

        String result = "";
        int i = 1;
        while (i <= n) {
            // print dots
            for(int j = n - i; j > 0; j--) {
                result += ".";
            }
            // print nums
            for(int j = i; j > 0; j--) {
                result += i;
            }
            // at the end of the string: there's no new line
            if (i != n) {
                result += "\n";
            }
            i++;
        }
        return result;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {

        int oneCount = 0;
        int sevenCount = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                oneCount++;
            } else if (nums[i] == 7) {
                sevenCount++;
            }
        }
        // Todo: your code goes here
        return (oneCount > sevenCount);
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
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }
        // Todo: your code goes here

        return sum;
    }

    /**
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} return {2, 5, 3, 6}.
     * You may modify and return the given array, or return a new array.
     * @param nums array of ints
     * @return shifted array
     *
     * Sample Input / Output
     * shiftArray({6, 2, 5, 3}) -> {2, 5, 3, 6}
     * shiftArray({2, 3}) -> {3, 2}
     * shiftArray({7}) -> {7}
     */
    public int[] shiftArray(int[] nums) {

        int shift = 0;
        if (0 < nums.length) {
            shift = nums[0];
        }

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

        if (0 < nums.length) {
            nums[nums.length - 1] = shift;
        }

        return nums;
        // Todo: your code goes here
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {

        boolean triple = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] < nums[i + 1] && nums[i + 1] < nums[i + 2] && 1 == Math.abs(nums[i + 1] - nums[i])
                    && 2 == Math.abs(nums[i + 2] - nums[i])) {
                triple = true;
            }
        }
        return triple;// Todo: your code goes here
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        int countEven = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                countEven++;
            }
        }
        int countOdd = nums.length - countEven;
        if (countEven == countOdd) {
            return true;
        } else {
            return false;
        }

    }
}

// Reference: Github and www.cs.utexas.edu