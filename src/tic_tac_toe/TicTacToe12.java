package tic_tac_toe;

public class TicTacToe12 {

    private int[] board = new int[9];
    private static final int[] START = new int[] { 0, 3, 6, 0, 1, 2, 0, 2 };
    private static final int[] INCR  = new int[] { 1, 1, 1, 3, 3, 3, 4, 2 };
    private static int SIZE = 3;

    /**
     * Determines if there is a winner in tic-tac-toe board.
     * @return {@code 0} for draw, {@code 1} for 'X', {@code -1} for 'Y'
     */
    public int hasWinner() {
        for (int i = 0; i < START.length; i++) {
            int sum = 0;
            for (int j = 0; j < SIZE; j++) {
                sum += board[START[i] + j * INCR[i]];
            }
            if (Math.abs(sum) == SIZE) {
                return sum / SIZE;
            }
        }
        return 0;
    }
}
