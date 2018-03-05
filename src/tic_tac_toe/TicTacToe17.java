package tic_tac_toe;

public class TicTacToe17 {
    public static boolean winner(char[][] board, int move1, int move2) {
        if(board[0][move2] == board[1][move2] && board[0][move2] == board[2][move2])
            return true;
        if(board[move1][0] == board[move1][1] && board[move1][0] == board[move1][2])
            return true;
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[1][1] != '_')
            return true;
        if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[1][1] != '_')
            return true;
        return false;
    }
}
