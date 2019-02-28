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
        String lines = "";

        for (int i = 1; i <= n; ++i) {
            String line = "";

            for (int j = 0; j < n - i; ++j) {
                line += ".";
            }

            for (int j = 0; j < i; ++j) {
                line += String.format("%d", i);
            }

            lines += line;

            if (i < n) {
                lines += "\n";
            }
        }

        return lines;
    }

//    public String numberLoops(int n) {
//        String numberloops = new String();
//        for(int i = 0;i < n;i++) {
//
//        }
//        return null;
//    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        boolean isgreater = false;
        int ones = 0;
        int sevens = 0;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] / 1 == 1) {
                ones++;
            }
            else if(nums[i] / 7 == 1) {
                sevens++;
            }
        }
        if(ones > sevens) {
            isgreater = true;
        }
        else {
            isgreater = false;
        }
        return isgreater;
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
        int total = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 13) {
                ++i;

                continue;
            }

            total += nums[i];
        }

        return total;
    }
//    public int sumExcept13(int[] nums) {
//        int not13 = 0;
//        for(int i = 0;i < nums.length;i++) {
//            if(nums[i] % 13 == 0 && nums[i] != 0) {
//                nums[i] = 0;
//                nums[i + 1] = 0;
//            }
//        }
//        for(int j = 0; j < nums.length; j++) {
//            not13 += nums[j];
//        }
//        return not13;
//    }

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
        int[] shifted = new int[nums.length];

        for (int i = 0; i < nums.length; ++i) {
            if (i == 0) {
                shifted[shifted.length - 1] = nums[i];
            } else {
                shifted[i - 1] = nums[i];
            }
        }

        return shifted;
    }
//    public int[] shiftArray(int[] nums) {
//        int[] leftshifted = new int[nums.length];
//        for(int i = 0;i < nums.length;i++) {
//            if(i == 0) {
//                leftshifted = nums;
//            }
//            else if(i > 0) {
//                leftshifted[0] = nums[nums.length - 1];
//                leftshifted[leftshifted.length - 1] = nums[nums.length - 2];
//                leftshifted[i] = nums[i + 1];
//                return leftshifted;
//            }
//        }
//        return leftshifted;
//    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        int increasingStreak = 1;
        int lastNumber = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == lastNumber + 1) {
                increasingStreak += 1;
            } else {
                increasingStreak = 1;
            }

            lastNumber = nums[i];

            if (increasingStreak == 3) {
                return true;
            }
        }

        return false;
    }
//    public boolean tripleIncreasingOrder(int[] nums) {
//        int threeAdjacent = 0;
//        boolean have = false;
//        for(int i = 0;i < nums.length;i++) {
//            if(nums[i + 1] - nums[i] == 1 && nums[i] - nums[i - 1] == 1) {
//                threeAdjacent++;
//            }
//            else if(i == 0) {
//                threeAdjacent = 0;
//            }
//            else {
//                threeAdjacent = 0;
//            }
//        }
//        if(threeAdjacent > 0) {
//            have = true;
//        }
//        else {
//            have = false;
//        }
//        return have;
//    }
//
    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums) {
        int odd = 0;
        int even = 0;
        for(int i = 0; i < nums.length;i++) {
            if(i % 2 == 0) {
                even++;
            }
            else if(i % 2 == 1) {
                odd++;
            }
        }

        return odd == even;

//        if(odd == even) {
//            return true;
//        }else {
//            return false;
//        }
    }

    }


