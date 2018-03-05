package tic_tac_toe;

public class TicTacToe16 {
    public static boolean checkWin(char symb, char[][] map) {
        int SIZE = 5;

        for (int i = 0; i < SIZE-1; i++) {
            for (int j = 0; j <SIZE-1 ; j++) {
                //vertical checking
                if (map[0][j] == symb && map[1][j] == symb && map[2][j] == symb && map[3][j] == symb && map[4][j] == symb) return true;      // j=0
            }
            //horisontal checking
            if(map[i][0] == symb && map[i][1] == symb && map[i][2] == symb && map[i][3] == symb && map[i][4] == symb) return true;  // i=0
        }
        //diagonal checking (5*5)
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb && map[3][3] == symb && map[4][4] == symb) return true;
        if (map[4][0] == symb && map[3][1] == symb && map[2][2] == symb && map[1][3] == symb && map[0][4] == symb) return true;

        return false;
    }
}
