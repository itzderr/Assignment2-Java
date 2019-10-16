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
        String output = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= n - (i + 1)) {
                    output += Integer.toString(i + 1);
                } else {
                    output += ".";
                }
            }
            if (i != n - 1) {
                output += "\n";
            }
        }
        return output;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        int ones = 0;
        int sevens = 0;
        for (int i:nums) {
            if (i == 1) {
              ones++;
            }
            if (i == 7) {
                sevens++;
            }
        }
        if (ones > sevens) {
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
    public int sumExcept13(int[] nums) {
        int sum = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 13) {
                i += 2;
            } else {
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
     */
    public int[] shiftArray(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = first;
        return nums;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i+1] - nums[i] == 1 && nums[i+2] - nums[i+1] ==1) {
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
        if (nums.length % 2 !=0) {
            return false;
        }
        int odds = 0;
        int evens = 0;
        for (int i:nums) {
            if (i % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }
        if (odds == evens) {
            return true;
        }
        return false;
    }
}

