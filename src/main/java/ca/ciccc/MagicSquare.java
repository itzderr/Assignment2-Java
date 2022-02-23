package ca.ciccc;

import java.util.Arrays;

/**
 * Magic Squares are square arrays of numbers that have the interesting property that the numbers in
 * each column, and in each row, all add up to the same total.
 * <p>
 * Given an n x n square of numbers, determine if it is magic square.
 * <p>
 * Reference: {@link java.lang.Integer} Integer is a wrapper class for {@code int} primitive type.
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
    this.square = new Integer[n][n];
  }

  /**
   * Constructor that takes n as the number of rows and cols. Initializes square 2-Dimensional
   * array.
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
   * Check if {@code square} is magic square or not. (static helper method)
   *
   * @param square 2-Dimensional array
   * @return {@code true} if {@code square} is magic, otherwise {@code false}
   * <p>
   * Sample Input { {16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1} }
   * <p>
   * Sample Output true
   * <p>
   * Explanation: The sums of each row and col are equal.
   */
  public static boolean isMagicSquare(Integer[][] square) {
    int squareLen = square.length;
    int target = Arrays.stream(square[0]).reduce(0, (a, b) -> a + b);

    // TODO: You need to implement this method.
    for (int i = 1; i < squareLen - 1; i++) {
      int curr = Arrays.stream(square[i]).reduce(0, (a, b) -> a + b);
      int next = Arrays.stream(square[i + 1]).reduce(0, (a, b) -> a + b);
      if (curr != target || curr != next) {
        return false;
      }
    }

    for (int i = 0; i < squareLen-1; i++) {
      int finalI = i;
      Integer[] curr = Arrays.stream(square)
          .reduce(new Integer[]{0}, (a, b) -> new Integer[]{a[0] + b[finalI]});
      if ((int)curr[0] != target) {
        return false;
      }
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
