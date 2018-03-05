package tic_tac_toe;

public class TicTacToe14 {
    boolean isWinner(short X) {
        for (int i = 0; i < 8; i++)
            if ((X & winCombinations[i]) == winCombinations[i])
                return true;
        return false;
    }

    short[] winCombinations = new short[]{
            7, 7 << 3, 7 << 6, // horizontal
            73, 73 << 1, 73 << 2, // vertical
            273, // diagonal
            84   // anti-diagonal
    };
}
