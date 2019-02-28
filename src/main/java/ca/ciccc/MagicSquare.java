package ca.ciccc;

/**
 * Magic Squares are square arrays of numbers that have the interesting property that
 * the numbers in each column, and in each row, all add up to the same total.
 * <p>
 * Given an n x n square of numbers, determine if it is magic square.
 * <p>
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
     *
     * @param n number of rows and cols.
     */
    public MagicSquare(int n) {
        this.n = n;
    }

    /**
     * Constructor that takes n as the number of rows and cols.
     * Initializes square 2-Dimensional array.
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
     * <p>
     * Sample Input
     * {
     * {16, 3, 2, 13},
     * {5, 10, 11, 8},
     * {9, 6, 7, 12},
     * {4, 15, 14, 1}
     * }
     * <p>
     * Sample Output
     * true
     * <p>
     * Explanation: The sums of each row and col are equal.
     */
    public static boolean isMagicSquare(Integer[][] square) {

        int firstRowSum = 0;
        for (int i = 0; i < square.length; i++) {
            firstRowSum += square[0][i];
        }

        for (int i = 0; i < square.length; i++) {
            int sumRow = 0;
            int sumColumn = 0;
            for (int j = 0; j < square.length; j++) {
                sumRow += square[i][j];
                sumColumn += square[j][i];
            }
            if (sumRow != firstRowSum || sumColumn != firstRowSum)
                return false;
        }

        return true;
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
