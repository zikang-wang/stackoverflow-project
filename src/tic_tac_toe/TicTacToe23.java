package tic_tac_toe;

public class TicTacToe23 {
    public int CheckIfWin(String[] Row, String Side) {
        /* Possible wins :-
         * Horzontal : ( 0=1=2 ), (3, 4, 5), (6, 7, 8)
         * Vertical : ( 0=3=6 ), (1=4=7), (2=5=8)
         * Croswards : (0=4=8 ), (2=4=6)
         */
        if(Row[0].equals(Row[1]) && Row[1].equals(Row[2])) {
            System.out.println(Side+" wins.");
            Row[0] = "--";Row[1] = "--";Row[2] = "--";
            return 1;
        } else if(Row[3].equals(Row[4]) && Row[4].equals(Row[5])) {
            System.out.println(Side+" wins.");
            Row[3] = "--";Row[4] = "--";Row[5] = "--";
            return 1;
        } else if(Row[6].equals(Row[7]) && Row[7].equals(Row[8])) {
            System.out.println(Side+" wins.");
            Row[6] = "--";Row[7] = "--";Row[8] = "--";
            return 1;
        } else if(Row[0].equals(Row[3]) && Row[3].equals(Row[6])) {
            System.out.println(Side+" wins.");
            Row[0] = "|";Row[3] = "|";Row[6] = "|";
            return 1;
        } else if(Row[1].equals(Row[4]) && Row[4].equals(Row[7])) {
            System.out.println(Side+" wins.");
            Row[1] = "|";Row[4] = "|";Row[7] = "|";
            return 1;
        } else if(Row[2].equals(Row[5]) && Row[5].equals(Row[8])) {
            System.out.println(Side+" wins.");
            Row[2] = "|";Row[5] = "|";Row[8] = "|";
            return 1;
        } else if(Row[0].equals(Row[4]) && Row[4].equals(Row[8])) {
            System.out.println(Side+" wins.");
            Row[0] = "\\";Row[4] = "\\";Row[8] = "\\";
            return 1;
        } else if(Row[2].equals(Row[4]) && Row[4].equals(Row[6])) {
            System.out.println(Side+" wins.");
            Row[2] = "/";Row[4] = "/";Row[6] = "/";
            return 1;
        }
        return 0;
    }
}
