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
        // Todo: your code goes here
        String chain = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                chain = chain + ".";
            }
            for (int k = 1; k <= i; k++) {
                chain = chain + i;
                if (k == i && i < n) {
                    chain = chain + "\n";
                }
            }
        }

        return chain;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     *
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        // Todo: your code goes here

        int value7 = 0;
        int value1 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) value1 += 1;
            if (nums[i] == 7) value7 += 1;
        }
        Boolean counter = false;
        counter = value7 < value1;
        return counter;


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
        // Todo: your code goes here
        int sum = 0;
        if (nums == null) {
            return 0;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 13) {
                sum += nums[j];
            } else {
                j++;

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
        // Todo: your code goes here
        if (nums.length <= 0) {
            return nums;
        }
        int[] new_array = new int[nums.length];
        //saving the first element to move it to the last index
        int first = nums[0];

        for (int i = 0, j = 1; j < nums.length; i++, j++) {
            new_array[i] = nums[j];
        }
        // adding the first element to the final index.
        new_array[new_array.length - 1] = first;

        return new_array;

    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     *
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        // Todo: your code goes here
        //Counter starting at 1.
        int counter = 1;

        for (int i = 1; i < nums.length; i++) {
            //If it's' larger than the last index I increment the counter
            // because are adjacent that's why the rest must be 1
            if (nums[i] - nums[i - 1] == 1) {
                counter++;
            }
            //If it isn't we restart the counter
            else {
                counter = 1;
            }
            if (counter == 3) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     *
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums) {
        // Todo: your code goes here

        int even = 0;
        int odd = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] % 2) == 0)
                odd++;
            else
                even++;
        }
        return even == odd;
    }
}

