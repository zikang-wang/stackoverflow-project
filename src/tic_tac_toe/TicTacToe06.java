package tic_tac_toe;

public class TicTacToe06 {
    public static boolean GameOver(char[][] board, int rMove, int cMove) {
        // Check perpendicular victory
        if (board[0][cMove] == board[1][cMove]
                && board[0][cMove] == board[2][cMove]) {
            return true;
        }
        if (board[rMove][0] == board[rMove][1]
                && board[rMove][0] == board[rMove][2]) {
            return true;
        }
        // Check diagonal victory
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]
                && board[1][1] != '_') {
            return true;
        }
        return false;

    }
}
