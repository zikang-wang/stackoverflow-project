package tic_tac_toe;

public class TicTacToe03 {
    public boolean winner(char[][] board, int lastR, int lastC)  {

        boolean winner = false; // no winner
        char symbol = board[lastR][lastC]; //last made mark

        //check left-right
        int numFound = 0;
        for(int c = 0; c < 3; c++)  {
            if(board[lastR][c] == symbol)
                numFound++;
        }

        if(numFound == 3)
            winner = true;

        //check up-down
        numFound = 0;
        for(int r = 0; r < 3; r++)  {
            if(board[r][lastC] == symbol)
                numFound++;
        }

        if(numFound == 3)
            winner = true;

        //check both diagonals
        numFound = 0;
        for(int i = 0; i < 3; i++)  {
            if(board[i][i] == symbol)
                numFound++;
        }

        if(numFound == 3)
            winner = true;

        numFound = 0;
        for(int i = 0; i < 3; i++)  {
            if(board[i][2-i] == symbol)
                numFound++;
        }

        if(numFound == 3)
            winner = true;

        return winner;
    }

}
