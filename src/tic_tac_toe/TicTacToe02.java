package tic_tac_toe;

public class TicTacToe02 {
    private boolean Spieler2gewonnen(int[][] feld1) {
        if ((feld1[0][0] & feld1[0][1] & feld1[0][2]) == 2
                | (feld1[1][0] & feld1[1][1] & feld1[1][2]) == 2
                | (feld1[2][0] & feld1[2][1] & feld1[2][2]) == 2
                | (feld1[0][0] & feld1[1][1] & feld1[2][2]) == 2
                | (feld1[0][2] & feld1[1][1] & feld1[2][0]) == 2
                | (feld1[0][0] & feld1[1][0] & feld1[2][0]) == 2
                | (feld1[0][1] & feld1[1][1] & feld1[2][1]) == 2
                | (feld1[0][2] & feld1[1][2] & feld1[2][2]) == 2) {
            return true;
        }
        return false;
    }
}
