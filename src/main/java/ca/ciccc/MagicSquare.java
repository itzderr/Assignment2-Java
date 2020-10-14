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
        // TODO: You need to implement this method.

        int len = square.length;

        int magicNumber = arraySum(square[0]);


        //  1.Check in horizontal way. Is each sum of {->} magicNumber?
        for (int row = 0; row <= len-1; row++) {
            if (arraySum(square[row]) != magicNumber) return false;
        }

        //  2.Check in vertical way. Is each sum of {↓} magicNumber?
        for (int col = 0; col <= len-1; col++) {

            int verticalSum = 0;
            for (int row = 0; row <= len -1; row++) {
                verticalSum += square[row][col];
            }

            if (verticalSum != magicNumber) return false;
        }

        // This is a checker about Diagonal way

//        // 3.Check in Diagonal way. Is sum of {↘} magicNumber?.
//        int DiagonalToLeftSum = 0;
//        for (int i = 0; i <= len-1; i++) {
//            DiagonalToLeftSum += square[i][i];
//            if (DiagonalToLeftSum != magicNumber) return false;
//        }
//
//        // 4.Check in Diagonal way. Is sum of {↙} magicNumber?.
//        int DiagonalToRightSum = 0;
//        for (int i = 0; i <= len-1; i++) {
//            DiagonalToRightSum += square[i][(len-1)-i];
//            if (DiagonalToRightSum != magicNumber) return false;
//        }


        return true;
    }

    /**
     * Calculate the sum of elements in one dimensional array.
     * @param array one dimensional array, like {1,2,5,3}
     * @return int as a sum. Ex, {1,2,5,3} -> 11
     */
    public static final int arraySum(Integer[] array) {
        int sum = 0;
        for (int val : array) {
            sum += val;
        }
        return sum;
    }


    /**
     * Check if {@code this.square} is magic square or not.
     * @return {@code true} if {@code square} is magic, otherwise {@code false}
     */
    public boolean isMagicSquare() {

        return isMagicSquare(this.square);
    }
}
