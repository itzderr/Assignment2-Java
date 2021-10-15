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
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n; i++) {
            // for "."
            for (int j = n - 1; j > i; j--) {
                res.append(".");
            }
            // for number of each row
            for (int j = 0; j <= i; j++) {
                res.append(i + 1);
            }
            // for the last row, don't add a new line
            if (i != n - 1) {
                res.append("\n");
            }
        }

        return res.toString();
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {

        int numOf1s = 0;
        int numOf7s = 0;

        for (int num : nums) {
            if (num == 1) {
                numOf1s += 1;
            } else if (num == 7) {
                numOf7s += 1;
            }
        }

        return numOf1s > numOf7s;

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

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] != 13) {
                    sum += nums[i];
                }
            }
            if (i > 0) {
                if (nums[i] != 13 && nums[i-1] != 13) {
                    sum += nums[i];
                }
            }
        }

        return sum;
    }

    /**
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} return {2, 5, 3, 6}.
     * You may modify and return the given array, or return a new array.
     *
     * @param nums array of ints
     * @return shifted array
     * <p>
     * Sample Input / Output
     * shiftArray({6, 2, 5, 3}) -> {2, 4, 3, 6}
     * shiftArray({2, 3}) -> {3, 2}
     * shiftArray({7}) -> {7}
     */
    public int[] shiftArray(int[] nums) {

        // declare a new int array which has the same size as nums
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            // shift all elements in nums to 1 left
            res[i] = nums[(i + 1) % nums.length];
        }

        return res;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i + 1] == nums[i] + 1) && (nums[i + 2] == nums[i] + 2)) {
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

        int numsOfOdds = 0;
        int numsOfEvens = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                numsOfEvens ++;
            } else {
                numsOfOdds ++;
            }
        }

        return numsOfOdds == numsOfEvens;
    }
}
