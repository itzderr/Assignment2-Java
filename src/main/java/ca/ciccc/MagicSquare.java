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
        // sumd1 and sumd2 are the sum of the two diagonals
        int sumd1 = 0;
        int sumd2 = 0;

        for (int i = 0; i < square.length; i++) {
            // (i, i) is the diagonal from top-left -> bottom-right
            // (i, square.length - i - 1) is the diagonal from top-right -> bottom-left
            sumd1 += square[i][i];
            sumd2 += square[i][square.length - 1 - i];
        }
        // if the two diagonal sums are unequal then it is not a magic square
        //if(sumd1 != sumd2)
        //    return false;

        // calculating sums of Rows and Columns and checking if they are equal to each other,
        // as well as equal to diagonal sum or not
        for (int i = 0; i < square.length; i++) {

        int rowSum = 0;
        int colSum = 0;
        for (int j = 0; j < square.length; j++) {

            rowSum += square[i][j];
            colSum += square[j][i];
        }
        if (rowSum != colSum)
            return false;
        }
        return true;
    }

    /**
     * Check if {@code this.square} is magic square or not.
     * @return {@code true} if {@code square} is magic, otherwise {@code false}
     */
    public boolean isMagicSquare() {
        return isMagicSquare(this.square);
    }
}
