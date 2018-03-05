package tic_tac_toe;

public class TicTacToe01 {
    public char getWinner(char[][] board)
    {
        String[]win = new String[8];
        int x =0;
        for(int y =0; y < 8; y++)
        {
            win[y] = "";
        }

        for(int row = 0; row <3; row++)
        {
            for (int col = 0; col < 3; col++)
            {
                win[x] += board[row][col];
            }
            x++;
        }

        for(int col = 0; col <3; col++)
        {
            for (int row = 0; row < 3; row++)
            {
                win[x] += board[row][col];
            }
            x++;
        }

        win[x] += (board[0][2] + board[1][1] + board[2][0]);
        x++;
        win[x] += (board[0][0] + board[1][1] + board[2][2]);

        char winner = '-';
        for(int i = 0; i < 8; i++)
        {
            if (win[i].equals("XXX"))
            {
                winner = 'X';
            }
            if(win[i].equals("OOO"))
            {
                winner = 'O';
            }
        }
        return winner;
    }
}
