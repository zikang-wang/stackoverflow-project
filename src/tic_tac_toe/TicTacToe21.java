package tic_tac_toe;

public class TicTacToe21 {
    public static char checkWinner(char[][] array) {
        // check for row winners
        for (int row = 0; row < array.length; row++) {
            // if all three columns are the same then that player wins!
            if (array[row][0] == array[row][1] && array[row][1] == array[row][2]) {
                // return the winner!
                return array[row][0];
            }
        }

        // check for column winners
        for (int col = 0; col < array.length; col++) {
            // if all three rows are the same then that player wins!
            if (array[0][col] == array[1][col] && array[1][col] == array[2][col]) {
                // return our winner!
                return array[0][col];
            }
        }

        // check for diag winners
        if (array[0][0] == array[1][1] && array[1][1] == array[2][2]) {
            return array[0][0];
        }

        if (array[0][2] == array[1][1] && array[1][1] == array[2][0]) {
            return array[0][2];
        }

        // otherwise just return an empty character
        return ' ';
    }
}
