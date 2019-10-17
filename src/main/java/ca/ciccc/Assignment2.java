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

    public static String numberLoops(int n) {
        // Todo: your code goes here
        String t = "";
        int[][] list = new int[n][n];

        for(int i = 1; i <= list.length; i++) {
            for(int j = list.length; 1<= j; j--) {
                t += j <= i ? i : ".";
            }
            t += i == list.length? "": "\n";
        }

        return t;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        // Todo: your code goes here
        int count_one = 0;
        int count_seven = 0;
        int i = 0;

        while(i < nums.length) {
            switch (nums[i]) {
                case 1:
                    count_one++;
                    break;
                case 7:
                    count_seven++;
                    break;
            }
            i++;
        }

        return count_seven < count_one;
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
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
                continue;
            }
            sum += nums[i];
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

        if (nums.length < 1) return nums;

        int[] left_shifted = new int[nums.length];

        left_shifted[nums.length-1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            left_shifted[i-1] = nums[i];
        }

        return left_shifted;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        // Todo: your code goes here

        // This function needs three numbers to compare increasing adjacent.
        if (nums.length < 3) return false;

        int target;
        int count = 1;
        boolean v = false;
        for (int i = 0; i < nums.length-1; i++) {

            target = nums[i];
            if (target + 1 != nums[i+1]) {
                count = 1;
                continue;
            }
            count++;

            if (count == 3) {
                v = true;
                break;
            }

        }

        return v;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        // Todo: your code goes here

        // the each number have to be same, which means nums have to be even number.
        if (nums.length % 2 != 0) return false;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] % 2 == 0 ? 1 : -1;
        }

        return sum == 0;

    }
}

