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
     * Sample Input / Output numberLoops(3);
     * <p>
     * Sample Output ..1 .22 333
     */
    public int numberLoops(int n) {
        // Todo: your code goes here
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (5 -i); j++) {
            System.out.print(".");}
        for (int k = 1; k <= i; k++) {
            System.out.print(i);}
        System.out.println();
        }

        return n;
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        // Todo: your code goes here
//        int a = 0;
//        int b = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == 1)
//                a++;
//            else if(nums[i] == 7)
//                b--;

        int c1s = 0;
        int c7s = 0;
        boolean result = false;

        for (int i = 0; i <= nums.length-1; i++){
            if (nums[i] == 1) {
                c1s++;
            }
            if (nums[i] == 7){
                c7s++;
            }
        }
        if (c1s > c7s){
            result = true;
        }
        return result;
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
        int e = 0;

        while (e < nums.length) {
            if (nums[e] == 13) {
                e += 2;
            } else {
                sum += nums[e];
                e += 1;
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
//        int temp [] = nums[]
//        int newArray[] = new int[nums - 1];
//
//            for (int i = 1 ; i < nums.length - 1; i++)
        return null;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        // Todo: your code goes here
        int count = 0;
        while(count < nums.length){
            if (nums[count] % 3 == 0){
                return true;
            }
            count++;
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
        int count = 0;
        int odd = 0;
        int even = 0;

        while(count < nums.length){
            if (nums[count] % 2 == 0){
                even ++;
            }
            if (nums[count] % 2 == 1){
                odd ++;
            }
            count++;
        }
        if (odd == even){
            return true;
        }
        return false;
    }
}