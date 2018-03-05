package tic_tac_toe;

public class TicTacToe22 {
    public static char checkWinner(char[][] array) {
        int[][] combinations = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
                {0, 3, 6},
                {1, 4, 7},
                {2, 5, 8},
                {0, 4, 8},
                {2, 4, 6}
        };
        for (int[] co : combinations) {
            char[] cs = new char[] {
                    array[co[0] % 3][co[0] / 3],
                    array[co[1] % 3][co[1] / 3],
                    array[co[2] % 3][co[2] / 3]
            };
            if (cs[0] != ' ' && cs[0] == cs[1] && cs[1] == cs[2]) {
                return cs[0];
            }
        }
        return ' ';
    }
}
