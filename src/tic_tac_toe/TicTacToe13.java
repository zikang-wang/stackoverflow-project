package tic_tac_toe;

public class TicTacToe13 {
    private static final int NO_OF_DIAGONALS = 2;
    private static final int MINOR = 1;
    private static final int PRINCIPAL = 0;
    private final int gridSize;
    private final int[] rowTotal;
    private final int[] colTotal;
    private final int[] diagonalTotal;

    public TicTacToe13(int size) {
        gridSize = size;
        rowTotal = new int[size];
        colTotal = new int[size];
        diagonalTotal = new int[NO_OF_DIAGONALS];
    }

    private String isGameOver(int x, int y, char symbol, int moveCount) {
        if (isWinningMove(x, y, symbol))
            return symbol + " won the game!";
        if (isBoardCompletelyFilled(moveCount))
            return "Its a Draw!";
        return "continue";
    }

    private boolean isBoardCompletelyFilled(int moveCount) {
        return moveCount == gridSize * gridSize;
    }

    private boolean isWinningMove(int x, int y, char symbol) {
        if (isPrincipalDiagonal(x, y) && allSymbolsMatch(symbol, diagonalTotal, PRINCIPAL))
            return true;
        if (isMinorDiagonal(x, y) && allSymbolsMatch(symbol, diagonalTotal, MINOR))
            return true;
        return allSymbolsMatch(symbol, rowTotal, x) || allSymbolsMatch(symbol, colTotal, y);
    }

    private boolean allSymbolsMatch(char symbol, int[] total, int index) {
        total[index] += symbol;
        return total[index] / gridSize == symbol;
    }

    private boolean isPrincipalDiagonal(int x, int y) {
        return x == y;
    }

    private boolean isMinorDiagonal(int x, int y) {
        return x + y == gridSize - 1;
    }
}
