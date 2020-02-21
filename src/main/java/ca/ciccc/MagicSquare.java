package ca.ciccc;

/**
 *
 * Magic Squares are square arrays of numbers that have the interesting property
 * that the numbers in each column, and in each row, all add up to the same
 * total.
 *
 * Given an n x n square of numbers, determine if it is magic square.
 *
 * Reference: {@link java.lang.Integer} Integer is a wrapper class for
 * {@code int} primitive type.
 */
public class MagicSquare {
    /* n rows and n cols square */
    private int n;
    /* 2-Dimensional array to represent the square */
    private Integer[][] square;

    /**
     * Constructor that takes n as the number of rows and cols.
     *
     * @param n number of rows and cols.
     */
    public MagicSquare(int n) {
        this.n = n;
    }

    /**
     * Constructor that takes n as the number of rows and cols. Initializes square
     * 2-Dimensional array.
     *
     * @param n      number of rows and cols.
     * @param square
     */
    public MagicSquare(int n, Integer[][] square) {
        this.n = n;
        this.square = square;
    }

    /**
     * Getter for square
     *
     * @return {@code this.square}
     */
    public Integer[][] getSquare() {
        return square;
    }

    /**
     * Setter for square.
     *
     * @param square
     */
    public void setSquare(Integer[][] square) {
        this.square = square;
    }

    /**
     * Check if {@code square} is magic square or not.
     *
     * @param square 2-Dimensional array
     * @return {@code true} if {@code square} is magic, otherwise {@code false}
     *
     *         Sample Input { {16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15,
     *         14, 1} }
     *
     *         Sample Output true
     *
     *         Explanation: The sums of each row and col are equal.
     */
    public static boolean isMagicSquare(Integer[][] square) {
        boolean flg = true;
        int sum = 0;
        int[] colSum = new int[square.length];
        for (int i = 0; i < square.length; i++) {
            Integer[] row = square[i];
            int rowSum = 0;
            for (int j = 0; j < row.length; j++) {
                int num = row[j];
                if (i == 0) {
                    sum += num;
                } else {
                    rowSum += num;
                }
                colSum[j] += num;
            }
            if (i > 0 && rowSum != sum) {
                flg = false;
                break;
            }
        }
        if (!flg) {
            return false;
        }
        return hasEqualSums(colSum);
    }

    private static boolean hasEqualSums(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        boolean flg = true;
        for (int i = 0; i < nums.length; i++) {
            if (i < 1) {
                continue;
            }
            if (nums[i - 1] != nums[i]) {
                flg = false;
                break;
            }
        }
        return flg;
    }

    /**
     * Check if {@code this.square} is magic square or not.
     *
     * @return {@code true} if {@code square} is magic, otherwise {@code false}
     */
    public boolean isMagicSquare() {
        return isMagicSquare(this.square);
    }
}
