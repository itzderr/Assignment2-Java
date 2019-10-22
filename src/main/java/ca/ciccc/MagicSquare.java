package ca.ciccc;

/**
 *
 * Magic Squares are square arrays of numbers that have the interesting property that
 * the numbers in each column, and in each row, all add up to the same total.
 *
 * Given an n x n square of numbers, determine if it is magic square.
 *
 * Reference: {@link java.lang.Integer}
 * Integer is a wrapper class for {@code int} primitive type.
 */
public class MagicSquare {
    /* n rows and n cols square */
    private int n;
    /* 2-Dimensional array to represent the square */
    private Integer[][] square;

    /**
     * Constructor that takes n as the number of rows and cols.
     * @param n number of rows and cols.
     */
    public MagicSquare(int n) {
        this.n = n;
    }

    /**
     * Constructor that takes n as the number of rows and cols.
     * Initializes square 2-Dimensional array.
     * @param n number of rows and cols.
     * @param square
     */
    public MagicSquare(int n, Integer[][] square) {
        this.n = n;
        this.square = square;
    }

    /**
     * Getter for square
     * @return {@code this.square}
     */
    public Integer[][] getSquare() {
        return square;
    }

    /**
     * Setter for square.
     * @param square
     */
    public void setSquare(Integer[][] square) {
        this.square = square;
    }

    /**
     * Check if {@code square} is magic square or not.
     * @param square 2-Dimensional array
     * @return {@code true} if {@code square} is magic, otherwise {@code false}
     *
     * Sample Input
     * {
     *   {16, 3, 2, 13},
     *   {5, 10, 11, 8},
     *   {9, 6, 7, 12},
     *   {4, 15, 14, 1}
     * }
     *
     * Sample Output
     * true
     *
     * Explanation: The sums of each row and col are equal.
     */
    public static boolean isMagicSquare(Integer[][] square) {

        // sum n rows == sum n cols
        //for (int r = 0; r < square.length; r++)
        Integer[] rowSums = rowSum(square);
        Integer[] colSums = colSum(square);
        int firstRowSum = rowSums[0];
        for(int i = 0; i < rowSums.length; i++) {
            if (rowSums[i] != firstRowSum) {
                return false;
            }
        }
        for(int i = 0; i < colSums.length; i++) {
            if (colSums[i] != firstRowSum) {
                return false;
            }
        }

        return true;
    }

    public static Integer[] colSum(Integer[][] arr) {
        Integer[] colSum = new Integer[arr.length];
        for(int col = 0; col < arr[0].length; col++) {
            int colTotal = 0;
            for(int row = 0; row < arr.length; row++) {
                colTotal += arr[row][col];
            }
            colSum[col] = colTotal;
        }
        return colSum;
    }

    public static Integer[] rowSum(Integer[][] arr) {
        Integer[] rowSums = new Integer[arr.length];
        for(int r = 0; r < rowSums.length; r++) {
            int rowSum = 0;
            for(Integer elem: arr[r]) {
                rowSum += elem;
            }
            rowSums[r] = rowSum;
        }
            // TODO: You need to implement this method.
        return rowSums;
    }

    /**
     * Check if {@code this.square} is magic square or not.
     * @return {@code true} if {@code square} is magic, otherwise {@code false}
     */
    public boolean isMagicSquare() {
        return isMagicSquare(this.square);
    }
}

