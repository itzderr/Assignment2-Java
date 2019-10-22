package ca.ciccc;

import java.util.Arrays;
import java.util.stream.Collectors;

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
        int nLength = String.valueOf(n).length();

        char[] placeholderCharacters = new char[nLength];
        for (int i = 0; i < nLength; i++) {
            placeholderCharacters[i] = '.';
        }
        String placeholder = String.copyValueOf(placeholderCharacters);

        String[][] data = new String[n][n];
        for (int i = 0; i < n; i++) {
            int num = i + 1;

            String rowNumberString = String.valueOf(num);
            int lengthDiff = nLength - rowNumberString.length();
            char[] rowChars = new char[lengthDiff];
            for (int x = 0; x < lengthDiff; x++) {
                rowChars[x] = '.';
            }
            String rowString = String.copyValueOf(rowChars) + rowNumberString;

            int numDiff = n - num;
            for (int j = 0; j < numDiff; j++) {
                data[i][j] = placeholder;
            }
            for (int j = numDiff; j < n; j++) {
                data[i][j] = rowString;
            }
        }

        return String.join(
            "\n",
            Arrays.stream(data).map(row -> String.join("", row)).toArray(String[]::new)
        );
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        int trueCounter = 0;
        for (int num: nums) {
            if (num == 1) trueCounter++;
            else if (num == 7) trueCounter--;
        }
        return trueCounter > 0;
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
        if (nums.length == 0) {
            return nums;
        }

        int head = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = head;
        return nums;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        final int sequenceLength = 3;
        int iterationCount = sequenceLength - 1;
        int lastIndex = nums.length - iterationCount;
        for (int i = 0; i < lastIndex; i++) {
            for (int j = iterationCount; j > 0; j--) {
                if (nums[i] + 1 != nums[i+1]) {
                    continue;
                }
                if (j == 1) {
                    return true;
                }
                i++;
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

        return false;
    }
}

