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

        StringBuilder result = new StringBuilder();
        for (int row = 0; row < n; row++){
            for (int dot = n - 1; dot > row; dot--) {
                result.append(".");
            }
            for (int number = 0; number <= row; number++) {
                result.append(row + 1);
            }
            if (row != n - 1) {
                result.append("\n");
            }
        }
        return result.toString();

    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        // Todo: your code goes here

        int number = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                number++;
            }
            else if(nums[i] == 7){
                number--;
            }
        }
        return (number > 0);

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
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 13) {
                i++;
            }
            else {
                sum += nums[i];
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
        if(nums.length < 1)
            return nums;

        int first = nums[0];

        for(int i = 1; i < nums.length; i++)
            nums[i - 1] = nums[i];

        nums[nums.length - 1] = first;

        return nums;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        // Todo: your code goes here
        boolean increase = false;

        for (int y = 0; y < nums.length -2; y++){
            if (nums[y] == nums[y + 1] - 1 && nums[y] == nums[y + 2] - 2){
                increase = true;
                break;
            }
        }

        return increase;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        // Todo: your code goes here
        int even = 0;
        int odds = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even++;
            } else {
                odds++;
            }
        }
        if (even == odds) {
            return true;
        }
        return false;
    }
}

