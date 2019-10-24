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
        String final = "";
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                final += ((j > i)?".":i);
            }
            if (i != n)
                final += "\n";
        }


        return null;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        // Todo: your code goes here
        int uno = 0;
        int siete = 0;
        for (int nums : nums) {
            if (nums == 1)
                uno += 1;
            else if (nums == 7)
                siete += 1;

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
        // Todo: your code goes here
        int sum = 0;
        boolean suerte = false;
        for (int num : nums) {
            if (suerte) {
                suerte = false;
            } else {
                if (num == 13) {
                    suerte = true;
                } else {
                    sum += num;
                }
            }

        }
        return 0;
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
        if (nums.length == 0) {
            return nums;
        }
        int first = nums[0];
        System.arraycopy(nums, 1, nums, 0, nums.length - 1);

        nums[nums.length -1] = first;

        return null;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        // Todo: your code goes here
        boolean sequence = false;
        for (int i = 0; i < nums.length; i++) {
            if (i+1 < nums.length) {
                if (nums[i+1] == nums[i]+1) {
                    if (i+2 < nums.length && nums[i+2] == nums[i+1]+1) {
                        sequence = true;
                        break;
                    }
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
        // Todo: your code goes here
        int impar = 0;
        int par = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }
        }
        return false;
    }
}

