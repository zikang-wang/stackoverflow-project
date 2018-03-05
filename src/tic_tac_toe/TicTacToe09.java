package tic_tac_toe;

public class TicTacToe09 {
    public boolean GameOver(char[][] board, int xToken,int oToken) {
        // Check perpendicular victory
        if (board[0][oToken] == board[1][oToken]
                && board[0][oToken] == board[2][oToken])
            return true;
        if (board[xToken][0] == board[xToken][1]
                && board[xToken][0] == board[xToken][2])
            return true;
        // Check diagonal victory
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]
                && board[1][1] != '_')
            return true;
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0]
                && board[1][1] != '_')
            return true;
        return false;
    }
}
