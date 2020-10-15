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
        int N = square.length;

        int vertical = 0;
        int vertical2 = 0;
        int vertical3 = 0;

        int horizontal = 0;
        int horizontal2 = 0;
        int horizontal3 = 0;

        if(N == 4){
            for (int i = 0; i < N ; i++) {
                vertical = vertical + square[0][i];
            }
            for (int i = 0; i < N ; i++) {
                vertical2 = vertical2 + square[1][i];
            }
            for (int i = 0; i < N ; i++) {
                vertical3 = vertical3 + square[2][i];
            }
            for (int i = 0; i < N ; i++) {
                horizontal = horizontal + square[i][0];
            }
            for (int i = 0; i < N ; i++) {
                horizontal2 = horizontal2 + square[i][1];
            }
            for (int i = 0; i < N ; i++) {
                horizontal3 = horizontal3 + square[i][2];
            }
            if (vertical != vertical2 || vertical != vertical3 || horizontal != vertical3) {
                return false;
            }
        }

        for (int i = 0; i < N ; i++) {
            vertical = vertical + square[0][i];
        }
        for (int i = 0; i < N ; i++) {
            vertical2 = vertical2 + square[1][i];
        }
        for (int i = 0; i < N ; i++) {
            horizontal = horizontal + square[i][0];
        }
        for (int i = 0; i < N ; i++) {
            horizontal2 = horizontal2 + square[i][1];
        }

        if (vertical == horizontal ) {
            return true;
        }
        return false;
    }

    /**
     * Check if {@code this.square} is magic square or not.
     * @return {@code true} if {@code square} is magic, otherwise {@code false}
     */
    public boolean isMagicSquare() {
        return isMagicSquare(this.square);
    }
}