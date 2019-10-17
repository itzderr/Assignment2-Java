package ca.ciccc;
import java.util.Arrays;

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
    public static void main(String[] args) {
//        System.out.println(numberLoops(5));
//        System.out.println(countNumbers({1, 7, 1}));
//        int[] number = {2, 5, 3, 6};
//        countNumbers(number);
//        System.out.println(countNumbers(number));
//        System.out.println("hey");
//        System.out.println(sumExcept13(number));
//        System.out.println(shiftArray(number));
//        System.out.println(tripleIncreasingOrder(number));
    }

    public static String numberLoops(int n) {

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++){
            int count = 0;
            for(int j = 1; j <= n; j++){
                count = n - i;
                if(j <= count) {
                    sb.append(".");
                }else{
                    sb.append(i);
                }
            }

            if( i != n) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public static boolean countNumbers(int[] nums) {
        int count1 = 0;
        int count7 = 0;

        for(int n: nums){
            if(n == 1){
                count1++;
            }else if(n == 7){
                count7++;
            }
        }

        boolean result = true;
        if(!(count1 > count7)){
            result = false;
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
    public static int sumExcept13(int[] nums) {
        int sum = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] == 13){
                i += 2;
            }else{
                sum += nums[i];
                i++;
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
    public static int[] shiftArray(int[] nums) {

        if(nums.length == 0){return nums;};

        int[] newArr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(i == nums.length - 1){
                newArr[i] = nums[0];
            }else {
                newArr[i] = nums[i + 1];
            }
        }

        return newArr;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public static boolean tripleIncreasingOrder(int[] nums) {

        if(nums.length < 3){return false;};

        for(int i = 2; i < nums.length; i++){
            if((nums[i - 1] == nums[i - 2] + 1) && nums[i] == nums[i - 1] + 1){
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
    public static boolean evenOrOdd(int[] nums){
        int oddNum = 0;
        int eveNum = 0;

        for(int n: nums){
            if(n % 2 == 0){
                eveNum++;
            }else{
                oddNum++;
            }
        }

        boolean result = false;
        if(eveNum == oddNum){
            result = true;
        }
        return result;
    }
}

