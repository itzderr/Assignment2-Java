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
        StringBuilder output = new StringBuilder();
        for (int row = 1; row <= n; row++) {
            if (row > 1) {
                output.append("\n");
            }
            for (int column = n; column >= 1; column--) {
                if (column > row) {
                    output.append(".");
                } else {
                    output.append(row);
                }
            }
        }

        return output.toString();
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        int countOne = 0;
        int countSeven = 0;
        for (int num : nums) {
            if (num == 1) {
                countOne++;
            } else if (num == 7) {
                countSeven++;
            }
        }
        return countOne > countSeven;
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
        int total = 0;
        boolean previousUnluckyStep = false;
        for (int num: nums) {
            if (previousUnluckyStep) {
                previousUnluckyStep = false;
                continue;
            }
            if (num == 13) {
                previousUnluckyStep = true;
                continue;
            }
            total += num;
        }

        return total;
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
        int[] shiftedArray = new int[nums.length];

        for (int i = 0; i < nums.length; ++i) {
            if (i == 0) {
                shiftedArray[shiftedArray.length - 1] = nums[i];
            } else {
                shiftedArray[i - 1] = nums[i];
            }
        }

        return shiftedArray;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        for (int i = 0; i < nums.length; i++ ) {
            if (i - 1 >= 0 && i + 1 < nums.length) {
                if (nums[i - 1] + 1 == nums[i] && nums[i] == nums[i + 1] -1) {
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
        int oddCount = 0;
        int evenCount = 0;

        for (int num: nums) {
            if (num % 2 == 1) {
                oddCount++;
            } else {
                evenCount++;
            }
        }

        return oddCount == evenCount;
    }
}

