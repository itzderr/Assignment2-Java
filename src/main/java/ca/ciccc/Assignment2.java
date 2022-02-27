package ca.ciccc;


import com.sun.javafx.binding.StringFormatter;

/**
 * This is the starter file for the Assignment 2
 *
 * @author MisatoTanno
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
        String pattern = "" ;
        if (n == 0) {
            return "" + n;
        } else {
            for (int line = 1; line < n; line++) {
                pattern = "" ;
                for (int dot = 0; dot < n-dot-1;dot++)
                    pattern += ".";
                for (int num = 1; num < n;num++) {
                    pattern+= num;
                }
            }
            return pattern;
        }
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        // Todo: your code goes here
        int count = 0;
        for (int i=0; i<nums.length;i++){
            if(nums[i] == 1)
                count ++;
            else if (nums[i] == 7)
                count --;
        }
        return (count > 0);
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
        for (int i = 0; i < nums.length; i++){
            if (nums.length == 0) {
                return 0;
            }
            if (nums[i] == 13) {
                i ++;
            }else
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
        // Todo: your code goes here
        if (nums.length < 1)
            return new int[]{};
        else {
            int startNum = nums[0];
            for (int i = 0; i < nums.length - 1; i++)
                nums[i] = nums[i + 1];
            nums[nums.length-1] = startNum;
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
        boolean isIncrease = false;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]+1 == nums[i+1] && nums[i+1] + 1 == nums[i+2]) {
                isIncrease = true;
                break;
            }
        }
        return isIncrease;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        // Todo: your code goes here
        int oddNumber = 0;
        int evenNumber = 0;
        boolean isSameNumber = false;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] %2 == 0){
                evenNumber++;
            } else {
                oddNumber++;
            }
        if (oddNumber == evenNumber){
            isSameNumber = true;
        } else {
            isSameNumber = false;
        }
        }
        return isSameNumber;
    }
}

