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
    // this exercise Douglas Ciole help and teach me all steps
    public static boolean isMagicSquare(Integer[][] square) {
        boolean isMagic = true;
        int[] cols = new int[square.length];
        int[] rows = new int[square.length];

        // summing the indexes
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                rows[i] += square[i][j];
                cols[j] += square[i][j];
            }
        }
        // verifying if first value is zero
        int frtVal = 0;
        for (int i = 0; i < cols.length; i++) {
            if (i == 0) {
                frtVal = cols[i];
            }
            // when the index col is different than value (frtVal) the cube is false
            for (int j = 0; j < rows.length; j++) {
                if (rows[j] != frtVal) {
                    isMagic = false;
                    break;
                }
            }
            // is cube is false break and became false
            if (!isMagic)
                break;
            else if (frtVal != cols[i]) {
                isMagic = false;
                break;
            }

        }

        return isMagic;
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
