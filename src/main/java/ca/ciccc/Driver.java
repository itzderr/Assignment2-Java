package ca.ciccc;

public class Driver {
    public static void main(String[] args) {
        MagicSquare r1 = new MagicSquare(2);
        MagicSquare r2 = new MagicSquare(2, new Integer[][]{{2, 1}, {1, 2}});
        System.out.println(r2.getSquare());
    }
}
