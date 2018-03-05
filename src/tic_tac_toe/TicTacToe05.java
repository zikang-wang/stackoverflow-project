package tic_tac_toe;

public class TicTacToe05 {
    boolean player_can_win(int board[], int value) { //value is side's element*2
        return board[0] + board[1] + board[2] == value
                || board[3] + board[4] + board[5] == value
                || board[6] + board[7] + board[8] == value
                || board[0] + board[3] + board[6] == value
                || board[1] + board[4] + board[7] == value
                || board[2] + board[5] + board[8] == value
                || board[0] + board[4] + board[8] == value
                || board[2] + board[4] + board[6] == value;
    }
}
