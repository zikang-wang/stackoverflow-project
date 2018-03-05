package tic_tac_toe;

public class TicTacToe18 {

    final int NOUGHT = -1;
    final int CROSS = 1;
    public int winOrTie(int[][] gameboard) {

        //NOUGHT wins horizontal

        if (gameboard[0][0] == NOUGHT && gameboard[0][1] == NOUGHT && gameboard[0][2] == NOUGHT)
            return NOUGHT;
        else if (gameboard[1][0] == NOUGHT && gameboard[1][1] == NOUGHT && gameboard[1][2] == NOUGHT)
            return NOUGHT;
        else if (gameboard[2][0] == NOUGHT && gameboard[2][1] == NOUGHT && gameboard[2][2] == NOUGHT)
            return NOUGHT;

            //NOUGHT wins veritcal

        else if (gameboard[0][0] == NOUGHT && gameboard[1][0] == NOUGHT && gameboard[2][0] == NOUGHT)
            return NOUGHT;
        else if (gameboard[0][1] == NOUGHT && gameboard[1][1] == NOUGHT && gameboard[2][1] == NOUGHT)
            return NOUGHT;
        else if (gameboard[0][2] == NOUGHT && gameboard[1][2] == NOUGHT && gameboard[2][2] == NOUGHT)
            return NOUGHT;

            //NOUGHT wins diagonal

        else if (gameboard[0][0] == NOUGHT && gameboard[1][1] == NOUGHT && gameboard[2][2] == NOUGHT)
            return NOUGHT;
        else if (gameboard[0][2] == NOUGHT && gameboard[1][1] == NOUGHT && gameboard[2][0] == NOUGHT)
            return NOUGHT;

            //CROSS wins horizontal

        else if (gameboard[0][0] == CROSS && gameboard[0][1] == CROSS && gameboard[0][2] == CROSS)
            return CROSS;
        else if (gameboard[1][0] == CROSS && gameboard[1][1] == CROSS && gameboard[1][2] == CROSS)
            return CROSS;
        else if (gameboard[2][0] == CROSS && gameboard[2][1] == CROSS && gameboard[2][2] == CROSS)
            return CROSS;

            //CROSS wins veritcal

        else if (gameboard[0][0] == CROSS && gameboard[1][0] == CROSS && gameboard[2][0] == CROSS)
            return CROSS;
        else if (gameboard[0][1] == CROSS && gameboard[1][1] == CROSS && gameboard[2][1] == CROSS)
            return CROSS;
        else if (gameboard[0][2] == CROSS && gameboard[1][2] == CROSS && gameboard[2][2] == CROSS)
            return CROSS;

            //CROSS wins diagonal

        else if (gameboard [0][0] == CROSS && gameboard[1][1] == CROSS && gameboard[2][2] == CROSS)
            return CROSS;
        else if (gameboard [0][2] == CROSS && gameboard[1][1] == CROSS && gameboard[2][0] == CROSS)
            return CROSS;
        else
            return -2;
    }
}
