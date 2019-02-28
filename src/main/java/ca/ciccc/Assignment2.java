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
        String numbers = "";
        for (int i = 1; i <= n; ++i) {
            String number = "";
            for (int j = 0; j < n - i; ++j)
            {
                number += ".";
            }
            for (int j = 0; j < i; ++j)
            {
                number += String.format("%d", i);
            }
            numbers += number;

            if (i < n)
            {
                numbers += "\n";
            }
        }

        return numbers;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        // Todo: your code goes here
        int numberOne = 0;
        int numberSeven = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) {
                numberOne += 1;
            }
            if (nums[i] == 7) {
                numberSeven += 1;
            }
        }
        return numberOne > numberSeven;
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
        int tot = 0;
        for (int i = 0; i < nums.length; ++i)
        {
            if (nums[i] == 13)
            {
                ++i;
                continue;
            }
            tot += nums[i];
        }
        return tot;
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
        int[] shift = new int[nums.length];
        for (int i = 0; i < nums.length; ++i)
        {
            if (i == 0)
            {
                shift[shift.length - 1] = nums[i];
            }
            else
            {
                shift[i - 1] = nums[i];
            }

        }
        return shift;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        // Todo: your code goes here
        int increasing = 1;
        int lastNumber = nums[0];
        for (int i = 1; i < nums.length; ++i)
        {
            if (nums[i] == lastNumber + 1)
            {
                increasing += 1;
            }
            else
            {
                increasing = 1;
            }
            lastNumber = nums[i];
            if (increasing == 3)
            {
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
    public boolean evenOrOdd(int[] nums){
        // Todo: your code goes here
        int even = 0;
        int odd = 0;
        for (int i = 0; i < nums.length; ++i)
        {
            if (nums[i] % 2 == 0)
            {
                even += 1;
            }
            else
            {
                odd += 1;
            }
        }
        return even == odd;
    }
}

