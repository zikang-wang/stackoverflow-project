package tic_tac_toe;

public class TicTacToe10 {
    public enum Square { X, O, NONE }

    /**
     * Returns the winning player, or NONE if the game has
     * finished without a winner, or null if the game is unfinished.
     */
    public Square findWinner(Square[][] board, int lengthToWin) {
        // Check each lengthToWin x lengthToWin board for a winner.
        for (int top = 0; top <= board.length - lengthToWin; ++top) {
            int bottom = top + lengthToWin - 1;

            for (int left = 0; left <= board.length - lengthToWin; ++left) {
                int right = left + lengthToWin - 1;

                // Check each row.
                nextRow: for (int row = top; row <= bottom; ++row) {
                    if (board[row][left] == Square.NONE) {
                        continue;
                    }

                    for (int col = left; col <= right; ++col) {
                        if (board[row][col] != board[row][left]) {
                            continue nextRow;
                        }
                    }

                    return board[row][left];
                }

                // Check each column.
                nextCol: for (int col = left; col <= right; ++col) {
                    if (board[top][col] == Square.NONE) {
                        continue;
                    }

                    for (int row = top; row <= bottom; ++row) {
                        if (board[row][col] != board[top][col]) {
                            continue nextCol;
                        }
                    }

                    return board[top][col];
                }

                // Check top-left to bottom-right diagonal.
                diag1: if (board[top][left] != Square.NONE) {
                    for (int i = 1; i < lengthToWin; ++i) {
                        if (board[top+i][left+i] != board[top][left]) {
                            break diag1;
                        }
                    }

                    return board[top][left];
                }

                // Check top-right to bottom-left diagonal.
                diag2: if (board[top][right] != Square.NONE) {
                    for (int i = 1; i < lengthToWin; ++i) {
                        if (board[top+i][right-i] != board[top][right]) {
                            break diag2;
                        }
                    }

                    return board[top][right];
                }
            }
        }

        // Check for a completely full board.
        boolean isFull = true;

        full: for (int row = 0; row < board.length; ++row) {
            for (int col = 0; col < board.length; ++col) {
                if (board[row][col] == Square.NONE) {
                    isFull = false;
                    break full;
                }
            }
        }

        // The board is full.
        if (isFull) {
            return Square.NONE;
        }
        // The board is not full and we didn't find a solution.
        else {
            return null;
        }
    }
}
