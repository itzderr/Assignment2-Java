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

        StringBuilder ans = new StringBuilder();
        int points = n - 1;
        int numbers = n - points;

        if (n == 1) {
            ans.append("1");
            return String.valueOf(ans);
        }

        for (int i = 1; i < n + 1; i++) {

            for (int j = 0; j < points; j++) {
                ans.append(".");
            }
            points--;

            for (int k = 0; k < numbers; k++) {
                ans.append(i);
            }
            if (points== -1){
                return String.valueOf(ans);
            }
            numbers++;
            ans.append("\n");
        }
        return String.valueOf(ans);
    }




    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        int ones = 0;
        int sevens = 0;

        for (int num : nums) {
            if (num == 1) {
                ones++;
            }
            if (num == 7) {
                sevens++;
            }
        }
        return ones > sevens;
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
                nums[i] = 0;
                if (i != nums.length - 1) {
                    nums[i + 1] = 0;
                }
            }
            sum = sum + nums[i];
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
     * shiftArray({6, 2, 4, 3}) -> {2, 4, 3, 6}
     * shiftArray({2, 3}) -> {3, 2}
     * shiftArray({7}) -> {7}
     */
    public int[] shiftArray(int[] nums) {
        if (nums.length < 1) {
            return nums;
        }
        int temp = nums[0];
        int i = 1;
        while (i < nums.length) {
            nums[i-1] = nums[i];
            i++;
        }
        nums[nums.length - 1] = temp;
        return nums;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        int count = 0;

        if (nums.length < 3) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                count = count + 1;
            } else {
                count = 0;
            }
            if (count == 2) {
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
        int odds = 0;
        int even = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                odds++;
            } else {
                even++;
            }
        }
        return odds == even;
    }
}

