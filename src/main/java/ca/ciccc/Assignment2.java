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

        String result = "";

        if (n == 1) {
            result = "1";
        } else {
            int c = 1, c2 = n-1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= c2; j++) {
                    result = result + ".";
                }
                c2--;
                for (int k = 1; k <= c; k++) {
                    result = result + c;
                }
                c++;
                if (c <= n) {
                    result = result + "\n";
                }
            }
        }
        return result;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
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
        return (ones > sevens) ? true : false;
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

        if (nums.length == 0) {
            return sum;
        } else {
            int i;
            for (i = 0; i < nums.length; i++) {
                if (nums[i] != 13) {
                    sum = sum + nums[i];
                } else {
                    sum = sum;
                    i++;
                }
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
     * shiftArray({6, 2, 5, 3}) -> {2, 5, 3, 6}
     * shiftArray({2, 3}) -> {3, 2}
     * shiftArray({7}) -> {7}
     */
    public int[] shiftArray(int[] nums) {

        int[] newArray = new int[nums.length];

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                newArray[newArray.length - 1] = nums[i];
            } else {
                newArray[count] = nums[i];
                count ++;
            }
        }
        return newArray;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {

        if (nums.length < 3) {
            return false;
        } else {
            for (int i = 1; i < nums.length; i++) {
                if ((nums[i-1] == nums[i]-1 && nums[i+1] == nums[i]+1)) {
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

        int odds = 0;
        int evens = 0;

       for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int positive = Math.abs(nums[i]);
                if ((positive % 2 == 0)) {
                    odds++;
                } else {
                    evens++;
                }
            } else {
                if (nums[i]%2 == 0) {
                    odds ++;
                } else {
                    evens ++;
                }
            }
        }
        return (odds == evens) ? true : false;
    }
}

