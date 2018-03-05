package tic_tac_toe;

public class TicTacToe15 {
    class Game {
        char piece;
        Game(char piece) {
            this.piece = piece;
        }
    }

    Game player1 = new Game('x');
    Game player2 = new Game('o');

    public boolean checkWin(char[] board, Game player) {

        // check horizontal win
        for (int i = 0; i <= 6; i += 3) {

            if (board[i] == player.piece &&
                    board[i + 1] == player.piece &&
                    board[i + 2] == player.piece)
                return true;
        }

        // check vertical win
        for (int i = 0; i <= 2; i++) {

            if (board[i] == player.piece &&
                    board[i + 3] == player.piece &&
                    board[i + 6] == player.piece)
                return true;
        }

        // check diagonal win
        if ((board[0] == player.piece &&
                board[4] == player.piece &&
                board[8] == player.piece) ||
                board[2] == player.piece &&
                        board[4] == player.piece &&
                        board[6] == player.piece)
            return true;
        return false;
    }
}
