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

        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                if (n - y + 1 <= x) {
                    pattern += String.format("%d", x);
                } else {
                    pattern += ".";
                }
            }
            if (x < n) {
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

        int one = 0;
        int seven = 0;

        for (int x = 0; x <= nums.length - 1; x++) {
            if (nums[x] == 1) {
                one += 1;
            }
            if (nums[x] == 7) {
                seven += 1;
            }
        }
        return one > seven;
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

        for (int x = 0; x < nums.length; x++) {
            if (nums[x] == 13) {
                x += 1;
            } else {
                sum = sum + nums[x];
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

        if (nums.length != 0) {
            int temp = nums[0];
            for (int x = 0; x < nums.length - 1; x++) {
                nums[x] = nums[x + 1];
            }
            nums[nums.length - 1] = temp;
        }
        return nums;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        // Todo: your code goes here

        int count = 0;
        for (int x = 0; x <= nums.length - 3; x++) {
            if (nums[x] == (nums[x + 1] - 1) && nums[x] == (nums[x + 2] - 2)) {
                count += 1;
            }
        }
        return count >= 1;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        // Todo: your code goes here

        int count = 0;
        for(int x = 0; x <= nums.length -1; x++){
            if(nums[x] % 2 == 0){
                count += 1;
            }
        }
        return count == (nums.length - count);
    }
}

