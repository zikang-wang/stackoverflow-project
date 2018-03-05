package tic_tac_toe;

public class TicTacToe07 {
    public boolean check(String[] [] board)
    {
        int j = 0;
        for(int i = 0; i < board.length;i++) //row
        {
            if(board[i][j] == "X" || board[i][j+1] == "X" || board[i][j+2] == "X")
            {
                if(board[i][j] == board[i][j+1] & board[i][j] == board[i][j+2])
                {
                    System.out.println("X wins!");
                    return true;
                }
            }
        }
        int e = 0;
        for(j = 0; j < board.length;j++) //col
        {
            if(board[e][j] == "X" | board[e + 1][j] == "X"  | board[e + 2][j] == "X" )
            {
                if(board[e][j] == board[e + 1][j] & board[e][j] == board[e + 2][j])
                {
                    System.out.println("X, wins");
                    return true;
                }
            }
        }
        int d = 0;
        for(int ii = 0; ii < board.length; ii++) //diag
        {
            if(board[d][ii] != null || board[d + 1][ii] != null | board[d + 2][ii] != null)
            {
                if(board[d][ii] == board[d + 1][ii+1] & board[d][ii] == board[d + 2][ii])
                {
                    System.out.println("X, wins dig");
                    return true;
                }
            }
        }
        int k = 0;
        for(int i = 0; i < board.length;i++) //row
        {
            if(board[i][k] == "O" || board[i][k+1] == "O" || board[i][k+2] == "O")
            {
                if(board[i][k] == board[i][k+1] & board[i][k] == board[i][k+2])
                {
                    System.out.println("O wins!");
                    return true;
                }
            }
        }
        int z = 0;
        for(k = 0; k < board.length; k++) //col
        {
            if(board[z][k] == "O" | board[z + 1][k] == "O"  | board[z + 2][k] == "O" )
            {
                if(board[z][k] == board[z + 1][k] & board[z][k] == board[z + 2][k])
                {
                    System.out.println("O, wins");
                    return true;
                }
            }
        }

        return false;
    }
}
