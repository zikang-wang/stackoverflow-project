package tic_tac_toe;

public class TicTacToe00 {
    public enum MarkType {
        X, O, $;
    }
    private MarkType board[][];
    private int bsize;
    public boolean isWinner(int passedRow, int passedCol, MarkType mark) {
        for (int col = 0; col < bsize; col++) {
            if (board[passedRow][col] != mark)
                break;
            if (col == bsize - 1) {
                return true;
            }
        }

        for (int row = 0; row < bsize; row++) {
            if (board[row][passedCol] != mark)
                break;
            if (row == bsize - 1) {
                return true;
            }
        }

        if (passedRow == passedCol) {
            for (int row = 0; row < bsize; row++) {
                if (board[row][row] != mark)
                    break;
                if (row == bsize - 1) {
                    return true;
                }
            }
        }

        if (passedRow + passedCol == bsize - 1) {
            for (int index = 0; index < bsize; index++) {
                if (board[index][(bsize - 1) - index] != mark)
                    break;
                if (index == bsize - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
