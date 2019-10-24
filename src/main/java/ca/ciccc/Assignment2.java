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
        String finalString = "";
        for (int i = 1; i <= n; i++) {
            for (int x = n; x >= 1; x--) {
                if (x > i) {
                    finalString += ".";
                } else {
                    finalString += i;
                }
            }
            if (i != n)
                finalString += "\n";
        }

        return finalString;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     *
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        // Todo: your code goes here
        int n = 0;
        int isSeven = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 7)
                isSeven += 1;
            else if (nums[i] == 1)
                n += 1;
        }

        return isSeven < n;
    }

    /**
     * Return the sum of numbers in the array, returning 0 for an empty array. Except the number 13
     * is very unlucky, so it does not count the number that comes immediately after a 13, also 13 itself
     * does not count.
     *
     * @param nums array of numbers
     * @return the sum except for 13
     * <p>
     * Sample Input / Output
     * sumExcept13({1, 2, 2, 1}) -> 6
     * sumExcept13({1, 2, 2, 1, 13} -> 6
     * sumExcept13({1, 2, 13, 2, 1, 13} -> 4
     */
    public int sumExcept13(int[] nums) {
        int s = 0;
        boolean isThirteen = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                isThirteen = true;
            } else if (isThirteen == false) {
                s += nums[i];
            } else {
                isThirteen = false;
            }
        }
        return s;
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
        if (nums.length > 0) {
            int firstNum = nums[0];
            for (int x = 1; x < nums.length; x++) {
                nums[x - 1] = nums[x];
            }
            nums[nums.length - 1] = firstNum;
        }
        return nums;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     *
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {

        boolean isSeq = false;

        for (int x = 0; x < nums.length; x++) {
            if (x + 1 < nums.length) {
                if (nums[x + 1] == nums[x] + 1) {
                    if (x + 2 < nums.length && nums[x + 2] == nums[x + 1] + 1) {
                        isSeq = true;
                        break;
                    }
                }
            }
        }

        return isSeq;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     *
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                odd += 1;
            } else {
                even += 1;
            }
        }
        return odd == even;
    }
}

