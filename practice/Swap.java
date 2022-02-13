// Constraint satsifaction problem
// N-Queens Problem

public class Exp3 {
    final int N = 4;

    void solution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }

    boolean safe(int board[][], int row, int col) {
        int i, j;

        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    boolean util(int board[][], int col) {

        if (col >= N)
            return true;

        for (int i = 0; i < N; i++) {

            if (safe(board, i, col)) {

                board[i][col] = 1;

                if (util(board, col + 1) == true)
                    return true;

                board[i][col] = 0; // BACKTRACK
            }
        }

        return false;
    }

    boolean solveNQ() {
        int board[][] = { { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 } };

        if (util(board, 0) == false) {
            System.out.print("Solution does not exist");
            return false;
        }

        solution(board);
        return true;
    }

    public static void main(String args[]) {
        Exp3 Queen = new Exp3();
        Queen.solveNQ();
    }
}
