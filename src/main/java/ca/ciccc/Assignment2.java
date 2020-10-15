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
        String result = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++){
                result += ".";
            }
            for (int j = (n - i) + 1; j <= n; j++) {
                result += i;
            }
            result += "\n";
        }
        result = result.replaceAll("\n$", "");
        return result;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        // Todo: your code goes here
        int cnt1s = 0;
        int cnt7s = 0;
        for (int n : nums) {
            if (n == 1)
                cnt1s++;
            else if (n == 7)
                cnt7s++;
        }
        return cnt1s > cnt7s;
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
        int cnt = 0;
        boolean unlucky = false;
        for (int n : nums) {
            if (n == 13)
                unlucky = true;
            else if (unlucky)
                unlucky = false;
            else
                cnt += n;
        }
        return cnt;
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
        // Todo: your code goes here
        if (nums == null || nums.length == 0)
            return new int[]{};

        int[] result = new int[nums.length];
//        for (int i = 1; i < nums.length; i++) {
//            result[i-1] = nums[i];
//        }
        System.arraycopy(nums, 1, result, 0, nums.length - 1);
        result[result.length-1] = nums[0];
        return result;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        // Todo: your code goes here
        for (int i = 0; i < nums.length; i++){
            if (isIncreasing(nums, i, 2))
                return true;
        }
        return false;
    }
    private boolean isIncreasing(int[] nums, int stInd, int len) {
        int edInd = stInd + len;
        if (edInd > nums.length - 1) {
//            System.out.println(String.format("Out of range. st: %d, ed: %d, maxInd: %d", stInd, edInd, nums.length-1));
            return false;
        }
        for (int i = stInd; i < edInd; i++){
//            System.out.println(String.format("nums[%d] + 1: %d , nums[%d]: %d", i, nums[i]+1, i+1, nums[i+1]));
            if (nums[i] + 1 != nums[i+1])
            {
//                System.out.println(String.format("Not in order"));
                return false;
            }
        }
        return true;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        // Todo: your code goes here
        int cntEven = 0;
        int cntOdd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                cntEven++;
            else
                cntOdd++;
        }
        return cntEven == cntOdd;
    }
}

