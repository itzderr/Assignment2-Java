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
        int rows = square.length;
        // Reference of cols variable is as follows
        // https://www.javatpoint.com/java-program-to-find-the-sum-of-each-row-and-each-column-of-a-matrix
        int cols = square[0].length;

        // Make an amount of first row
        // Thanks to Takayasu I could come up with setting sumFirstRow variable
        int sumFirstRow = 0;
        for(int col = 0; col <= cols - 1; col++){
            sumFirstRow += square[0][col];
        }

        // Make an amount of second and other rows
        int sumRow = 0;
        for(int row = 1; row <= rows - 1; row++){
            sumRow = 0;
            for(int col = 0; col <= cols - 1; col++){
                sumRow += square[row][col];
            }
            if(sumRow != sumFirstRow){
                return false;
            }
        }

        // Make an amount of first col
        // Thanks to Takayasu I could come up with setting sumFirstCol variable
        int sumFirstCol = 0;
        for(int row = 0; row <= rows - 1; row++){
            sumFirstCol += square[row][0];
        }

        // Make an amount of all cols
        int sumCol = 0;
        for(int col = 1; col <= cols - 1; col++){
            sumCol = 0;
            for(int row = 0; row <= rows - 1; row++){
                sumCol += square[row][col];
            }
            if(sumFirstCol != sumCol){
                return false;
            }
        }

        // Check if sum of each row and col is equal.
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

