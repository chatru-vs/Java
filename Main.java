import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] queens = new int[n];
        solveNQueensHelper(result, queens, 0, n);
        return result;
    }

    private void solveNQueensHelper(List<List<String>> result, int[] queens, int row, int n) {
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (queens[i] == j) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                solution.add(sb.toString());
            }
            result.add(solution);
        } else {
            for (int i = 0; i < n; i++) {
                queens[row] = i;
                if (isValid(queens, row)) {
                    solveNQueensHelper(result, queens, row + 1, n);
                }
            }
        }
    }

    private boolean isValid(int[] queens, int row) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == queens[row]) {
                return false;
            }
            if (Math.abs(queens[i] - queens[row]) == row - i) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Main nQueens = new Main();
        List<List<String>> solutions = nQueens.solveNQueens(4);
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

}
