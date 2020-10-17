package ca.ciccc;

//import java.util.Scanner;

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

        for (int i = 1; i <= n; i++) {
            //System.out.println(n);
            for (int j = 3; j <= n+i; j++) {
                System.out.print(i);
            }
            System.out.println(".");
        }
        return String.valueOf(n);
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        // Todo: your code goes here
        int x = 0;

       for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1) {
                return true;
            } else if (nums[i] == 7) {
                return false;
            }
        }
        return false;}





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
        for(int x = 0; x < nums.length; x++) {
            if(nums[x]== 13) {
                nums[x]=0;
                if(nums[x] <nums.length) {
                    nums[x+1]=0;
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
     * shiftArray({6, 2, 5, 3}) -> {2, 4, 3, 6}
     * shiftArray({2, 3}) -> {3, 2}
     * shiftArray({7}) -> {7}
     */

    public int[] shiftArray(int[] nums) {
        // Todo: your code goes here
//           Object arr=nums[nums];

        if(nums.length<1){
            return nums;}
        int sw=nums[0];
        for(int i = 0; true; i++) {
        nums[i-1]=nums[i];
        nums[nums.length-1]=sw;
        return nums[]}
        }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        // Todo: your code goes here
       // int[]nums=0;
        boolean three=false;
            for (int x=0; x<nums.length-2; x++){
                        if (nums[x] == nums[x+1]- 1 && nums[x] == nums[x + 2]- 2){
                            three = true;
                            break;
                        }
            }
        return three; }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        // Todo: your code goes here
            boolean even=false;
            boolean odds=false;
            for(int x=0; x<nums.length-2; x++){
                if(nums[x]%2==0){
                    even=true;
                }else{
                    odds=true;
                }
                return true;
            }
    return nums;}

}


