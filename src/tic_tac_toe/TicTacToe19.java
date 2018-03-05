package tic_tac_toe;

public class TicTacToe19 {
    public boolean hasWon(char[][] board, int i,int j,char player){
        if (board[i][0] == player         // 3-in-the-row
                && board[i][1] == player
                && board[i][2] == player
                || board[0][j] == player      // 3-in-the-column
                && board[1][j] == player
                && board[2][j] == player
                || i == j            // 3-in-the-diagonal
                && board[0][0] == player
                && board[1][1] == player
                && board[2][2] == player
                || i + j == 2  // 3-in-the-opposite-diagonal
                && board[0][2] == player
                && board[1][1] == player
                && board[2][0] == player)
            return true;
        return false;
    }
}
