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
        this.square = new Integer[n][n];
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
     * Check if {@code square} is magic square or not. (static helper method)
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
        // TODO: You need to implement this method.
        int RowSum1 = 0;
        // Get the sum of the 1st row
        for (int i = 0; i <= square[0].length; i++) {
            RowSum1 += square[0][i];
        }
        // compare if the other rows are equal to the first one
//        for (int j = 0; j <=square[j].length; j++) {
//            int rowSumG = 0;
//            for (int k = 0; k <= square[j].length; k++) {
//                rowSumG += square[j][k];
//            }
//            if (rowSumG == RowSum1) {
//                return true;
//            } else {
//                return false;
//            }
//        }

        // get the sum of the first column
        int ColSum1 = 0;
        for (int j = 0; j < square.length; j++) {
            ColSum1 += square[j][0];
        }

        // compare if the other columns are equal to the first one


        // compare if the first row is equal to the first column
        if (RowSum1 == ColSum1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Check if {@code this.square} is magic square or not.
     * @return {@code true} if {@code square} is magic, otherwise {@code false}
     */
    public boolean isMagicSquare() {
        return isMagicSquare(this.square);
    }
}
