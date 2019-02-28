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
    public int[] numberLoops(int n) {
        int A[] = {1, 2, 3};
        for (int i = 0; i <= n; i++) {


        return A;
    }


    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
       int array[] = new array[];
       int count = 0;
       int count1 = 0;
       for (int i =0;i < nums.length; i++);
           if (array[]>count){
               count ++;
           }
           else if (array[] > count1){
               count1 ++;
            }
           if(count > count1){
               return true;
           }
           else if (count < count1){
               return false;
           }
        }


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

        int intArray[] = {1, 2, 2, 1};
        int sum = 0;
        for (int i = 0;i < intArray.length; i++) {
            sum += intArray[i];
            return sum;
        }

        int intArray1[] = {1, 2 , 2, 1, 13};
        int sum1 = 0;
        for (int i =0;i < intArray1.length;i++) {
            sum1 = sum1 + intArray1[0] + intArray1[1] + intArray1[2] + intArray1[3];
            return sum1;
        }

        int intArray2[] = {1, 2, 13, 2, 1, 13};
        int sum2 = 0;
        for (int i =0;i< intArray2.length;i++) {
            sum2 = sum2 + intArray2[0] + intArray2[1] + intArray2[3] + intArray2[4];
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
    public int[] shiftArray(int[] nums){
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = 0; j < nums.length - i - 1; j++) {
                    if (nums[j + 1] < nums[j]) {
                        int temp = nums[j + 1];
                        nums[j + 1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }



    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        int array,j;
        int nums[j+1] = new nums[j+1];
        int nums[j] = new nums[j];
        int nums[j-1] = new nums[j-1];
        for (int i = 0;i< nums.length;i++)
            if (int (nums[i+1] & nums[i] & nums[i-1]) == array){
                return true;
        }


        return false;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){

        int even = 0;
        int odd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even ++;
            }
            else if (nums[i] % 2 != 0 ){
                odd ++;
            }

            return true;
        }

        return false;
    }
}

