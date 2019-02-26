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

        String printWord = "";
        
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {

                if(n - j + 1 <= i) {
                    printWord += Integer.toString(i);
                } else {
                    printWord += ".";
                }
            }
            if(i < n) {
                printWord += "\n";
            }
        }
        return printWord;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {

        boolean isOnesGreater = false;

        int oneCount = 0;
        int sevenCount = 0;
        
        for(int i = 0; i <= nums.length - 1; i++) {
            if(nums[i] == 1) {
                oneCount += 1;
            }
            if(nums[i] == 7) {
                sevenCount += 1;
            }
        }
        if(sevenCount < oneCount) {
            isOnesGreater = true;
        }

        return isOnesGreater;
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
        
        int arraySum = 0;
        boolean afterThirteenFlg = false;

        for(int i : nums) {
            if(i == 13){
                afterThirteenFlg = true;

                continue;
            } 
            if(afterThirteenFlg) {
                afterThirteenFlg = false;

                continue;
            }
            arraySum += i;
        }

        return arraySum;
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

        int[] newNums = new int[nums.length];

        if(nums.length == 0) {
            return newNums;
        }
        
        for(int i = 0; i <= nums.length - 2; i ++) {
            newNums[i] = nums[i + 1];
        }
        newNums[nums.length - 1] = nums[0];

        return newNums;
    }
    
    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        
        boolean tripleIncreasingOrderFlg = false;
        for(int i = 0; i <= nums.length - 2; i++) {
            if(nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]) {
                tripleIncreasingOrderFlg = true;
                break;
            }
        }

        return tripleIncreasingOrderFlg;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){

        boolean isEvenAndOddSameCount = false;

        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i <= nums.length - 1; i++) {
            if(i % 2 == 0){
                evenCount += 1;
            } else {
                oddCount += 1;
            }
        }
        if(evenCount == oddCount) {
            isEvenAndOddSameCount = true;
        }

        return isEvenAndOddSameCount;
    }
}

