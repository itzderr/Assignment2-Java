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
        String result = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                result = result + ".";
            }
            for (int h = 0; h < i; h++) {
                result = result + i;
            }
            if (i < n)
                result += "\n";
        }
        return result;
    }


    public boolean countNumbers(int[] nums) {

        int ones = 0;
        int sevens = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ones++;
            } else if (nums[i] == 7) {
                sevens++;
            }

        }
        if (ones > sevens)

            return true;

        return false;
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
        if (nums.length < 1) return 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 13) {
                sum = sum + nums[i];
            } else {
                i = i + 1;
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

        if (nums.length <= 1) return nums;
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;


        return nums;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     *
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2])
                return true;
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

        int odds = 0;
        int evens = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                odds++;
            } else if (nums[i] % 2 == 0) {
                evens++;
            }

        }
        if (odds == evens)

            return true;


        return false;
    }
}

